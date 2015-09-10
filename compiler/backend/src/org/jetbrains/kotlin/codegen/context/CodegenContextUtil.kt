/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.codegen.context

import org.jetbrains.kotlin.codegen.AsmUtil
import org.jetbrains.org.objectweb.asm.Type


public object CodegenContextUtil {
    public @JvmStatic fun getImplClassTypeByOwnerIfRequired(owner: CodegenContext<*>): Type? =
            when (owner) {
                is PackageFacadeContext ->
                        owner.delegateToClassType
                is PackageContext ->
                        owner.packagePartType
                is MultifileClassOrPartContext ->
                        owner.filePartType
                else ->
                        null
            }

    public @JvmStatic fun getImplClassNameByOwnerIfRequired(owner: CodegenContext<*>): String? =
            getImplClassTypeByOwnerIfRequired(owner)?.let{ AsmUtil.shortNameByAsmType(it) }

    public @JvmStatic fun isImplClassOwner(owner: CodegenContext<*>): Boolean =
            !(owner is PackageFacadeContext || owner is MultifileClassContext)
}
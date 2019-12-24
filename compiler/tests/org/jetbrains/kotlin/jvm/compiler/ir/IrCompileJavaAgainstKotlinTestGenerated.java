/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/compileJavaAgainstKotlin")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrCompileJavaAgainstKotlinTestGenerated extends AbstractIrCompileJavaAgainstKotlinTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInWithoutJavac() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/annotation")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotation extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInAnnotation() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/annotation"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("retention.kt")
        public void testRetention() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/annotation/retention.kt");
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/callableReference")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CallableReference extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInCallableReference() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/callableReference"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("GenericSignature.kt")
        public void testGenericSignature() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/callableReference/GenericSignature.kt");
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/class")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Class extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInClass() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/class"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/ClassObject.kt");
        }

        @TestMetadata("DefaultConstructor.kt")
        public void testDefaultConstructor() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/DefaultConstructor.kt");
        }

        @TestMetadata("DefaultConstructorWithTwoArgs.kt")
        public void testDefaultConstructorWithTwoArgs() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/DefaultConstructorWithTwoArgs.kt");
        }

        @TestMetadata("ExtendsAbstractListT.kt")
        public void testExtendsAbstractListT() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/ExtendsAbstractListT.kt");
        }

        @TestMetadata("ImplementsListString.kt")
        public void testImplementsListString() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/ImplementsListString.kt");
        }

        @TestMetadata("ImplementsMapPP.kt")
        public void testImplementsMapPP() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/ImplementsMapPP.kt");
        }

        @TestMetadata("InnerClass.kt")
        public void testInnerClass() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/InnerClass.kt");
        }

        @TestMetadata("InnerClassConstructors.kt")
        public void testInnerClassConstructors() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/InnerClassConstructors.kt");
        }

        @TestMetadata("InnerClassOfGeneric.kt")
        public void testInnerClassOfGeneric() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/InnerClassOfGeneric.kt");
        }

        @TestMetadata("kt3561.kt")
        public void testKt3561() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/kt3561.kt");
        }

        @TestMetadata("kt4050.kt")
        public void testKt4050() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/kt4050.kt");
        }

        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/Simple.kt");
        }

        @TestMetadata("StarProjection.kt")
        public void testStarProjection() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/class/StarProjection.kt");
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/enum")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Enum extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInEnum() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/enum"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("DefaultArgumentInEnumConstructor.kt")
        public void testDefaultArgumentInEnumConstructor() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/enum/DefaultArgumentInEnumConstructor.kt");
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/jvmStatic")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class JvmStatic extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInJvmStatic() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/jvmStatic"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("simpleCompanionObject.kt")
        public void testSimpleCompanionObject() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/jvmStatic/simpleCompanionObject.kt");
        }

        @TestMetadata("simpleCompanionObjectProperty.kt")
        public void testSimpleCompanionObjectProperty() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/jvmStatic/simpleCompanionObjectProperty.kt");
        }

        @TestMetadata("simpleObject.kt")
        public void testSimpleObject() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/jvmStatic/simpleObject.kt");
        }

        @TestMetadata("simpleObjectProperty.kt")
        public void testSimpleObjectProperty() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/jvmStatic/simpleObjectProperty.kt");
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Method extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        @TestMetadata("AccessorGenericSignature.kt")
        public void testAccessorGenericSignature() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/AccessorGenericSignature.kt");
        }

        public void testAllFilesPresentInMethod() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("Any.kt")
        public void testAny() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/Any.kt");
        }

        @TestMetadata("ArrayOfIntArray.kt")
        public void testArrayOfIntArray() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/ArrayOfIntArray.kt");
        }

        @TestMetadata("ArrayOfIntegerArray.kt")
        public void testArrayOfIntegerArray() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/ArrayOfIntegerArray.kt");
        }

        @TestMetadata("ClashingSignaturesWithoutReturnType.kt")
        public void testClashingSignaturesWithoutReturnType() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/ClashingSignaturesWithoutReturnType.kt");
        }

        @TestMetadata("Delegation.kt")
        public void testDelegation() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/Delegation.kt");
        }

        @TestMetadata("Extensions.kt")
        public void testExtensions() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/Extensions.kt");
        }

        @TestMetadata("GenericArray.kt")
        public void testGenericArray() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/GenericArray.kt");
        }

        @TestMetadata("Hello.kt")
        public void testHello() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/Hello.kt");
        }

        @TestMetadata("Int.kt")
        public void testInt() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/Int.kt");
        }

        @TestMetadata("IntArray.kt")
        public void testIntArray() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/IntArray.kt");
        }

        @TestMetadata("IntWithDefault.kt")
        public void testIntWithDefault() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/IntWithDefault.kt");
        }

        @TestMetadata("IntegerArray.kt")
        public void testIntegerArray() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/IntegerArray.kt");
        }

        @TestMetadata("ListOfInt.kt")
        public void testListOfInt() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/ListOfInt.kt");
        }

        @TestMetadata("ListOfString.kt")
        public void testListOfString() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/ListOfString.kt");
        }

        @TestMetadata("ListOfT.kt")
        public void testListOfT() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/ListOfT.kt");
        }

        @TestMetadata("MapOfKString.kt")
        public void testMapOfKString() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/MapOfKString.kt");
        }

        @TestMetadata("MapOfStringIntQ.kt")
        public void testMapOfStringIntQ() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/MapOfStringIntQ.kt");
        }

        @TestMetadata("QExtendsListString.kt")
        public void testQExtendsListString() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/QExtendsListString.kt");
        }

        @TestMetadata("QExtendsString.kt")
        public void testQExtendsString() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/QExtendsString.kt");
        }

        @TestMetadata("TraitImpl.kt")
        public void testTraitImpl() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/TraitImpl.kt");
        }

        @TestMetadata("TypeParamInInner.kt")
        public void testTypeParamInInner() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/TypeParamInInner.kt");
        }

        @TestMetadata("Vararg.kt")
        public void testVararg() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/Vararg.kt");
        }

        @TestMetadata("Void.kt")
        public void testVoid() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/method/Void.kt");
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method/platformName")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PlatformName extends AbstractIrCompileJavaAgainstKotlinTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInPlatformName() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method/platformName"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("PlatformName.kt")
            public void testPlatformName() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/platformName/PlatformName.kt");
            }
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PrimitiveOverride extends AbstractIrCompileJavaAgainstKotlinTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInPrimitiveOverride() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("ByteOverridesObject.kt")
            public void testByteOverridesObject() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/ByteOverridesObject.kt");
            }

            @TestMetadata("CallFinalNotInSubclass.kt")
            public void testCallFinalNotInSubclass() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/CallFinalNotInSubclass.kt");
            }

            @TestMetadata("CallNotInSubclass.kt")
            public void testCallNotInSubclass() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/CallNotInSubclass.kt");
            }

            @TestMetadata("CovariantReturnTypeOverride.kt")
            public void testCovariantReturnTypeOverride() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/CovariantReturnTypeOverride.kt");
            }

            @TestMetadata("FinalOverride.kt")
            public void testFinalOverride() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/FinalOverride.kt");
            }

            @TestMetadata("IntOverridesComparable.kt")
            public void testIntOverridesComparable() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/IntOverridesComparable.kt");
            }

            @TestMetadata("IntOverridesNumber.kt")
            public void testIntOverridesNumber() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/IntOverridesNumber.kt");
            }

            @TestMetadata("IntOverridesObject.kt")
            public void testIntOverridesObject() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/IntOverridesObject.kt");
            }

            @TestMetadata("ManyClassesHierarchy.kt")
            public void testManyClassesHierarchy() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/ManyClassesHierarchy.kt");
            }

            @TestMetadata("NullableIntOverridesObject.kt")
            public void testNullableIntOverridesObject() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/NullableIntOverridesObject.kt");
            }

            @TestMetadata("OverrideInJava.kt")
            public void testOverrideInJava() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/OverrideInJava.kt");
            }
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverrideWithInlineClass")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PrimitiveOverrideWithInlineClass extends AbstractIrCompileJavaAgainstKotlinTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInPrimitiveOverrideWithInlineClass() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverrideWithInlineClass"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("InlineIntOverridesObject.kt")
            public void testInlineIntOverridesObject() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverrideWithInlineClass/InlineIntOverridesObject.kt");
            }
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Throws extends AbstractIrCompileJavaAgainstKotlinTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInThrows() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method/throws"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("ClassMembers.kt")
            public void testClassMembers() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/throws/ClassMembers.kt");
            }

            @TestMetadata("Constructor.kt")
            public void testConstructor() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/throws/Constructor.kt");
            }

            @TestMetadata("DefaultArgs.kt")
            public void testDefaultArgs() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/throws/DefaultArgs.kt");
            }

            @TestMetadata("Delegation.kt")
            public void testDelegation() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/throws/Delegation.kt");
            }

            @TestMetadata("GenericSubstitution.kt")
            public void testGenericSubstitution() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/throws/GenericSubstitution.kt");
            }

            @TestMetadata("TopLevel.kt")
            public void testTopLevel() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/throws/TopLevel.kt");
            }

            @TestMetadata("TraitMembers.kt")
            public void testTraitMembers() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/method/throws/TraitMembers.kt");
            }
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/property")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Property extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInProperty() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/property"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("ConstVal.kt")
        public void testConstVal() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/property/ConstVal.kt");
        }

        @TestMetadata("Extensions.kt")
        public void testExtensions() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/property/Extensions.kt");
        }

        @TestMetadata("GenericProperty.kt")
        public void testGenericProperty() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/property/GenericProperty.kt");
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/property/platformName")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PlatformName extends AbstractIrCompileJavaAgainstKotlinTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInPlatformName() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/property/platformName"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("PlatformName.kt")
            public void testPlatformName() throws Exception {
                runTest("compiler/testData/compileJavaAgainstKotlin/property/platformName/PlatformName.kt");
            }
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/sealed")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Sealed extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInSealed() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/sealed"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("Derived.kt")
        public void testDerived() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/sealed/Derived.kt");
        }

        @TestMetadata("Instance.kt")
        public void testInstance() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/sealed/Instance.kt");
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/staticFields")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class StaticFields extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInStaticFields() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/staticFields"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("AnnotationClass.kt")
        public void testAnnotationClass() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/staticFields/AnnotationClass.kt");
        }

        @TestMetadata("AnnotationTrait.kt")
        public void testAnnotationTrait() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/staticFields/AnnotationTrait.kt");
        }

        @TestMetadata("kt3698.kt")
        public void testKt3698() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/staticFields/kt3698.kt");
        }

        @TestMetadata("staticClassProperty.kt")
        public void testStaticClassProperty() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/staticFields/staticClassProperty.kt");
        }

        @TestMetadata("staticTraitProperty.kt")
        public void testStaticTraitProperty() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/staticFields/staticTraitProperty.kt");
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/targets")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Targets extends AbstractIrCompileJavaAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithoutJavac, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInTargets() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/targets"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("annotation.kt")
        public void testAnnotation() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/annotation.kt");
        }

        @TestMetadata("base.kt")
        public void testBase() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/base.kt");
        }

        @TestMetadata("classifier.kt")
        public void testClassifier() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/classifier.kt");
        }

        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/constructor.kt");
        }

        @TestMetadata("empty.kt")
        public void testEmpty() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/empty.kt");
        }

        @TestMetadata("field.kt")
        public void testField() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/field.kt");
        }

        @TestMetadata("function.kt")
        public void testFunction() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/function.kt");
        }

        @TestMetadata("getter.kt")
        public void testGetter() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/getter.kt");
        }

        @TestMetadata("local.kt")
        public void testLocal() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/local.kt");
        }

        @TestMetadata("multiple.kt")
        public void testMultiple() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/multiple.kt");
        }

        @TestMetadata("parameter.kt")
        public void testParameter() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/parameter.kt");
        }

        @TestMetadata("property.kt")
        public void testProperty() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/property.kt");
        }

        @TestMetadata("setter.kt")
        public void testSetter() throws Exception {
            runTest("compiler/testData/compileJavaAgainstKotlin/targets/setter.kt");
        }
    }
}

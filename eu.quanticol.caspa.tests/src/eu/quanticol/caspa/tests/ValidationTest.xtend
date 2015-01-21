package eu.quanticol.caspa.tests

import com.google.inject.Inject
import eu.quanticol.CASPAInjectorProvider
import eu.quanticol.cASPA.CASPAPackage
import eu.quanticol.cASPA.Model
import eu.quanticol.validation.CASPAValidator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CASPAInjectorProvider))
class ValidationTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testCheckNotSelfReferencing(){
		'''
		i = i;
		P = P;
		(P,{i});
		'''.parse.assertError(CASPAPackage::eINSTANCE.referencedStore,
			CASPAValidator::SELF_REFERENCING_STORE,
			"Cannot have self referencing stores. 'i' is seen in the expression"
		)
	}
	
	@Test
	def void testCheckStoresNamesUnique(){
		'''
		i = 10;
		i = 0.1;
		P = P;
		(P,{i});
		'''.parse.assertError(CASPAPackage::eINSTANCE.store,
			CASPAValidator::STORE_NAMES_UNIQUE,
			"Must have unique store names. 'i' is repeated"
		)
	}
	
	@Test
	def void testCheckProcessNamesUnique(){
		'''
		i = 10;
		P = P;
		P = P;
		(P,{i});
		'''.parse.assertError(CASPAPackage::eINSTANCE.process,
			CASPAValidator::PROCESS_NAMES_UNIQUE,
			"Must have unique process names. 'P' is repeated"
		)
	}
	
	@Test
	def void testReferencing(){
		'''
		a = 1.0;
		b = !a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.not,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionReference(){
		'''
		a = 1.0;
		b = 3.0;
		P = c[$x;](this.b := $y;){this.b := !a;}.P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionNot,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testOr(){
		'''
		a = 1.0;
		b = true || a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.or,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionOr(){
		'''
		a = 1.0;
		b = true;
		P = c[$x == (a || b);]($y;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionOr,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testAnd(){
		'''
		a = 1.0;
		b = true && a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.and,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionAnd(){
		'''
		a = 1.0;
		b = true;
		P = c[(a && b);]($y;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionAnd,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	def void testEq(){
		'''
		a = 1.0;
		b = true == a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.equality,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionEq(){
		'''
		a = 1.0;
		b = true;
		P = c[$x == a;]($y;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionEquality,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	def void testEq1(){
		'''
		a = 1.0;
		b = true != a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.equality,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	@Test
	def void testActionEq1(){
		'''
		a = 1.0;
		b = true;
		P = c[$x != a;]($y;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionEquality,
			CASPAValidator::WRONG_TYPE,
			"Expected boolean type, but was double"
		)
	}
	
	
	def void testCom1(){
		'''
		a = 1.0;
		b = true < a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.comparison,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionCom1(){
		'''
		a = true;
		b = true;
		P = c[$x < a;]($y;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionComparison,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	def void testSub1(){
		'''
		a = 1.0;
		b = true - a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.sub,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionSub1(){
		'''
		a = true;
		b = true;
		P = c(this.b := $y - a;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionSub,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	def void testPlu1(){
		'''
		a = 1.0;
		b = true - a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.plu,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionPlu1(){
		'''
		a = true;
		b = true;
		P = c(this.b := $y + a;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionPlu,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testMul1(){
		'''
		a = 1.0;
		b = true * a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.mul,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionMul1(){
		'''
		a = true;
		b = true;
		P = c(this.b := $y * a;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionMul,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testDiv1(){
		'''
		a = 1.0;
		b = true / a;
		P = nil;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.div,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testActionDiv1(){
		'''
		a = true;
		b = true;
		P = c(this.b := $y / a;).P;
		(P,{b});
		'''.parse.assertError(CASPAPackage::eINSTANCE.actionDiv,
			CASPAValidator::WRONG_TYPE,
			"Expected double type, but was boolean"
		)
	}
	
	@Test
	def void testUpdateExpression1(){
		'''
		z = 0.2;
		P = c{this.z := boolean;}.P;
		(P,{z});
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpression,
			CASPAValidator::WRONG_TYPE,
			"assignment has non matching type to reference"
		)
	}
	
	@Test
	def void testUpdateExpression2(){
		'''
		z = 0.2;
		P = c{z := boolean;}.P;
		(P,{z});
		'''.parse.assertError(CASPAPackage::eINSTANCE.updateExpression,
			CASPAValidator::WRONG_TYPE,
			"assignment has non matching type to reference"
		)
	}
	
	@Test
	def void testPredicateExpression1(){
		'''
		z = 0.2;
		P = c[1.0].P;
		(P,{z});
		'''.parse.assertError(CASPAPackage::eINSTANCE.predicateExpression,
			CASPAValidator::WRONG_TYPE,
			"Predicates must be boolean"
		)
	}	
	
	@Test
	def void testLocalEvalIn(){
		'''
		z = 0.2;
		P = c(this.z := false).P;
		(P,{z});
		'''.parse.assertError(CASPAPackage::eINSTANCE.evaluationExpressionIn,
			CASPAValidator::WRONG_TYPE,
			"bad assignment, check types and references"
		)
	}
	
	@Test
	def void testGlobalEvalIn(){
		'''
		z = 0.2;
		P = c(this.z := false).P;
		(P,{z});
		'''.parse.assertError(CASPAPackage::eINSTANCE.evaluationExpressionIn,
			CASPAValidator::WRONG_TYPE,
			"bad assignment, check types and references"
		)
	}
	
	@Test
	def void testFreeEvalOut(){
		'''
		z = 0.2;
		P = c<$z := Pello;>.P;
		(P,{z});
		'''.parse.assertError(CASPAPackage::eINSTANCE.freeEvaluationExpression,
			CASPAValidator::WRONG_TYPE,
			"bad assignment, check types and references"
		)
	}
	
//	@Test
//	def void testFreeEvalIn(){
//		'''
//		a = 0.1;
//		P = c(this.a := $y;).P;
//		(P,{a});
//		'''.parse.assertError(CASPAPackage::eINSTANCE.evaluationExpressionIn,
//			CASPAValidator::WRONG_TYPE,
//			"bad assignment, check types and references"
//		)
//	}
	
	
}
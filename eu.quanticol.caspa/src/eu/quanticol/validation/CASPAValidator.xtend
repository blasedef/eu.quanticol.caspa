/*
 * generated by Xtext
 */
package eu.quanticol.validation

import com.google.inject.Inject
import eu.quanticol.cASPA.CASPAPackage
import eu.quanticol.cASPA.LocalSingleEventUpdate
import eu.quanticol.cASPA.Model
import eu.quanticol.cASPA.Predicate
import eu.quanticol.cASPA.PredicateAnd
import eu.quanticol.cASPA.PredicateComparison
import eu.quanticol.cASPA.PredicateDiv
import eu.quanticol.cASPA.PredicateEquality
import eu.quanticol.cASPA.PredicateExpression
import eu.quanticol.cASPA.PredicateMul
import eu.quanticol.cASPA.PredicateNot
import eu.quanticol.cASPA.PredicateOr
import eu.quanticol.cASPA.PredicatePlu
import eu.quanticol.cASPA.PredicateSub
import eu.quanticol.cASPA.Process
import eu.quanticol.cASPA.UpdateDiv
import eu.quanticol.cASPA.UpdateExpression
import eu.quanticol.cASPA.UpdateMul
import eu.quanticol.cASPA.UpdatePlu
import eu.quanticol.cASPA.UpdateSub
import eu.quanticol.typing.BaseType
import eu.quanticol.typing.TypeProvider
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check

import static org.eclipse.xtext.EcoreUtil2.*

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class CASPAValidator extends AbstractCASPAValidator  {
	
	@Inject extension TypeProvider
	
	public static val WRONG_TYPE = "eu.quanticol.WrongType"
	public static val PROCESS_NAMES_UNIQUE = "eu.quanticol.processNamesUnique"
	public static val FREE_VARIABLES_UNIQUE = "eu.quanticol.freeVariablesUnique"
	
	@Check
	def checkProcessNamesUnique(Process process){
		
		var processes = getContainerOfType(process, typeof(Model)).processes
		
		var count = 0
		
		for(proc : processes)
			if(proc.name.equals(process.name))
				count = count + 1
				
		if(count == 1)
			return
		else 
			error("Must have unique process names. '" + process.name + "' is repeated",
				CASPAPackage::eINSTANCE.process_Name,
				PROCESS_NAMES_UNIQUE
			)
			
	}
	
	@Check
	def checkType(Predicate predicate){
		checkExpectedBoolean(predicate.predicate, CASPAPackage.Literals::PREDICATE__PREDICATE)
	}
	
	@Check
	def checkType(PredicateOr p){
		checkExpectedBoolean(p.left, CASPAPackage.Literals::PREDICATE_OR__LEFT)
		checkExpectedBoolean(p.right, CASPAPackage.Literals::PREDICATE_OR__RIGHT)
	}
	
	@Check
	def checkType(PredicateAnd p){
		checkExpectedBoolean(p.left, CASPAPackage.Literals::PREDICATE_AND__LEFT)
		checkExpectedBoolean(p.right, CASPAPackage.Literals::PREDICATE_AND__RIGHT)
	}
	
	@Check
	def checkType(PredicateEquality p){
		checkExpectedInt(p.left, CASPAPackage.Literals::PREDICATE_EQUALITY__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::PREDICATE_EQUALITY__RIGHT)
	}
	
	@Check
	def checkType(PredicateComparison p){
		checkExpectedInt(p.left, CASPAPackage.Literals::PREDICATE_COMPARISON__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::PREDICATE_COMPARISON__RIGHT)
	}
	
	@Check
	def checkType(PredicateSub p){
		checkExpectedInt(p.left, CASPAPackage.Literals::PREDICATE_SUB__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::PREDICATE_SUB__RIGHT)
	}
	
	
	@Check
	def checkType(PredicatePlu p){
		checkExpectedInt(p.left, CASPAPackage.Literals::PREDICATE_PLU__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::PREDICATE_PLU__RIGHT)
	}
	
	
	@Check
	def checkType(PredicateMul p){
		checkExpectedInt(p.left, CASPAPackage.Literals::PREDICATE_MUL__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::PREDICATE_MUL__RIGHT)
	}	
	
	@Check
	def checkType(PredicateDiv p){
		checkExpectedInt(p.left, CASPAPackage.Literals::PREDICATE_DIV__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::PREDICATE_DIV__RIGHT)
	}	
	
	@Check
	def checkType(PredicateNot p){
		checkExpectedBoolean(p.expression, CASPAPackage.Literals::PREDICATE_NOT__EXPRESSION)
	}	
	
	
	def private checkExpectedBoolean(PredicateExpression exp, EReference reference) {
		checkExpectedType(exp, TypeProvider::boolConstantType, reference)
	}

	def private checkExpectedInt(PredicateExpression exp, EReference reference) {
		checkExpectedType(exp, TypeProvider::constantType, reference)
	}

	def private checkExpectedType(PredicateExpression exp,
			BaseType expectedType, EReference reference) {
				
		val actualType = getTypeAndCheckNotNull(exp, reference)
		if (actualType != expectedType)
			error("expected " + expectedType + " type, but was " + actualType,
					reference, WRONG_TYPE)
	}
	
	def private BaseType getTypeAndCheckNotNull(PredicateExpression exp,
			EReference reference) {
		var type = exp?.typeFor
		if (type == null)
			error("null type", reference, WRONG_TYPE)
		return type;
	}
	
	@Check
	def checkType(LocalSingleEventUpdate update){
		checkExpectedInt(update.expression, CASPAPackage.Literals::LOCAL_SINGLE_EVENT_UPDATE__EXPRESSION)
	}
	

	@Check
	def checkType(UpdateSub p){
		checkExpectedInt(p.left, CASPAPackage.Literals::UPDATE_SUB__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::UPDATE_SUB__RIGHT)
	}
	
	
	@Check
	def checkType(UpdatePlu p){
		checkExpectedInt(p.left, CASPAPackage.Literals::UPDATE_PLU__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::UPDATE_PLU__RIGHT)
	}
	
	
	@Check
	def checkType(UpdateMul p){
		checkExpectedInt(p.left, CASPAPackage.Literals::UPDATE_MUL__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::UPDATE_MUL__RIGHT)
	}	
	
	@Check
	def checkType(UpdateDiv p){
		checkExpectedInt(p.left, CASPAPackage.Literals::UPDATE_DIV__LEFT)
		checkExpectedInt(p.right, CASPAPackage.Literals::UPDATE_DIV__RIGHT)
	}		

	def private checkExpectedInt(UpdateExpression exp, EReference reference) {
		checkExpectedType(exp, TypeProvider::constantType, reference)
	}

	def private checkExpectedType(UpdateExpression exp,
			BaseType expectedType, EReference reference) {
				
		val actualType = getTypeAndCheckNotNull(exp, reference)
		if (actualType != expectedType)
			error("expected " + expectedType + " type, but was " + actualType,
					reference, WRONG_TYPE)
	}
	
	def private BaseType getTypeAndCheckNotNull(UpdateExpression exp,
			EReference reference) {
		var type = exp?.typeFor
		if (type == null)
			error("null type", reference, WRONG_TYPE)
		return type;
	}

}
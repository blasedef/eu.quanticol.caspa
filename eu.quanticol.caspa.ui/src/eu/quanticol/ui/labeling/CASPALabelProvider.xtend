/*
* generated by Xtext
*/
package eu.quanticol.ui.labeling

import com.google.inject.Inject
import eu.quanticol.ModelUtil
import eu.quanticol.cASPA.Action
import eu.quanticol.cASPA.ActionProcess
import eu.quanticol.cASPA.Arguments
import eu.quanticol.cASPA.BooleanConstant
import eu.quanticol.cASPA.Constant
import eu.quanticol.cASPA.DistributedEventUpdateProbability
import eu.quanticol.cASPA.DistributedEventUpdateUniform
import eu.quanticol.cASPA.DistributionNatural
import eu.quanticol.cASPA.LocalSingleEventUpdate
import eu.quanticol.cASPA.Predicate
import eu.quanticol.cASPA.PredicateExpression
import eu.quanticol.cASPA.PredicateProcess
import eu.quanticol.cASPA.Process
import eu.quanticol.cASPA.ProcessExpression
import eu.quanticol.cASPA.ReferencedProcess
import eu.quanticol.cASPA.Store
import eu.quanticol.cASPA.Term
import eu.quanticol.cASPA.UniformNatural
import eu.quanticol.cASPA.UpdateExpression
import eu.quanticol.cASPA.Updates
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class CASPALabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	@Inject extension ModelUtil

	def text(Term term){
		
		var String temp
		
//		for(process : term.processes){
//			temp = process.cTString
//		}

		temp = term.ref.cTString
			
		return "Term " + temp
	}
	
	def text(ProcessExpression pe){
		pe.cTString
	}
	
	def text(Process p){
		p.cTString
	}

	
//	def text(TPParallel tpp){
//		 "|"
//	}
	
	def text(ReferencedProcess process){
		process.ref.cTString
	}
	
	def text(Store s){
		s.cTString
	}
	
//	def text(SelfReferencedStore s){
//		s.cTString
//	}
//	
//	def text(ReferencedStore s){
//		s.cTString
//	}
	
	def text(Predicate p){
		p.cTString
	}
	
	def text(PredicateExpression pe){
		pe.cTString
	}
	
	def text(Constant c){
		c.cTString
	}
	
	def text(BooleanConstant bc){
		bc.cTString
	}
	
	def text(Action a){
		a.cTString
	}
	
	def text(Arguments a){
		a.cTString
	}
	
	def text(Updates u){
		u.cTString
	}	
	
	def text(LocalSingleEventUpdate u){
		u.cTString
	}
	
	def text(DistributedEventUpdateProbability u){
		u.cTString
	} 
	
	def text(DistributedEventUpdateUniform u){ 
		u.cTString
	}
	
	def text(DistributionNatural u){ 
		u.cTString
	}
	
	def text(UniformNatural u){ 
		u.cTString
	} 
	
	def text(UpdateExpression u){ 
		u.cTString
	}
	
	def text(PredicateProcess p){
		p.cTString
	}
	
	def text(ActionProcess p){
		p.cTString
	}
	
}

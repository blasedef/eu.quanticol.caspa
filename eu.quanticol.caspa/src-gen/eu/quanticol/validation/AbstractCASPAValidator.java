/*
 * generated by Xtext
 */
package eu.quanticol.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCASPAValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(eu.quanticol.cASPA.CASPAPackage.eINSTANCE);
		return result;
	}
}

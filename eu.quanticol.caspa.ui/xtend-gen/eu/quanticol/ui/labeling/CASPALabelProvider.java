/**
 * generated by Xtext
 */
package eu.quanticol.ui.labeling;

import com.google.inject.Inject;
import eu.quanticol.ModelUtil;
import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.Arguments;
import eu.quanticol.cASPA.BooleanConstant;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributedEventUpdateProbability;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.DistributionNatural;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ReferencedProcess;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.UniformNatural;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.Updates;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class CASPALabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public CASPALabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  public String text(final Term term) {
    String temp = null;
    ProcessExpression _ref = term.getRef();
    String _cTString = this._modelUtil.cTString(_ref);
    temp = _cTString;
    return ("Term " + temp);
  }
  
  public String text(final ProcessExpression pe) {
    return this._modelUtil.cTString(pe);
  }
  
  public String text(final eu.quanticol.cASPA.Process p) {
    return this._modelUtil.cTString(p);
  }
  
  public String text(final ReferencedProcess process) {
    eu.quanticol.cASPA.Process _ref = process.getRef();
    return this._modelUtil.cTString(_ref);
  }
  
  public String text(final Store s) {
    return this._modelUtil.cTString(s);
  }
  
  public String text(final Predicate p) {
    return this._modelUtil.cTString(p);
  }
  
  public String text(final PredicateExpression pe) {
    return this._modelUtil.cTString(pe);
  }
  
  public String text(final Constant c) {
    return this._modelUtil.cTString(c);
  }
  
  public String text(final BooleanConstant bc) {
    return this._modelUtil.cTString(bc);
  }
  
  public String text(final Action a) {
    return this._modelUtil.cTString(a);
  }
  
  public String text(final Arguments a) {
    return this._modelUtil.cTString(a);
  }
  
  public String text(final Updates u) {
    return this._modelUtil.cTString(u);
  }
  
  public String text(final LocalSingleEventUpdate u) {
    return this._modelUtil.cTString(u);
  }
  
  public String text(final DistributedEventUpdateProbability u) {
    return this._modelUtil.cTString(u);
  }
  
  public String text(final DistributedEventUpdateUniform u) {
    return this._modelUtil.cTString(u);
  }
  
  public String text(final DistributionNatural u) {
    return this._modelUtil.cTString(u);
  }
  
  public String text(final UniformNatural u) {
    return this._modelUtil.cTString(u);
  }
  
  public String text(final UpdateExpression u) {
    return this._modelUtil.cTString(u);
  }
  
  public String text(final PredicateProcess p) {
    return this._modelUtil.cTString(p);
  }
  
  public String text(final ActionProcess p) {
    return this._modelUtil.cTString(p);
  }
}

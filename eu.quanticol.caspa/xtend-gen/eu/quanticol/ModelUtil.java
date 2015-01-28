package eu.quanticol;

import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.Arguments;
import eu.quanticol.cASPA.BooleanConstant;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributedEventUpdateProbability;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.Distribution;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateAnd;
import eu.quanticol.cASPA.PredicateComparison;
import eu.quanticol.cASPA.PredicateDiv;
import eu.quanticol.cASPA.PredicateEquality;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateMul;
import eu.quanticol.cASPA.PredicateNot;
import eu.quanticol.cASPA.PredicateOr;
import eu.quanticol.cASPA.PredicatePlu;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.PredicateSub;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ReferencedProcess;
import eu.quanticol.cASPA.ReferencedStore;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.StoreExpression;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Uniform;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.cASPA.Updates;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class ModelUtil {
  public String cTString(final ProcessExpression e) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof ReferencedProcess) {
        _matched=true;
        eu.quanticol.cASPA.Process _ref = ((ReferencedProcess)e).getRef();
        String _cTString = this.cTString(_ref);
        _switchResult = ("" + _cTString);
      }
    }
    if (!_matched) {
      if (e instanceof Parallel) {
        _matched=true;
        ProcessExpression _left = ((Parallel)e).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " | ");
        ProcessExpression _right = ((Parallel)e).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (e instanceof Choice) {
        _matched=true;
        ProcessExpression _left = ((Choice)e).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " + ");
        ProcessExpression _right = ((Choice)e).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (e instanceof Leaf) {
        _matched=true;
        String _value = ((Leaf)e).getValue();
        _switchResult = ("" + _value);
      }
    }
    if (!_matched) {
      if (e instanceof PredicateProcess) {
        _matched=true;
        Predicate _predicate = ((PredicateProcess)e).getPredicate();
        _switchResult = this.cTString(_predicate);
      }
    }
    if (!_matched) {
      if (e instanceof ActionProcess) {
        _matched=true;
        Action _action = ((ActionProcess)e).getAction();
        _switchResult = this.cTString(_action);
      }
    }
    return _switchResult.toString();
  }
  
  public String cTString(final Predicate p) {
    PredicateExpression _predicate = p.getPredicate();
    String _cTString = this.cTString(_predicate);
    return ("Predicate: " + _cTString);
  }
  
  public String cTString(final PredicateExpression pe) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (pe instanceof PredicateOr) {
        _matched=true;
        PredicateExpression _left = ((PredicateOr)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " || ");
        PredicateExpression _right = ((PredicateOr)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateAnd) {
        _matched=true;
        PredicateExpression _left = ((PredicateAnd)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " && ");
        PredicateExpression _right = ((PredicateAnd)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateEquality) {
        _matched=true;
        PredicateExpression _left = ((PredicateEquality)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " ");
        String _op = ((PredicateEquality)pe).getOp();
        String _string = _op.toString();
        String _plus_1 = (_plus + _string);
        String _plus_2 = (_plus_1 + " ");
        PredicateExpression _right = ((PredicateEquality)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus_2 + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateComparison) {
        _matched=true;
        PredicateExpression _left = ((PredicateComparison)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " ");
        String _op = ((PredicateComparison)pe).getOp();
        String _string = _op.toString();
        String _plus_1 = (_plus + _string);
        String _plus_2 = (_plus_1 + " ");
        PredicateExpression _right = ((PredicateComparison)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus_2 + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateSub) {
        _matched=true;
        PredicateExpression _left = ((PredicateSub)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " - ");
        PredicateExpression _right = ((PredicateSub)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicatePlu) {
        _matched=true;
        PredicateExpression _left = ((PredicatePlu)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " + ");
        PredicateExpression _right = ((PredicatePlu)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateMul) {
        _matched=true;
        PredicateExpression _left = ((PredicateMul)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " * ");
        PredicateExpression _right = ((PredicateMul)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateDiv) {
        _matched=true;
        PredicateExpression _left = ((PredicateDiv)pe).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " / ");
        PredicateExpression _right = ((PredicateDiv)pe).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateNot) {
        _matched=true;
        PredicateExpression _expression = ((PredicateNot)pe).getExpression();
        String _cTString = this.cTString(_expression);
        _switchResult = ("!" + _cTString);
      }
    }
    if (!_matched) {
      if (pe instanceof Constant) {
        _matched=true;
        _switchResult = this.cTString(((Constant) pe));
      }
    }
    if (!_matched) {
      if (pe instanceof BooleanConstant) {
        _matched=true;
        _switchResult = this.cTString(((BooleanConstant) pe));
      }
    }
    if (!_matched) {
      if (pe instanceof ReferencedStore) {
        _matched=true;
        _switchResult = this.cTString(((ReferencedStore) pe));
      }
    }
    if (!_matched) {
      if (pe instanceof SelfReferencedStore) {
        _matched=true;
        _switchResult = this.cTString(((SelfReferencedStore) pe));
      }
    }
    return _switchResult.toString();
  }
  
  public String cTString(final Constant c) {
    int _value = c.getValue();
    return ("" + Integer.valueOf(_value));
  }
  
  public String cTString(final BooleanConstant bc) {
    BooleanConstant _value = bc.getValue();
    return ("" + _value);
  }
  
  public String cTString(final Action a) {
    String args = "";
    String upds = "";
    Arguments _arguments = a.getArguments();
    String _cTString = this.cTString(_arguments);
    args = _cTString;
    Updates _updates = a.getUpdates();
    String _cTString_1 = this.cTString(_updates);
    upds = _cTString_1;
    String _name = a.getName();
    String _plus = ("Action: " + _name);
    String _plus_1 = (_plus + " ");
    Predicate _predicate = a.getPredicate();
    String _cTString_2 = this.cTString(_predicate);
    String _plus_2 = (_plus_1 + _cTString_2);
    String _plus_3 = (_plus_2 + " ");
    String _plus_4 = (_plus_3 + args);
    String _plus_5 = (_plus_4 + " ");
    return (_plus_5 + upds);
  }
  
  public String cTString(final Arguments a) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (a instanceof In) {
        _matched=true;
        String temp = "( ";
        EList<Arguments> _expressions = ((In)a).getExpressions();
        for (final Arguments expression : _expressions) {
          String _cTString = this.cTString(expression);
          /* ((temp + " ") + _cTString); */
        }
        temp = ((temp + " ") + ")");
        return temp;
      }
    }
    if (!_matched) {
      if (a instanceof Out) {
        _matched=true;
        String temp = "< ";
        EList<Arguments> _expressions = ((Out)a).getExpressions();
        for (final Arguments expression : _expressions) {
          String _cTString = this.cTString(expression);
          /* ((temp + " ") + _cTString); */
        }
        temp = ((temp + " ") + " >");
        return temp;
      }
    }
    if (!_matched) {
      if (a instanceof SelfReferencedStore) {
        _matched=true;
        _switchResult = this.cTString(((StoreExpression) a));
      }
    }
    if (!_matched) {
      if (a instanceof ReferencedStore) {
        _matched=true;
        _switchResult = this.cTString(((StoreExpression) a));
      }
    }
    if (!_matched) {
      if (a instanceof Constant) {
        _matched=true;
        _switchResult = this.cTString(((Constant) a));
      }
    }
    return _switchResult.toString();
  }
  
  public String cTString(final eu.quanticol.cASPA.Process p) {
    String _name = p.getName();
    return ("" + _name);
  }
  
  public String cTString(final StoreExpression s) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (s instanceof Store) {
        _matched=true;
        String _name = ((Store)s).getName();
        String _plus = ("" + _name);
        String _plus_1 = (_plus + " = ");
        int _value = ((Store)s).getValue();
        _switchResult = (_plus_1 + Integer.valueOf(_value));
      }
    }
    if (!_matched) {
      if (s instanceof SelfReferencedStore) {
        _matched=true;
        Store _ref = ((SelfReferencedStore)s).getRef();
        _switchResult = this.cTString(((StoreExpression) _ref));
      }
    }
    if (!_matched) {
      if (s instanceof ReferencedStore) {
        _matched=true;
        Store _ref = ((ReferencedStore)s).getRef();
        _switchResult = this.cTString(((StoreExpression) _ref));
      }
    }
    return _switchResult.toString();
  }
  
  public String cTString(final Store s) {
    String _name = s.getName();
    String _plus = ("" + _name);
    String _plus_1 = (_plus + " = ");
    int _value = s.getValue();
    return (_plus_1 + Integer.valueOf(_value));
  }
  
  public String cTString(final Updates u) {
    String temp = "";
    EList<Updates> _updates = u.getUpdates();
    for (final Updates update : _updates) {
      {
        temp = (temp + " ");
        this.cTString(update);
      }
    }
    return ("Update: " + temp);
  }
  
  public String cTString(final LocalSingleEventUpdate u) {
    StoreExpression _name = u.getName();
    String _cTString = this.cTString(_name);
    String _plus = (_cTString + " := ");
    UpdateExpression _expression = u.getExpression();
    String _cTString_1 = this.cTString(_expression);
    return (_plus + _cTString_1);
  }
  
  public String cTString(final DistributedEventUpdateProbability u) {
    String _xblockexpression = null;
    {
      String temp = null;
      EList<Updates> _distribution = u.getDistribution();
      for (final Updates distribution : _distribution) {
        String _xblockexpression_1 = null;
        {
          temp = (temp + " ");
          _xblockexpression_1 = this.cTString(distribution);
        }
        /* (_xblockexpression_1 + ", "); */
      }
      StoreExpression _name = u.getName();
      String _cTString = this.cTString(_name);
      String _plus = (_cTString + " :=  Pr( ");
      String _plus_1 = (_plus + temp);
      _xblockexpression = (_plus_1 + " )");
    }
    return _xblockexpression;
  }
  
  public String cTString(final DistributedEventUpdateUniform u) {
    String _xblockexpression = null;
    {
      String temp = null;
      EList<Updates> _distribution = u.getDistribution();
      for (final Updates distribution : _distribution) {
        String _xblockexpression_1 = null;
        {
          temp = (temp + " ");
          _xblockexpression_1 = this.cTString(distribution);
        }
        /* (_xblockexpression_1 + ", "); */
      }
      StoreExpression _name = u.getName();
      String _cTString = this.cTString(_name);
      String _plus = (_cTString + " :=  U( ");
      String _plus_1 = (_plus + temp);
      _xblockexpression = (_plus_1 + " )");
    }
    return _xblockexpression;
  }
  
  public String cTString(final Distribution u) {
    String _xblockexpression = null;
    {
      double _prob = u.getProb();
      String _string = Double.valueOf(_prob).toString();
      String _plus = ("" + _string);
      /* (_plus + " : "); */
      int _expression = u.getExpression();
      _xblockexpression = Integer.valueOf(_expression).toString();
    }
    return _xblockexpression;
  }
  
  public String cTString(final Uniform u) {
    int _expression = u.getExpression();
    return Integer.valueOf(_expression).toString();
  }
  
  public String cTString(final UpdateExpression ue) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (ue instanceof UpdateSub) {
        _matched=true;
        UpdateExpression _left = ((UpdateSub)ue).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " - ");
        UpdateExpression _right = ((UpdateSub)ue).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (ue instanceof UpdatePlu) {
        _matched=true;
        UpdateExpression _left = ((UpdatePlu)ue).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " + ");
        UpdateExpression _right = ((UpdatePlu)ue).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (ue instanceof UpdateMul) {
        _matched=true;
        UpdateExpression _left = ((UpdateMul)ue).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " * ");
        UpdateExpression _right = ((UpdateMul)ue).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (ue instanceof UpdateDiv) {
        _matched=true;
        UpdateExpression _left = ((UpdateDiv)ue).getLeft();
        String _cTString = this.cTString(_left);
        String _plus = (_cTString + " / ");
        UpdateExpression _right = ((UpdateDiv)ue).getRight();
        String _cTString_1 = this.cTString(_right);
        _switchResult = (_plus + _cTString_1);
      }
    }
    if (!_matched) {
      if (ue instanceof Constant) {
        _matched=true;
        _switchResult = this.cTString(((Constant) ue));
      }
    }
    if (!_matched) {
      if (ue instanceof ReferencedStore) {
        _matched=true;
        _switchResult = this.cTString(((StoreExpression) ue));
      }
    }
    if (!_matched) {
      if (ue instanceof SelfReferencedStore) {
        _matched=true;
        _switchResult = this.cTString(((StoreExpression) ue));
      }
    }
    return _switchResult.toString();
  }
  
  public eu.quanticol.cASPA.Process fromInGetProcess(final In in) {
    return EcoreUtil2.<eu.quanticol.cASPA.Process>getContainerOfType(in, eu.quanticol.cASPA.Process.class);
  }
  
  public Set<eu.quanticol.cASPA.Process> fromProcessGetReferences(final eu.quanticol.cASPA.Process p) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(p, Model.class);
    EList<eu.quanticol.cASPA.Process> processes = _containerOfType.getProcesses();
    Set<eu.quanticol.cASPA.Process> refProcesses = new HashSet<eu.quanticol.cASPA.Process>();
    Set<eu.quanticol.cASPA.Process> lastRefProcesses = new HashSet<eu.quanticol.cASPA.Process>();
    refProcesses.add(p);
    while ((refProcesses.size() > lastRefProcesses.size())) {
      {
        for (final eu.quanticol.cASPA.Process rp : refProcesses) {
          lastRefProcesses.add(rp);
        }
        for (final eu.quanticol.cASPA.Process process : processes) {
          for (final eu.quanticol.cASPA.Process rp_1 : lastRefProcesses) {
            ProcessExpression _value = process.getValue();
            this.getReferencedProcess(_value, refProcesses, rp_1);
          }
        }
      }
    }
    return refProcesses;
  }
  
  public Set<Term> getParentTerms(final Set<eu.quanticol.cASPA.Process> processes) {
    eu.quanticol.cASPA.Process _get = ((eu.quanticol.cASPA.Process[])Conversions.unwrapArray(processes, eu.quanticol.cASPA.Process.class))[0];
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(_get, Model.class);
    EList<Term> terms = _containerOfType.getTerms();
    Set<String> names = new HashSet<String>();
    Set<Term> results = new HashSet<Term>();
    for (final eu.quanticol.cASPA.Process process : processes) {
      String _name = process.getName();
      names.add(_name);
    }
    for (final Term term : terms) {
      for (final String name : names) {
        ProcessExpression _ref = term.getRef();
        eu.quanticol.cASPA.Process _ref_1 = ((ReferencedProcess) _ref).getRef();
        String _name_1 = _ref_1.getName();
        boolean _equals = _name_1.equals(name);
        if (_equals) {
          results.add(term);
        }
      }
    }
    return results;
  }
  
  public Set<String> getStoreNamesFromTerms(final Set<Term> terms) {
    Set<String> names = new HashSet<String>();
    for (final Term term : terms) {
      EList<StoreExpression> _stores = term.getStores();
      for (final StoreExpression store : _stores) {
        String _name = ((Store) store).getName();
        names.add(_name);
      }
    }
    return names;
  }
  
  public void getReferencedProcess(final ProcessExpression pe, final Set<eu.quanticol.cASPA.Process> results, final eu.quanticol.cASPA.Process p) {
    boolean _matched = false;
    if (!_matched) {
      if (pe instanceof Parallel) {
        _matched=true;
        ProcessExpression _left = ((Parallel)pe).getLeft();
        this.getReferencedProcess(_left, results, p);
        ProcessExpression _right = ((Parallel)pe).getRight();
        this.getReferencedProcess(_right, results, p);
      }
    }
    if (!_matched) {
      if (pe instanceof Choice) {
        _matched=true;
        ProcessExpression _left = ((Choice)pe).getLeft();
        this.getReferencedProcess(_left, results, p);
        ProcessExpression _right = ((Choice)pe).getRight();
        this.getReferencedProcess(_right, results, p);
      }
    }
    if (!_matched) {
      if (pe instanceof PredicateProcess) {
        _matched=true;
        ProcessExpression _ref = ((PredicateProcess)pe).getRef();
        this.getReferencedProcess(_ref, results, p);
      }
    }
    if (!_matched) {
      if (pe instanceof ActionProcess) {
        _matched=true;
        ProcessExpression _ref = ((ActionProcess)pe).getRef();
        this.getReferencedProcess(_ref, results, p);
      }
    }
    if (!_matched) {
      if (pe instanceof ReferencedProcess) {
        _matched=true;
        eu.quanticol.cASPA.Process _ref = ((ReferencedProcess)pe).getRef();
        String _name = _ref.getName();
        String _name_1 = p.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          eu.quanticol.cASPA.Process _containerOfType = EcoreUtil2.<eu.quanticol.cASPA.Process>getContainerOfType(pe, eu.quanticol.cASPA.Process.class);
          results.add(_containerOfType);
        }
      }
    }
  }
}

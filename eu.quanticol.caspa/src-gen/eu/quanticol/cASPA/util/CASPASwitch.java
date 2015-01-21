/**
 */
package eu.quanticol.cASPA.util;

import eu.quanticol.cASPA.Action;
import eu.quanticol.cASPA.ActionProcess;
import eu.quanticol.cASPA.Arguments;
import eu.quanticol.cASPA.BoolConstant;
import eu.quanticol.cASPA.Broadcast;
import eu.quanticol.cASPA.CASPAPackage;
import eu.quanticol.cASPA.Choice;
import eu.quanticol.cASPA.Constant;
import eu.quanticol.cASPA.DistributedEventUpdate;
import eu.quanticol.cASPA.DistributedEventUpdateProbability;
import eu.quanticol.cASPA.DistributedEventUpdateUniform;
import eu.quanticol.cASPA.Distribution;
import eu.quanticol.cASPA.Expressions;
import eu.quanticol.cASPA.In;
import eu.quanticol.cASPA.InArguments;
import eu.quanticol.cASPA.Leaf;
import eu.quanticol.cASPA.LocalSingleEventUpdate;
import eu.quanticol.cASPA.Model;
import eu.quanticol.cASPA.Not;
import eu.quanticol.cASPA.Out;
import eu.quanticol.cASPA.OutArguments;
import eu.quanticol.cASPA.Parallel;
import eu.quanticol.cASPA.Predicate;
import eu.quanticol.cASPA.PredicateAnd;
import eu.quanticol.cASPA.PredicateComparison;
import eu.quanticol.cASPA.PredicateDiv;
import eu.quanticol.cASPA.PredicateEquality;
import eu.quanticol.cASPA.PredicateExpression;
import eu.quanticol.cASPA.PredicateMul;
import eu.quanticol.cASPA.PredicateOr;
import eu.quanticol.cASPA.PredicatePlu;
import eu.quanticol.cASPA.PredicateProcess;
import eu.quanticol.cASPA.PredicateSub;
import eu.quanticol.cASPA.ProcessExpression;
import eu.quanticol.cASPA.ProcessReference;
import eu.quanticol.cASPA.ReferencedStore;
import eu.quanticol.cASPA.SelfReferencedStore;
import eu.quanticol.cASPA.SingleEventUpdate;
import eu.quanticol.cASPA.Store;
import eu.quanticol.cASPA.Term;
import eu.quanticol.cASPA.Unicast;
import eu.quanticol.cASPA.Uniform;
import eu.quanticol.cASPA.Update;
import eu.quanticol.cASPA.UpdateAnd;
import eu.quanticol.cASPA.UpdateComparison;
import eu.quanticol.cASPA.UpdateDiv;
import eu.quanticol.cASPA.UpdateEquality;
import eu.quanticol.cASPA.UpdateExpression;
import eu.quanticol.cASPA.UpdateMul;
import eu.quanticol.cASPA.UpdateNot;
import eu.quanticol.cASPA.UpdateOr;
import eu.quanticol.cASPA.UpdatePlu;
import eu.quanticol.cASPA.UpdateSub;
import eu.quanticol.cASPA.Updates;
import eu.quanticol.cASPA.Variables;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.quanticol.cASPA.CASPAPackage
 * @generated
 */
public class CASPASwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CASPAPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CASPASwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CASPAPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CASPAPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.STORE:
      {
        Store store = (Store)theEObject;
        T result = caseStore(store);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.REFERENCED_STORE:
      {
        ReferencedStore referencedStore = (ReferencedStore)theEObject;
        T result = caseReferencedStore(referencedStore);
        if (result == null) result = casePredicateExpression(referencedStore);
        if (result == null) result = caseExpressions(referencedStore);
        if (result == null) result = caseVariables(referencedStore);
        if (result == null) result = caseUpdateExpression(referencedStore);
        if (result == null) result = caseOutArguments(referencedStore);
        if (result == null) result = caseInArguments(referencedStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.SELF_REFERENCED_STORE:
      {
        SelfReferencedStore selfReferencedStore = (SelfReferencedStore)theEObject;
        T result = caseSelfReferencedStore(selfReferencedStore);
        if (result == null) result = casePredicateExpression(selfReferencedStore);
        if (result == null) result = caseExpressions(selfReferencedStore);
        if (result == null) result = caseVariables(selfReferencedStore);
        if (result == null) result = caseUpdateExpression(selfReferencedStore);
        if (result == null) result = caseOutArguments(selfReferencedStore);
        if (result == null) result = caseInArguments(selfReferencedStore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_EXPRESSION:
      {
        PredicateExpression predicateExpression = (PredicateExpression)theEObject;
        T result = casePredicateExpression(predicateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ARGUMENTS:
      {
        Arguments arguments = (Arguments)theEObject;
        T result = caseArguments(arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.IN_ARGUMENTS:
      {
        InArguments inArguments = (InArguments)theEObject;
        T result = caseInArguments(inArguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.OUT_ARGUMENTS:
      {
        OutArguments outArguments = (OutArguments)theEObject;
        T result = caseOutArguments(outArguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.EXPRESSIONS:
      {
        Expressions expressions = (Expressions)theEObject;
        T result = caseExpressions(expressions);
        if (result == null) result = caseOutArguments(expressions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.VARIABLES:
      {
        Variables variables = (Variables)theEObject;
        T result = caseVariables(variables);
        if (result == null) result = caseInArguments(variables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATES:
      {
        Updates updates = (Updates)theEObject;
        T result = caseUpdates(updates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE:
      {
        Update update = (Update)theEObject;
        T result = caseUpdate(update);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.SINGLE_EVENT_UPDATE:
      {
        SingleEventUpdate singleEventUpdate = (SingleEventUpdate)theEObject;
        T result = caseSingleEventUpdate(singleEventUpdate);
        if (result == null) result = caseUpdate(singleEventUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE:
      {
        DistributedEventUpdate distributedEventUpdate = (DistributedEventUpdate)theEObject;
        T result = caseDistributedEventUpdate(distributedEventUpdate);
        if (result == null) result = caseUpdate(distributedEventUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTION:
      {
        Distribution distribution = (Distribution)theEObject;
        T result = caseDistribution(distribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UNIFORM:
      {
        Uniform uniform = (Uniform)theEObject;
        T result = caseUniform(uniform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_EXPRESSION:
      {
        UpdateExpression updateExpression = (UpdateExpression)theEObject;
        T result = caseUpdateExpression(updateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PROCESS:
      {
        eu.quanticol.cASPA.Process process = (eu.quanticol.cASPA.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PROCESS_EXPRESSION:
      {
        ProcessExpression processExpression = (ProcessExpression)theEObject;
        T result = caseProcessExpression(processExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_PROCESS:
      {
        PredicateProcess predicateProcess = (PredicateProcess)theEObject;
        T result = casePredicateProcess(predicateProcess);
        if (result == null) result = caseProcessExpression(predicateProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.ACTION_PROCESS:
      {
        ActionProcess actionProcess = (ActionProcess)theEObject;
        T result = caseActionProcess(actionProcess);
        if (result == null) result = caseProcessExpression(actionProcess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.BROADCAST:
      {
        Broadcast broadcast = (Broadcast)theEObject;
        T result = caseBroadcast(broadcast);
        if (result == null) result = caseAction(broadcast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UNICAST:
      {
        Unicast unicast = (Unicast)theEObject;
        T result = caseUnicast(unicast);
        if (result == null) result = caseAction(unicast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_OR:
      {
        PredicateOr predicateOr = (PredicateOr)theEObject;
        T result = casePredicateOr(predicateOr);
        if (result == null) result = casePredicateExpression(predicateOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_AND:
      {
        PredicateAnd predicateAnd = (PredicateAnd)theEObject;
        T result = casePredicateAnd(predicateAnd);
        if (result == null) result = casePredicateExpression(predicateAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_EQUALITY:
      {
        PredicateEquality predicateEquality = (PredicateEquality)theEObject;
        T result = casePredicateEquality(predicateEquality);
        if (result == null) result = casePredicateExpression(predicateEquality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_COMPARISON:
      {
        PredicateComparison predicateComparison = (PredicateComparison)theEObject;
        T result = casePredicateComparison(predicateComparison);
        if (result == null) result = casePredicateExpression(predicateComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_SUB:
      {
        PredicateSub predicateSub = (PredicateSub)theEObject;
        T result = casePredicateSub(predicateSub);
        if (result == null) result = casePredicateExpression(predicateSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_PLU:
      {
        PredicatePlu predicatePlu = (PredicatePlu)theEObject;
        T result = casePredicatePlu(predicatePlu);
        if (result == null) result = casePredicateExpression(predicatePlu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_MUL:
      {
        PredicateMul predicateMul = (PredicateMul)theEObject;
        T result = casePredicateMul(predicateMul);
        if (result == null) result = casePredicateExpression(predicateMul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PREDICATE_DIV:
      {
        PredicateDiv predicateDiv = (PredicateDiv)theEObject;
        T result = casePredicateDiv(predicateDiv);
        if (result == null) result = casePredicateExpression(predicateDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = casePredicateExpression(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = casePredicateExpression(constant);
        if (result == null) result = caseUpdateExpression(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.BOOL_CONSTANT:
      {
        BoolConstant boolConstant = (BoolConstant)theEObject;
        T result = caseBoolConstant(boolConstant);
        if (result == null) result = casePredicateExpression(boolConstant);
        if (result == null) result = caseUpdateExpression(boolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.IN:
      {
        In in = (In)theEObject;
        T result = caseIn(in);
        if (result == null) result = caseArguments(in);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.OUT:
      {
        Out out = (Out)theEObject;
        T result = caseOut(out);
        if (result == null) result = caseArguments(out);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.LOCAL_SINGLE_EVENT_UPDATE:
      {
        LocalSingleEventUpdate localSingleEventUpdate = (LocalSingleEventUpdate)theEObject;
        T result = caseLocalSingleEventUpdate(localSingleEventUpdate);
        if (result == null) result = caseSingleEventUpdate(localSingleEventUpdate);
        if (result == null) result = caseUpdate(localSingleEventUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_PROBABILITY:
      {
        DistributedEventUpdateProbability distributedEventUpdateProbability = (DistributedEventUpdateProbability)theEObject;
        T result = caseDistributedEventUpdateProbability(distributedEventUpdateProbability);
        if (result == null) result = caseDistributedEventUpdate(distributedEventUpdateProbability);
        if (result == null) result = caseUpdate(distributedEventUpdateProbability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.DISTRIBUTED_EVENT_UPDATE_UNIFORM:
      {
        DistributedEventUpdateUniform distributedEventUpdateUniform = (DistributedEventUpdateUniform)theEObject;
        T result = caseDistributedEventUpdateUniform(distributedEventUpdateUniform);
        if (result == null) result = caseDistributedEventUpdate(distributedEventUpdateUniform);
        if (result == null) result = caseUpdate(distributedEventUpdateUniform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_OR:
      {
        UpdateOr updateOr = (UpdateOr)theEObject;
        T result = caseUpdateOr(updateOr);
        if (result == null) result = caseUpdateExpression(updateOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_AND:
      {
        UpdateAnd updateAnd = (UpdateAnd)theEObject;
        T result = caseUpdateAnd(updateAnd);
        if (result == null) result = caseUpdateExpression(updateAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_EQUALITY:
      {
        UpdateEquality updateEquality = (UpdateEquality)theEObject;
        T result = caseUpdateEquality(updateEquality);
        if (result == null) result = caseUpdateExpression(updateEquality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_COMPARISON:
      {
        UpdateComparison updateComparison = (UpdateComparison)theEObject;
        T result = caseUpdateComparison(updateComparison);
        if (result == null) result = caseUpdateExpression(updateComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_SUB:
      {
        UpdateSub updateSub = (UpdateSub)theEObject;
        T result = caseUpdateSub(updateSub);
        if (result == null) result = caseUpdateExpression(updateSub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_PLU:
      {
        UpdatePlu updatePlu = (UpdatePlu)theEObject;
        T result = caseUpdatePlu(updatePlu);
        if (result == null) result = caseUpdateExpression(updatePlu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_MUL:
      {
        UpdateMul updateMul = (UpdateMul)theEObject;
        T result = caseUpdateMul(updateMul);
        if (result == null) result = caseUpdateExpression(updateMul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_DIV:
      {
        UpdateDiv updateDiv = (UpdateDiv)theEObject;
        T result = caseUpdateDiv(updateDiv);
        if (result == null) result = caseUpdateExpression(updateDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.UPDATE_NOT:
      {
        UpdateNot updateNot = (UpdateNot)theEObject;
        T result = caseUpdateNot(updateNot);
        if (result == null) result = caseUpdateExpression(updateNot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PARALLEL:
      {
        Parallel parallel = (Parallel)theEObject;
        T result = caseParallel(parallel);
        if (result == null) result = caseProcessExpression(parallel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.CHOICE:
      {
        Choice choice = (Choice)theEObject;
        T result = caseChoice(choice);
        if (result == null) result = caseProcessExpression(choice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.LEAF:
      {
        Leaf leaf = (Leaf)theEObject;
        T result = caseLeaf(leaf);
        if (result == null) result = caseProcessExpression(leaf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CASPAPackage.PROCESS_REFERENCE:
      {
        ProcessReference processReference = (ProcessReference)theEObject;
        T result = caseProcessReference(processReference);
        if (result == null) result = caseProcessExpression(processReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStore(Store object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedStore(ReferencedStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Referenced Store</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Referenced Store</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfReferencedStore(SelfReferencedStore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateExpression(PredicateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArguments(Arguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInArguments(InArguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutArguments(OutArguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expressions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expressions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressions(Expressions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariables(Variables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Updates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Updates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdates(Updates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdate(Update object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Event Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Event Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleEventUpdate(SingleEventUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distributed Event Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distributed Event Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistributedEventUpdate(DistributedEventUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistribution(Distribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uniform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uniform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniform(Uniform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateExpression(UpdateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(eu.quanticol.cASPA.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessExpression(ProcessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateProcess(PredicateProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionProcess(ActionProcess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broadcast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broadcast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBroadcast(Broadcast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unicast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unicast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnicast(Unicast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateOr(PredicateOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateAnd(PredicateAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateEquality(PredicateEquality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateComparison(PredicateComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateSub(PredicateSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicatePlu(PredicatePlu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateMul(PredicateMul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateDiv(PredicateDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstant(BoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIn(In object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOut(Out object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Single Event Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Single Event Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalSingleEventUpdate(LocalSingleEventUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distributed Event Update Probability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distributed Event Update Probability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistributedEventUpdateProbability(DistributedEventUpdateProbability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distributed Event Update Uniform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distributed Event Update Uniform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistributedEventUpdateUniform(DistributedEventUpdateUniform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateOr(UpdateOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateAnd(UpdateAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateEquality(UpdateEquality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateComparison(UpdateComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateSub(UpdateSub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Plu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Plu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdatePlu(UpdatePlu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateMul(UpdateMul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateDiv(UpdateDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateNot(UpdateNot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallel(Parallel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoice(Choice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeaf(Leaf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessReference(ProcessReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CASPASwitch

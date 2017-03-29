/*
 * generated by Xtext
 */
package com.yakindu.sct.domain.scenario.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.yakindu.sct.domain.scenario.services.ScenarioTextGrammarAccess;

public class ScenarioTextParser extends AbstractContentAssistParser {
	
	@Inject
	private ScenarioTextGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.yakindu.sct.domain.scenario.ui.contentassist.antlr.internal.InternalScenarioTextParser createParser() {
		com.yakindu.sct.domain.scenario.ui.contentassist.antlr.internal.InternalScenarioTextParser result = new com.yakindu.sct.domain.scenario.ui.contentassist.antlr.internal.InternalScenarioTextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDefRootAccess().getAlternatives(), "rule__DefRoot__Alternatives");
					put(grammarAccess.getScopeAccess().getAlternatives(), "rule__Scope__Alternatives");
					put(grammarAccess.getStatechartScopeAccess().getAlternatives(), "rule__StatechartScope__Alternatives");
					put(grammarAccess.getInterfaceScopeAccess().getDeclarationsAlternatives_4_0(), "rule__InterfaceScope__DeclarationsAlternatives_4_0");
					put(grammarAccess.getInternalScopeAccess().getAlternatives_3(), "rule__InternalScope__Alternatives_3");
					put(grammarAccess.getInternalScopeAccess().getDeclarationsAlternatives_3_0_0(), "rule__InternalScope__DeclarationsAlternatives_3_0_0");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getVariableDefinitionAccess().getAlternatives_1(), "rule__VariableDefinition__Alternatives_1");
					put(grammarAccess.getReactionAccess().getAlternatives(), "rule__Reaction__Alternatives");
					put(grammarAccess.getStextTriggerAccess().getAlternatives(), "rule__StextTrigger__Alternatives");
					put(grammarAccess.getReactionTriggerAccess().getAlternatives_1(), "rule__ReactionTrigger__Alternatives_1");
					put(grammarAccess.getDefaultTriggerAccess().getAlternatives_1(), "rule__DefaultTrigger__Alternatives_1");
					put(grammarAccess.getReactionEffectAccess().getActionsAlternatives_1_0(), "rule__ReactionEffect__ActionsAlternatives_1_0");
					put(grammarAccess.getReactionEffectAccess().getActionsAlternatives_2_1_0(), "rule__ReactionEffect__ActionsAlternatives_2_1_0");
					put(grammarAccess.getTransitionPropertyAccess().getAlternatives(), "rule__TransitionProperty__Alternatives");
					put(grammarAccess.getEventSpecAccess().getAlternatives(), "rule__EventSpec__Alternatives");
					put(grammarAccess.getBuiltinEventSpecAccess().getAlternatives(), "rule__BuiltinEventSpec__Alternatives");
					put(grammarAccess.getAlwaysEventAccess().getAlternatives_1(), "rule__AlwaysEvent__Alternatives_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getXIDAccess().getAlternatives(), "rule__XID__Alternatives");
					put(grammarAccess.getLogicalNotExpressionAccess().getAlternatives(), "rule__LogicalNotExpression__Alternatives");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getAlternatives(), "rule__NumericalUnaryExpression__Alternatives");
					put(grammarAccess.getFeatureCallAccess().getAlternatives_1_3(), "rule__FeatureCall__Alternatives_1_3");
					put(grammarAccess.getElementReferenceExpressionAccess().getAlternatives_2(), "rule__ElementReferenceExpression__Alternatives_2");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getDirectionAccess().getAlternatives(), "rule__Direction__Alternatives");
					put(grammarAccess.getTimeEventTypeAccess().getAlternatives(), "rule__TimeEventType__Alternatives");
					put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
					put(grammarAccess.getAssignmentOperatorAccess().getAlternatives(), "rule__AssignmentOperator__Alternatives");
					put(grammarAccess.getShiftOperatorAccess().getAlternatives(), "rule__ShiftOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getStateScopeAccess().getGroup(), "rule__StateScope__Group__0");
					put(grammarAccess.getBlockScenarioAccess().getGroup(), "rule__BlockScenario__Group__0");
					put(grammarAccess.getStatechartRootAccess().getGroup(), "rule__StatechartRoot__Group__0");
					put(grammarAccess.getStateRootAccess().getGroup(), "rule__StateRoot__Group__0");
					put(grammarAccess.getTransitionRootAccess().getGroup(), "rule__TransitionRoot__Group__0");
					put(grammarAccess.getStatechartSpecificationAccess().getGroup(), "rule__StatechartSpecification__Group__0");
					put(grammarAccess.getStatechartSpecificationAccess().getGroup_1(), "rule__StatechartSpecification__Group_1__0");
					put(grammarAccess.getInterfaceScopeAccess().getGroup(), "rule__InterfaceScope__Group__0");
					put(grammarAccess.getInternalScopeAccess().getGroup(), "rule__InternalScope__Group__0");
					put(grammarAccess.getImportScopeAccess().getGroup(), "rule__ImportScope__Group__0");
					put(grammarAccess.getQIDAccess().getGroup(), "rule__QID__Group__0");
					put(grammarAccess.getQIDAccess().getGroup_1(), "rule__QID__Group_1__0");
					put(grammarAccess.getEventDefinitionAccess().getGroup(), "rule__EventDefinition__Group__0");
					put(grammarAccess.getEventDefinitionAccess().getGroup_3(), "rule__EventDefinition__Group_3__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup(), "rule__VariableDefinition__Group__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_6(), "rule__VariableDefinition__Group_6__0");
					put(grammarAccess.getTypeAliasDefinitionAccess().getGroup(), "rule__TypeAliasDefinition__Group__0");
					put(grammarAccess.getOperationDefinitionAccess().getGroup(), "rule__OperationDefinition__Group__0");
					put(grammarAccess.getOperationDefinitionAccess().getGroup_4(), "rule__OperationDefinition__Group_4__0");
					put(grammarAccess.getOperationDefinitionAccess().getGroup_4_1(), "rule__OperationDefinition__Group_4_1__0");
					put(grammarAccess.getOperationDefinitionAccess().getGroup_6(), "rule__OperationDefinition__Group_6__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup(), "rule__TypeSpecifier__Group__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_1(), "rule__TypeSpecifier__Group_1__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_1_1(), "rule__TypeSpecifier__Group_1_1__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_1_1_1(), "rule__TypeSpecifier__Group_1_1_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getLocalReactionAccess().getGroup(), "rule__LocalReaction__Group__0");
					put(grammarAccess.getLocalReactionAccess().getGroup_1(), "rule__LocalReaction__Group_1__0");
					put(grammarAccess.getLocalReactionAccess().getGroup_1_0(), "rule__LocalReaction__Group_1_0__0");
					put(grammarAccess.getTransitionReactionAccess().getGroup(), "rule__TransitionReaction__Group__0");
					put(grammarAccess.getTransitionReactionAccess().getGroup_2(), "rule__TransitionReaction__Group_2__0");
					put(grammarAccess.getTransitionReactionAccess().getGroup_3(), "rule__TransitionReaction__Group_3__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup(), "rule__ReactionTrigger__Group__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_0(), "rule__ReactionTrigger__Group_1_0__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_0_1(), "rule__ReactionTrigger__Group_1_0_1__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_0_2(), "rule__ReactionTrigger__Group_1_0_2__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_1(), "rule__ReactionTrigger__Group_1_1__0");
					put(grammarAccess.getDefaultTriggerAccess().getGroup(), "rule__DefaultTrigger__Group__0");
					put(grammarAccess.getGuardAccess().getGroup(), "rule__Guard__Group__0");
					put(grammarAccess.getReactionEffectAccess().getGroup(), "rule__ReactionEffect__Group__0");
					put(grammarAccess.getReactionEffectAccess().getGroup_2(), "rule__ReactionEffect__Group_2__0");
					put(grammarAccess.getEntryPointSpecAccess().getGroup(), "rule__EntryPointSpec__Group__0");
					put(grammarAccess.getExitPointSpecAccess().getGroup(), "rule__ExitPointSpec__Group__0");
					put(grammarAccess.getSimpleFeatureCallAccess().getGroup(), "rule__SimpleFeatureCall__Group__0");
					put(grammarAccess.getSimpleFeatureCallAccess().getGroup_1(), "rule__SimpleFeatureCall__Group_1__0");
					put(grammarAccess.getSimpleFeatureCallAccess().getGroup_1_3(), "rule__SimpleFeatureCall__Group_1_3__0");
					put(grammarAccess.getSimpleFeatureCallAccess().getGroup_1_3_1(), "rule__SimpleFeatureCall__Group_1_3_1__0");
					put(grammarAccess.getSimpleFeatureCallAccess().getGroup_1_3_1_1(), "rule__SimpleFeatureCall__Group_1_3_1_1__0");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getGroup(), "rule__SimpleElementReferenceExpression__Group__0");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getGroup_1(), "rule__SimpleElementReferenceExpression__Group_1__0");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getGroup_1_1(), "rule__SimpleElementReferenceExpression__Group_1_1__0");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getGroup_1_1_1(), "rule__SimpleElementReferenceExpression__Group_1_1_1__0");
					put(grammarAccess.getTimeEventSpecAccess().getGroup(), "rule__TimeEventSpec__Group__0");
					put(grammarAccess.getEntryEventAccess().getGroup(), "rule__EntryEvent__Group__0");
					put(grammarAccess.getExitEventAccess().getGroup(), "rule__ExitEvent__Group__0");
					put(grammarAccess.getAlwaysEventAccess().getGroup(), "rule__AlwaysEvent__Group__0");
					put(grammarAccess.getEventRaisingExpressionAccess().getGroup(), "rule__EventRaisingExpression__Group__0");
					put(grammarAccess.getEventRaisingExpressionAccess().getGroup_3(), "rule__EventRaisingExpression__Group_3__0");
					put(grammarAccess.getEventValueReferenceExpressionAccess().getGroup(), "rule__EventValueReferenceExpression__Group__0");
					put(grammarAccess.getActiveStateReferenceExpressionAccess().getGroup(), "rule__ActiveStateReferenceExpression__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getAssignmentExpressionAccess().getGroup(), "rule__AssignmentExpression__Group__0");
					put(grammarAccess.getAssignmentExpressionAccess().getGroup_1(), "rule__AssignmentExpression__Group_1__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup_1(), "rule__ConditionalExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getLogicalNotExpressionAccess().getGroup_1(), "rule__LogicalNotExpression__Group_1__0");
					put(grammarAccess.getBitwiseXorExpressionAccess().getGroup(), "rule__BitwiseXorExpression__Group__0");
					put(grammarAccess.getBitwiseXorExpressionAccess().getGroup_1(), "rule__BitwiseXorExpression__Group_1__0");
					put(grammarAccess.getBitwiseOrExpressionAccess().getGroup(), "rule__BitwiseOrExpression__Group__0");
					put(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1(), "rule__BitwiseOrExpression__Group_1__0");
					put(grammarAccess.getBitwiseAndExpressionAccess().getGroup(), "rule__BitwiseAndExpression__Group__0");
					put(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1(), "rule__BitwiseAndExpression__Group_1__0");
					put(grammarAccess.getLogicalRelationExpressionAccess().getGroup(), "rule__LogicalRelationExpression__Group__0");
					put(grammarAccess.getLogicalRelationExpressionAccess().getGroup_1(), "rule__LogicalRelationExpression__Group_1__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup(), "rule__ShiftExpression__Group__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup_1(), "rule__ShiftExpression__Group_1__0");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getGroup(), "rule__NumericalAddSubtractExpression__Group__0");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getGroup_1(), "rule__NumericalAddSubtractExpression__Group_1__0");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getGroup(), "rule__NumericalMultiplyDivideExpression__Group__0");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getGroup_1(), "rule__NumericalMultiplyDivideExpression__Group_1__0");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getGroup_1(), "rule__NumericalUnaryExpression__Group_1__0");
					put(grammarAccess.getTypeCastExpressionAccess().getGroup(), "rule__TypeCastExpression__Group__0");
					put(grammarAccess.getTypeCastExpressionAccess().getGroup_1(), "rule__TypeCastExpression__Group_1__0");
					put(grammarAccess.getTypeCastExpressionAccess().getGroup_1_0(), "rule__TypeCastExpression__Group_1_0__0");
					put(grammarAccess.getPrimitiveValueExpressionAccess().getGroup(), "rule__PrimitiveValueExpression__Group__0");
					put(grammarAccess.getFeatureCallAccess().getGroup(), "rule__FeatureCall__Group__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1(), "rule__FeatureCall__Group_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_0(), "rule__FeatureCall__Group_1_3_0__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_0_1(), "rule__FeatureCall__Group_1_3_0_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_0_1_1(), "rule__FeatureCall__Group_1_3_0_1_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1(), "rule__FeatureCall__Group_1_3_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_0(), "rule__FeatureCall__Group_1_3_1_0__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_0_0(), "rule__FeatureCall__Group_1_3_1_0_0__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_1(), "rule__FeatureCall__Group_1_3_1_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_1_0(), "rule__FeatureCall__Group_1_3_1_1_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup(), "rule__ElementReferenceExpression__Group__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_0(), "rule__ElementReferenceExpression__Group_2_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_0_1(), "rule__ElementReferenceExpression__Group_2_0_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_0_1_1(), "rule__ElementReferenceExpression__Group_2_0_1_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1(), "rule__ElementReferenceExpression__Group_2_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_0(), "rule__ElementReferenceExpression__Group_2_1_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_0_0(), "rule__ElementReferenceExpression__Group_2_1_0_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_1(), "rule__ElementReferenceExpression__Group_2_1_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_1_0(), "rule__ElementReferenceExpression__Group_2_1_1_0__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getBoolLiteralAccess().getGroup(), "rule__BoolLiteral__Group__0");
					put(grammarAccess.getIntLiteralAccess().getGroup(), "rule__IntLiteral__Group__0");
					put(grammarAccess.getDoubleLiteralAccess().getGroup(), "rule__DoubleLiteral__Group__0");
					put(grammarAccess.getFloatLiteralAccess().getGroup(), "rule__FloatLiteral__Group__0");
					put(grammarAccess.getHexLiteralAccess().getGroup(), "rule__HexLiteral__Group__0");
					put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getStateScopeAccess().getScenariosAssignment_1(), "rule__StateScope__ScenariosAssignment_1");
					put(grammarAccess.getStateScopeAccess().getReactionsAssignment_2(), "rule__StateScope__ReactionsAssignment_2");
					put(grammarAccess.getBlockScenarioAccess().getEventsAssignment_2(), "rule__BlockScenario__EventsAssignment_2");
					put(grammarAccess.getRootAccess().getRootsAssignment(), "rule__Root__RootsAssignment");
					put(grammarAccess.getStatechartRootAccess().getDefAssignment_1(), "rule__StatechartRoot__DefAssignment_1");
					put(grammarAccess.getStateRootAccess().getDefAssignment_1(), "rule__StateRoot__DefAssignment_1");
					put(grammarAccess.getTransitionRootAccess().getDefAssignment_1(), "rule__TransitionRoot__DefAssignment_1");
					put(grammarAccess.getStatechartSpecificationAccess().getNamespaceAssignment_1_1(), "rule__StatechartSpecification__NamespaceAssignment_1_1");
					put(grammarAccess.getStatechartSpecificationAccess().getScopesAssignment_2(), "rule__StatechartSpecification__ScopesAssignment_2");
					put(grammarAccess.getStateSpecificationAccess().getScopeAssignment(), "rule__StateSpecification__ScopeAssignment");
					put(grammarAccess.getTransitionSpecificationAccess().getReactionAssignment(), "rule__TransitionSpecification__ReactionAssignment");
					put(grammarAccess.getInterfaceScopeAccess().getNameAssignment_2(), "rule__InterfaceScope__NameAssignment_2");
					put(grammarAccess.getInterfaceScopeAccess().getDeclarationsAssignment_4(), "rule__InterfaceScope__DeclarationsAssignment_4");
					put(grammarAccess.getInternalScopeAccess().getDeclarationsAssignment_3_0(), "rule__InternalScope__DeclarationsAssignment_3_0");
					put(grammarAccess.getInternalScopeAccess().getReactionsAssignment_3_1(), "rule__InternalScope__ReactionsAssignment_3_1");
					put(grammarAccess.getImportScopeAccess().getImportsAssignment_3(), "rule__ImportScope__ImportsAssignment_3");
					put(grammarAccess.getEventDefinitionAccess().getDirectionAssignment_0(), "rule__EventDefinition__DirectionAssignment_0");
					put(grammarAccess.getEventDefinitionAccess().getNameAssignment_2(), "rule__EventDefinition__NameAssignment_2");
					put(grammarAccess.getEventDefinitionAccess().getTypeSpecifierAssignment_3_1(), "rule__EventDefinition__TypeSpecifierAssignment_3_1");
					put(grammarAccess.getVariableDefinitionAccess().getConstAssignment_1_0(), "rule__VariableDefinition__ConstAssignment_1_0");
					put(grammarAccess.getVariableDefinitionAccess().getReadonlyAssignment_2_0(), "rule__VariableDefinition__ReadonlyAssignment_2_0");
					put(grammarAccess.getVariableDefinitionAccess().getExternalAssignment_2_1(), "rule__VariableDefinition__ExternalAssignment_2_1");
					put(grammarAccess.getVariableDefinitionAccess().getNameAssignment_3(), "rule__VariableDefinition__NameAssignment_3");
					put(grammarAccess.getVariableDefinitionAccess().getTypeSpecifierAssignment_5(), "rule__VariableDefinition__TypeSpecifierAssignment_5");
					put(grammarAccess.getVariableDefinitionAccess().getInitialValueAssignment_6_1(), "rule__VariableDefinition__InitialValueAssignment_6_1");
					put(grammarAccess.getTypeAliasDefinitionAccess().getNameAssignment_2(), "rule__TypeAliasDefinition__NameAssignment_2");
					put(grammarAccess.getTypeAliasDefinitionAccess().getTypeSpecifierAssignment_4(), "rule__TypeAliasDefinition__TypeSpecifierAssignment_4");
					put(grammarAccess.getOperationDefinitionAccess().getNameAssignment_2(), "rule__OperationDefinition__NameAssignment_2");
					put(grammarAccess.getOperationDefinitionAccess().getParametersAssignment_4_0(), "rule__OperationDefinition__ParametersAssignment_4_0");
					put(grammarAccess.getOperationDefinitionAccess().getParametersAssignment_4_1_1(), "rule__OperationDefinition__ParametersAssignment_4_1_1");
					put(grammarAccess.getOperationDefinitionAccess().getTypeSpecifierAssignment_6_1(), "rule__OperationDefinition__TypeSpecifierAssignment_6_1");
					put(grammarAccess.getTypeSpecifierAccess().getTypeAssignment_0(), "rule__TypeSpecifier__TypeAssignment_0");
					put(grammarAccess.getTypeSpecifierAccess().getTypeArgumentsAssignment_1_1_0(), "rule__TypeSpecifier__TypeArgumentsAssignment_1_1_0");
					put(grammarAccess.getTypeSpecifierAccess().getTypeArgumentsAssignment_1_1_1_1(), "rule__TypeSpecifier__TypeArgumentsAssignment_1_1_1_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getVarArgsAssignment_1(), "rule__Parameter__VarArgsAssignment_1");
					put(grammarAccess.getParameterAccess().getTypeSpecifierAssignment_3(), "rule__Parameter__TypeSpecifierAssignment_3");
					put(grammarAccess.getLocalReactionAccess().getTriggerAssignment_0(), "rule__LocalReaction__TriggerAssignment_0");
					put(grammarAccess.getLocalReactionAccess().getEffectAssignment_1_0_1(), "rule__LocalReaction__EffectAssignment_1_0_1");
					put(grammarAccess.getTransitionReactionAccess().getTriggerAssignment_1(), "rule__TransitionReaction__TriggerAssignment_1");
					put(grammarAccess.getTransitionReactionAccess().getEffectAssignment_2_1(), "rule__TransitionReaction__EffectAssignment_2_1");
					put(grammarAccess.getTransitionReactionAccess().getPropertiesAssignment_3_1(), "rule__TransitionReaction__PropertiesAssignment_3_1");
					put(grammarAccess.getReactionTriggerAccess().getTriggersAssignment_1_0_0(), "rule__ReactionTrigger__TriggersAssignment_1_0_0");
					put(grammarAccess.getReactionTriggerAccess().getTriggersAssignment_1_0_1_1(), "rule__ReactionTrigger__TriggersAssignment_1_0_1_1");
					put(grammarAccess.getReactionTriggerAccess().getGuardAssignment_1_0_2_1(), "rule__ReactionTrigger__GuardAssignment_1_0_2_1");
					put(grammarAccess.getReactionTriggerAccess().getGuardAssignment_1_1_1(), "rule__ReactionTrigger__GuardAssignment_1_1_1");
					put(grammarAccess.getGuardAccess().getExpressionAssignment_1(), "rule__Guard__ExpressionAssignment_1");
					put(grammarAccess.getReactionEffectAccess().getActionsAssignment_1(), "rule__ReactionEffect__ActionsAssignment_1");
					put(grammarAccess.getReactionEffectAccess().getActionsAssignment_2_1(), "rule__ReactionEffect__ActionsAssignment_2_1");
					put(grammarAccess.getEntryPointSpecAccess().getEntrypointAssignment_1(), "rule__EntryPointSpec__EntrypointAssignment_1");
					put(grammarAccess.getExitPointSpecAccess().getExitpointAssignment_0(), "rule__ExitPointSpec__ExitpointAssignment_0");
					put(grammarAccess.getRegularEventSpecAccess().getEventAssignment(), "rule__RegularEventSpec__EventAssignment");
					put(grammarAccess.getSimpleFeatureCallAccess().getFeatureAssignment_1_2(), "rule__SimpleFeatureCall__FeatureAssignment_1_2");
					put(grammarAccess.getSimpleFeatureCallAccess().getOperationCallAssignment_1_3_0(), "rule__SimpleFeatureCall__OperationCallAssignment_1_3_0");
					put(grammarAccess.getSimpleFeatureCallAccess().getArgsAssignment_1_3_1_0(), "rule__SimpleFeatureCall__ArgsAssignment_1_3_1_0");
					put(grammarAccess.getSimpleFeatureCallAccess().getArgsAssignment_1_3_1_1_1(), "rule__SimpleFeatureCall__ArgsAssignment_1_3_1_1_1");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getReferenceAssignment_0(), "rule__SimpleElementReferenceExpression__ReferenceAssignment_0");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getOperationCallAssignment_1_0(), "rule__SimpleElementReferenceExpression__OperationCallAssignment_1_0");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getArgsAssignment_1_1_0(), "rule__SimpleElementReferenceExpression__ArgsAssignment_1_1_0");
					put(grammarAccess.getSimpleElementReferenceExpressionAccess().getArgsAssignment_1_1_1_1(), "rule__SimpleElementReferenceExpression__ArgsAssignment_1_1_1_1");
					put(grammarAccess.getTimeEventSpecAccess().getTypeAssignment_0(), "rule__TimeEventSpec__TypeAssignment_0");
					put(grammarAccess.getTimeEventSpecAccess().getValueAssignment_1(), "rule__TimeEventSpec__ValueAssignment_1");
					put(grammarAccess.getTimeEventSpecAccess().getUnitAssignment_2(), "rule__TimeEventSpec__UnitAssignment_2");
					put(grammarAccess.getEventRaisingExpressionAccess().getEventAssignment_2(), "rule__EventRaisingExpression__EventAssignment_2");
					put(grammarAccess.getEventRaisingExpressionAccess().getValueAssignment_3_1(), "rule__EventRaisingExpression__ValueAssignment_3_1");
					put(grammarAccess.getEventValueReferenceExpressionAccess().getValueAssignment_3(), "rule__EventValueReferenceExpression__ValueAssignment_3");
					put(grammarAccess.getActiveStateReferenceExpressionAccess().getValueAssignment_3(), "rule__ActiveStateReferenceExpression__ValueAssignment_3");
					put(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignment_1_1(), "rule__AssignmentExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAssignmentExpressionAccess().getExpressionAssignment_1_2(), "rule__AssignmentExpression__ExpressionAssignment_1_2");
					put(grammarAccess.getConditionalExpressionAccess().getTrueCaseAssignment_1_2(), "rule__ConditionalExpression__TrueCaseAssignment_1_2");
					put(grammarAccess.getConditionalExpressionAccess().getFalseCaseAssignment_1_4(), "rule__ConditionalExpression__FalseCaseAssignment_1_4");
					put(grammarAccess.getLogicalOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalOrExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalAndExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalNotExpressionAccess().getOperandAssignment_1_2(), "rule__LogicalNotExpression__OperandAssignment_1_2");
					put(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseXorExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseOrExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseAndExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalRelationExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalRelationExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalRelationExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getShiftExpressionAccess().getOperatorAssignment_1_1(), "rule__ShiftExpression__OperatorAssignment_1_1");
					put(grammarAccess.getShiftExpressionAccess().getRightOperandAssignment_1_2(), "rule__ShiftExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericalAddSubtractExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandAssignment_1_2(), "rule__NumericalAddSubtractExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericalMultiplyDivideExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandAssignment_1_2(), "rule__NumericalMultiplyDivideExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericalUnaryExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getOperandAssignment_1_2(), "rule__NumericalUnaryExpression__OperandAssignment_1_2");
					put(grammarAccess.getTypeCastExpressionAccess().getTypeAssignment_1_1(), "rule__TypeCastExpression__TypeAssignment_1_1");
					put(grammarAccess.getPrimitiveValueExpressionAccess().getValueAssignment_1(), "rule__PrimitiveValueExpression__ValueAssignment_1");
					put(grammarAccess.getFeatureCallAccess().getFeatureAssignment_1_2(), "rule__FeatureCall__FeatureAssignment_1_2");
					put(grammarAccess.getFeatureCallAccess().getOperationCallAssignment_1_3_0_0(), "rule__FeatureCall__OperationCallAssignment_1_3_0_0");
					put(grammarAccess.getFeatureCallAccess().getArgsAssignment_1_3_0_1_0(), "rule__FeatureCall__ArgsAssignment_1_3_0_1_0");
					put(grammarAccess.getFeatureCallAccess().getArgsAssignment_1_3_0_1_1_1(), "rule__FeatureCall__ArgsAssignment_1_3_0_1_1_1");
					put(grammarAccess.getFeatureCallAccess().getArrayAccessAssignment_1_3_1_0_0_0(), "rule__FeatureCall__ArrayAccessAssignment_1_3_1_0_0_0");
					put(grammarAccess.getFeatureCallAccess().getArraySelectorAssignment_1_3_1_0_0_1(), "rule__FeatureCall__ArraySelectorAssignment_1_3_1_0_0_1");
					put(grammarAccess.getFeatureCallAccess().getArraySelectorAssignment_1_3_1_1_0_1(), "rule__FeatureCall__ArraySelectorAssignment_1_3_1_1_0_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getReferenceAssignment_1(), "rule__ElementReferenceExpression__ReferenceAssignment_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getOperationCallAssignment_2_0_0(), "rule__ElementReferenceExpression__OperationCallAssignment_2_0_0");
					put(grammarAccess.getElementReferenceExpressionAccess().getArgsAssignment_2_0_1_0(), "rule__ElementReferenceExpression__ArgsAssignment_2_0_1_0");
					put(grammarAccess.getElementReferenceExpressionAccess().getArgsAssignment_2_0_1_1_1(), "rule__ElementReferenceExpression__ArgsAssignment_2_0_1_1_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getArrayAccessAssignment_2_1_0_0_0(), "rule__ElementReferenceExpression__ArrayAccessAssignment_2_1_0_0_0");
					put(grammarAccess.getElementReferenceExpressionAccess().getArraySelectorAssignment_2_1_0_0_1(), "rule__ElementReferenceExpression__ArraySelectorAssignment_2_1_0_0_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getArraySelectorAssignment_2_1_1_0_1(), "rule__ElementReferenceExpression__ArraySelectorAssignment_2_1_1_0_1");
					put(grammarAccess.getParenthesizedExpressionAccess().getExpressionAssignment_2(), "rule__ParenthesizedExpression__ExpressionAssignment_2");
					put(grammarAccess.getBoolLiteralAccess().getValueAssignment_1(), "rule__BoolLiteral__ValueAssignment_1");
					put(grammarAccess.getIntLiteralAccess().getValueAssignment_1(), "rule__IntLiteral__ValueAssignment_1");
					put(grammarAccess.getDoubleLiteralAccess().getValueAssignment_1(), "rule__DoubleLiteral__ValueAssignment_1");
					put(grammarAccess.getFloatLiteralAccess().getValueAssignment_1(), "rule__FloatLiteral__ValueAssignment_1");
					put(grammarAccess.getHexLiteralAccess().getValueAssignment_1(), "rule__HexLiteral__ValueAssignment_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
					put(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), "rule__VariableDefinition__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.yakindu.sct.domain.scenario.ui.contentassist.antlr.internal.InternalScenarioTextParser typedParser = (com.yakindu.sct.domain.scenario.ui.contentassist.antlr.internal.InternalScenarioTextParser) parser;
			typedParser.entryRuleStateScope();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ScenarioTextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ScenarioTextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
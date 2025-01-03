/*
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.serializer;

import com.google.inject.Inject;
import de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Nutzen;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Rolle;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Title;
import de.htwdd.sf.beleg.s85769s88750.myDsl.User_Stories;
import de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Ziel_Wunsch;
import de.htwdd.sf.beleg.s85769s88750.services.MyDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.NUTZEN:
				sequence_Nutzen(context, (Nutzen) semanticObject); 
				return; 
			case MyDslPackage.ROLLE:
				sequence_Rolle(context, (Rolle) semanticObject); 
				return; 
			case MyDslPackage.TITLE:
				sequence_Title(context, (Title) semanticObject); 
				return; 
			case MyDslPackage.USER_STORIES:
				sequence_User_Stories(context, (User_Stories) semanticObject); 
				return; 
			case MyDslPackage.USER_STORY:
				sequence_User_Story(context, (User_Story) semanticObject); 
				return; 
			case MyDslPackage.ZIEL_WUNSCH:
				sequence_Ziel_Wunsch(context, (Ziel_Wunsch) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Nutzen returns Nutzen
	 *
	 * Constraint:
	 *     (subject=SUBSTANTIV verb=ZUZUZUVERB)
	 * </pre>
	 */
	protected void sequence_Nutzen(ISerializationContext context, Nutzen semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUTZEN__SUBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUTZEN__SUBJECT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUTZEN__VERB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUTZEN__VERB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNutzenAccess().getSubjectSUBSTANTIVTerminalRuleCall_0_0(), semanticObject.getSubject());
		feeder.accept(grammarAccess.getNutzenAccess().getVerbZUZUZUVERBTerminalRuleCall_1_0(), semanticObject.getVerb());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rolle returns Rolle
	 *
	 * Constraint:
	 *     substantiv=SUBSTANTIV
	 * </pre>
	 */
	protected void sequence_Rolle(ISerializationContext context, Rolle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROLLE__SUBSTANTIV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROLLE__SUBSTANTIV));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRolleAccess().getSubstantivSUBSTANTIVTerminalRuleCall_0(), semanticObject.getSubstantiv());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Title returns Title
	 *
	 * Constraint:
	 *     (substantiv=SUBSTANTIV verb=VERB)
	 * </pre>
	 */
	protected void sequence_Title(ISerializationContext context, Title semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TITLE__SUBSTANTIV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TITLE__SUBSTANTIV));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TITLE__VERB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TITLE__VERB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitleAccess().getSubstantivSUBSTANTIVTerminalRuleCall_0_0(), semanticObject.getSubstantiv());
		feeder.accept(grammarAccess.getTitleAccess().getVerbVERBTerminalRuleCall_1_0(), semanticObject.getVerb());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     User_Stories returns User_Stories
	 *
	 * Constraint:
	 *     user_story+=User_Story+
	 * </pre>
	 */
	protected void sequence_User_Stories(ISerializationContext context, User_Stories semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     User_Story returns User_Story
	 *
	 * Constraint:
	 *     (title=Title nutzen=Nutzen rolle=Rolle ziel_wunsch=Ziel_Wunsch)
	 * </pre>
	 */
	protected void sequence_User_Story(ISerializationContext context, User_Story semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.USER_STORY__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.USER_STORY__TITLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.USER_STORY__NUTZEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.USER_STORY__NUTZEN));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.USER_STORY__ROLLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.USER_STORY__ROLLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.USER_STORY__ZIEL_WUNSCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.USER_STORY__ZIEL_WUNSCH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUser_StoryAccess().getTitleTitleParserRuleCall_0_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getUser_StoryAccess().getNutzenNutzenParserRuleCall_3_0(), semanticObject.getNutzen());
		feeder.accept(grammarAccess.getUser_StoryAccess().getRolleRolleParserRuleCall_5_0(), semanticObject.getRolle());
		feeder.accept(grammarAccess.getUser_StoryAccess().getZiel_wunschZiel_WunschParserRuleCall_6_0(), semanticObject.getZiel_wunsch());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Ziel_Wunsch returns Ziel_Wunsch
	 *
	 * Constraint:
	 *     (subject=SUBSTANTIV verb=VERB)
	 * </pre>
	 */
	protected void sequence_Ziel_Wunsch(ISerializationContext context, Ziel_Wunsch semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ZIEL_WUNSCH__SUBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ZIEL_WUNSCH__SUBJECT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ZIEL_WUNSCH__VERB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ZIEL_WUNSCH__VERB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getZiel_WunschAccess().getSubjectSUBSTANTIVTerminalRuleCall_0_0(), semanticObject.getSubject());
		feeder.accept(grammarAccess.getZiel_WunschAccess().getVerbVERBTerminalRuleCall_1_0(), semanticObject.getVerb());
		feeder.finish();
	}
	
	
}

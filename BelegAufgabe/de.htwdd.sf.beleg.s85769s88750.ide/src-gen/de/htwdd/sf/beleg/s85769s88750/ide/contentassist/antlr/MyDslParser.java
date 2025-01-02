/*
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.htwdd.sf.beleg.s85769s88750.ide.contentassist.antlr.internal.InternalMyDslParser;
import de.htwdd.sf.beleg.s85769s88750.services.MyDslGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getUser_StoryAccess().getGroup(), "rule__User_Story__Group__0");
			builder.put(grammarAccess.getTitleAccess().getGroup(), "rule__Title__Group__0");
			builder.put(grammarAccess.getNutzenAccess().getGroup(), "rule__Nutzen__Group__0");
			builder.put(grammarAccess.getZiel_WunschAccess().getGroup(), "rule__Ziel_Wunsch__Group__0");
			builder.put(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment(), "rule__User_Stories__User_storyAssignment");
			builder.put(grammarAccess.getUser_StoryAccess().getTitleAssignment_0(), "rule__User_Story__TitleAssignment_0");
			builder.put(grammarAccess.getUser_StoryAccess().getNutzenAssignment_3(), "rule__User_Story__NutzenAssignment_3");
			builder.put(grammarAccess.getUser_StoryAccess().getRolleAssignment_5(), "rule__User_Story__RolleAssignment_5");
			builder.put(grammarAccess.getUser_StoryAccess().getZiel_wunschAssignment_6(), "rule__User_Story__Ziel_wunschAssignment_6");
			builder.put(grammarAccess.getTitleAccess().getSubstantivAssignment_0(), "rule__Title__SubstantivAssignment_0");
			builder.put(grammarAccess.getTitleAccess().getVerbAssignment_1(), "rule__Title__VerbAssignment_1");
			builder.put(grammarAccess.getNutzenAccess().getSubjectAssignment_0(), "rule__Nutzen__SubjectAssignment_0");
			builder.put(grammarAccess.getNutzenAccess().getVerbAssignment_1(), "rule__Nutzen__VerbAssignment_1");
			builder.put(grammarAccess.getRolleAccess().getSubstantivAssignment(), "rule__Rolle__SubstantivAssignment");
			builder.put(grammarAccess.getZiel_WunschAccess().getSubjectAssignment_0(), "rule__Ziel_Wunsch__SubjectAssignment_0");
			builder.put(grammarAccess.getZiel_WunschAccess().getVerbAssignment_1(), "rule__Ziel_Wunsch__VerbAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

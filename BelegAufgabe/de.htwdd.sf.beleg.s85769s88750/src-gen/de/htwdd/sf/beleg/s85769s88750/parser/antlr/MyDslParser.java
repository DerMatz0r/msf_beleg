/*
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.parser.antlr;

import com.google.inject.Inject;
import de.htwdd.sf.beleg.s85769s88750.parser.antlr.internal.InternalMyDslParser;
import de.htwdd.sf.beleg.s85769s88750.services.MyDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MyDslParser extends AbstractAntlrParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyDslParser createParser(XtextTokenStream stream) {
		return new InternalMyDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "User_Stories";
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
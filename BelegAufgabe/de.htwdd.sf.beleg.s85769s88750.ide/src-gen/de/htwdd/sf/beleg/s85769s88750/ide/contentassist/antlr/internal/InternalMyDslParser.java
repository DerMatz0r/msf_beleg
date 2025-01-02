package de.htwdd.sf.beleg.s85769s88750.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.htwdd.sf.beleg.s85769s88750.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SUBSTANTIV", "RULE_VERB", "RULE_ZUZUZUVERB", "RULE_ANY_BUT_NOT_Z", "RULE_ANY_BUT_NOT_U", "RULE_NOT_ZU", "RULE_NEW_Z", "RULE_NEW_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Um'", "', m\\u00F6chte ich als'", "'.'"
    };
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_ZUZUZUVERB=6;
    public static final int RULE_NOT_ZU=9;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=17;
    public static final int RULE_VERB=5;
    public static final int RULE_SUBSTANTIV=4;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_ANY_BUT_NOT_Z=7;
    public static final int RULE_NEW_Z=10;
    public static final int RULE_INT=13;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int RULE_NEW_END=11;
    public static final int RULE_ANY_BUT_NOT_U=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUser_Stories"
    // InternalMyDsl.g:53:1: entryRuleUser_Stories : ruleUser_Stories EOF ;
    public final void entryRuleUser_Stories() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleUser_Stories EOF )
            // InternalMyDsl.g:55:1: ruleUser_Stories EOF
            {
             before(grammarAccess.getUser_StoriesRule()); 
            pushFollow(FOLLOW_1);
            ruleUser_Stories();

            state._fsp--;

             after(grammarAccess.getUser_StoriesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser_Stories"


    // $ANTLR start "ruleUser_Stories"
    // InternalMyDsl.g:62:1: ruleUser_Stories : ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) ) ;
    public final void ruleUser_Stories() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) ) )
            // InternalMyDsl.g:67:2: ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) )
            {
            // InternalMyDsl.g:67:2: ( ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* ) )
            // InternalMyDsl.g:68:3: ( ( rule__User_Stories__User_storyAssignment ) ) ( ( rule__User_Stories__User_storyAssignment )* )
            {
            // InternalMyDsl.g:68:3: ( ( rule__User_Stories__User_storyAssignment ) )
            // InternalMyDsl.g:69:4: ( rule__User_Stories__User_storyAssignment )
            {
             before(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 
            // InternalMyDsl.g:70:4: ( rule__User_Stories__User_storyAssignment )
            // InternalMyDsl.g:70:5: rule__User_Stories__User_storyAssignment
            {
            pushFollow(FOLLOW_3);
            rule__User_Stories__User_storyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 

            }

            // InternalMyDsl.g:73:3: ( ( rule__User_Stories__User_storyAssignment )* )
            // InternalMyDsl.g:74:4: ( rule__User_Stories__User_storyAssignment )*
            {
             before(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 
            // InternalMyDsl.g:75:4: ( rule__User_Stories__User_storyAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SUBSTANTIV) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:75:5: rule__User_Stories__User_storyAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__User_Stories__User_storyAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUser_StoriesAccess().getUser_storyAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser_Stories"


    // $ANTLR start "entryRuleUser_Story"
    // InternalMyDsl.g:85:1: entryRuleUser_Story : ruleUser_Story EOF ;
    public final void entryRuleUser_Story() throws RecognitionException {
        try {
            // InternalMyDsl.g:86:1: ( ruleUser_Story EOF )
            // InternalMyDsl.g:87:1: ruleUser_Story EOF
            {
             before(grammarAccess.getUser_StoryRule()); 
            pushFollow(FOLLOW_1);
            ruleUser_Story();

            state._fsp--;

             after(grammarAccess.getUser_StoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser_Story"


    // $ANTLR start "ruleUser_Story"
    // InternalMyDsl.g:94:1: ruleUser_Story : ( ( rule__User_Story__Group__0 ) ) ;
    public final void ruleUser_Story() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:98:2: ( ( ( rule__User_Story__Group__0 ) ) )
            // InternalMyDsl.g:99:2: ( ( rule__User_Story__Group__0 ) )
            {
            // InternalMyDsl.g:99:2: ( ( rule__User_Story__Group__0 ) )
            // InternalMyDsl.g:100:3: ( rule__User_Story__Group__0 )
            {
             before(grammarAccess.getUser_StoryAccess().getGroup()); 
            // InternalMyDsl.g:101:3: ( rule__User_Story__Group__0 )
            // InternalMyDsl.g:101:4: rule__User_Story__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser_Story"


    // $ANTLR start "entryRuleTitle"
    // InternalMyDsl.g:110:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalMyDsl.g:111:1: ( ruleTitle EOF )
            // InternalMyDsl.g:112:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalMyDsl.g:119:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:123:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalMyDsl.g:124:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalMyDsl.g:124:2: ( ( rule__Title__Group__0 ) )
            // InternalMyDsl.g:125:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalMyDsl.g:126:3: ( rule__Title__Group__0 )
            // InternalMyDsl.g:126:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:135:1: entryRuleNutzen : ruleNutzen EOF ;
    public final void entryRuleNutzen() throws RecognitionException {
        try {
            // InternalMyDsl.g:136:1: ( ruleNutzen EOF )
            // InternalMyDsl.g:137:1: ruleNutzen EOF
            {
             before(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getNutzenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:144:1: ruleNutzen : ( ( rule__Nutzen__Group__0 ) ) ;
    public final void ruleNutzen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:148:2: ( ( ( rule__Nutzen__Group__0 ) ) )
            // InternalMyDsl.g:149:2: ( ( rule__Nutzen__Group__0 ) )
            {
            // InternalMyDsl.g:149:2: ( ( rule__Nutzen__Group__0 ) )
            // InternalMyDsl.g:150:3: ( rule__Nutzen__Group__0 )
            {
             before(grammarAccess.getNutzenAccess().getGroup()); 
            // InternalMyDsl.g:151:3: ( rule__Nutzen__Group__0 )
            // InternalMyDsl.g:151:4: rule__Nutzen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "entryRuleRolle"
    // InternalMyDsl.g:160:1: entryRuleRolle : ruleRolle EOF ;
    public final void entryRuleRolle() throws RecognitionException {
        try {
            // InternalMyDsl.g:161:1: ( ruleRolle EOF )
            // InternalMyDsl.g:162:1: ruleRolle EOF
            {
             before(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getRolleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalMyDsl.g:169:1: ruleRolle : ( ( rule__Rolle__SubstantivAssignment ) ) ;
    public final void ruleRolle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:173:2: ( ( ( rule__Rolle__SubstantivAssignment ) ) )
            // InternalMyDsl.g:174:2: ( ( rule__Rolle__SubstantivAssignment ) )
            {
            // InternalMyDsl.g:174:2: ( ( rule__Rolle__SubstantivAssignment ) )
            // InternalMyDsl.g:175:3: ( rule__Rolle__SubstantivAssignment )
            {
             before(grammarAccess.getRolleAccess().getSubstantivAssignment()); 
            // InternalMyDsl.g:176:3: ( rule__Rolle__SubstantivAssignment )
            // InternalMyDsl.g:176:4: rule__Rolle__SubstantivAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Rolle__SubstantivAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRolleAccess().getSubstantivAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel_Wunsch"
    // InternalMyDsl.g:185:1: entryRuleZiel_Wunsch : ruleZiel_Wunsch EOF ;
    public final void entryRuleZiel_Wunsch() throws RecognitionException {
        try {
            // InternalMyDsl.g:186:1: ( ruleZiel_Wunsch EOF )
            // InternalMyDsl.g:187:1: ruleZiel_Wunsch EOF
            {
             before(grammarAccess.getZiel_WunschRule()); 
            pushFollow(FOLLOW_1);
            ruleZiel_Wunsch();

            state._fsp--;

             after(grammarAccess.getZiel_WunschRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZiel_Wunsch"


    // $ANTLR start "ruleZiel_Wunsch"
    // InternalMyDsl.g:194:1: ruleZiel_Wunsch : ( ( rule__Ziel_Wunsch__Group__0 ) ) ;
    public final void ruleZiel_Wunsch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:2: ( ( ( rule__Ziel_Wunsch__Group__0 ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__Ziel_Wunsch__Group__0 ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__Ziel_Wunsch__Group__0 ) )
            // InternalMyDsl.g:200:3: ( rule__Ziel_Wunsch__Group__0 )
            {
             before(grammarAccess.getZiel_WunschAccess().getGroup()); 
            // InternalMyDsl.g:201:3: ( rule__Ziel_Wunsch__Group__0 )
            // InternalMyDsl.g:201:4: rule__Ziel_Wunsch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZiel_WunschAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZiel_Wunsch"


    // $ANTLR start "rule__User_Story__Group__0"
    // InternalMyDsl.g:209:1: rule__User_Story__Group__0 : rule__User_Story__Group__0__Impl rule__User_Story__Group__1 ;
    public final void rule__User_Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:213:1: ( rule__User_Story__Group__0__Impl rule__User_Story__Group__1 )
            // InternalMyDsl.g:214:2: rule__User_Story__Group__0__Impl rule__User_Story__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__User_Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__0"


    // $ANTLR start "rule__User_Story__Group__0__Impl"
    // InternalMyDsl.g:221:1: rule__User_Story__Group__0__Impl : ( ( rule__User_Story__TitleAssignment_0 ) ) ;
    public final void rule__User_Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:225:1: ( ( ( rule__User_Story__TitleAssignment_0 ) ) )
            // InternalMyDsl.g:226:1: ( ( rule__User_Story__TitleAssignment_0 ) )
            {
            // InternalMyDsl.g:226:1: ( ( rule__User_Story__TitleAssignment_0 ) )
            // InternalMyDsl.g:227:2: ( rule__User_Story__TitleAssignment_0 )
            {
             before(grammarAccess.getUser_StoryAccess().getTitleAssignment_0()); 
            // InternalMyDsl.g:228:2: ( rule__User_Story__TitleAssignment_0 )
            // InternalMyDsl.g:228:3: rule__User_Story__TitleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__0__Impl"


    // $ANTLR start "rule__User_Story__Group__1"
    // InternalMyDsl.g:236:1: rule__User_Story__Group__1 : rule__User_Story__Group__1__Impl rule__User_Story__Group__2 ;
    public final void rule__User_Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:240:1: ( rule__User_Story__Group__1__Impl rule__User_Story__Group__2 )
            // InternalMyDsl.g:241:2: rule__User_Story__Group__1__Impl rule__User_Story__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__User_Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__1"


    // $ANTLR start "rule__User_Story__Group__1__Impl"
    // InternalMyDsl.g:248:1: rule__User_Story__Group__1__Impl : ( ':' ) ;
    public final void rule__User_Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:252:1: ( ( ':' ) )
            // InternalMyDsl.g:253:1: ( ':' )
            {
            // InternalMyDsl.g:253:1: ( ':' )
            // InternalMyDsl.g:254:2: ':'
            {
             before(grammarAccess.getUser_StoryAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__1__Impl"


    // $ANTLR start "rule__User_Story__Group__2"
    // InternalMyDsl.g:263:1: rule__User_Story__Group__2 : rule__User_Story__Group__2__Impl rule__User_Story__Group__3 ;
    public final void rule__User_Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:267:1: ( rule__User_Story__Group__2__Impl rule__User_Story__Group__3 )
            // InternalMyDsl.g:268:2: rule__User_Story__Group__2__Impl rule__User_Story__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__User_Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__2"


    // $ANTLR start "rule__User_Story__Group__2__Impl"
    // InternalMyDsl.g:275:1: rule__User_Story__Group__2__Impl : ( 'Um' ) ;
    public final void rule__User_Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:279:1: ( ( 'Um' ) )
            // InternalMyDsl.g:280:1: ( 'Um' )
            {
            // InternalMyDsl.g:280:1: ( 'Um' )
            // InternalMyDsl.g:281:2: 'Um'
            {
             before(grammarAccess.getUser_StoryAccess().getUmKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getUmKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__2__Impl"


    // $ANTLR start "rule__User_Story__Group__3"
    // InternalMyDsl.g:290:1: rule__User_Story__Group__3 : rule__User_Story__Group__3__Impl rule__User_Story__Group__4 ;
    public final void rule__User_Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:294:1: ( rule__User_Story__Group__3__Impl rule__User_Story__Group__4 )
            // InternalMyDsl.g:295:2: rule__User_Story__Group__3__Impl rule__User_Story__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__User_Story__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__3"


    // $ANTLR start "rule__User_Story__Group__3__Impl"
    // InternalMyDsl.g:302:1: rule__User_Story__Group__3__Impl : ( ( rule__User_Story__NutzenAssignment_3 ) ) ;
    public final void rule__User_Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ( rule__User_Story__NutzenAssignment_3 ) ) )
            // InternalMyDsl.g:307:1: ( ( rule__User_Story__NutzenAssignment_3 ) )
            {
            // InternalMyDsl.g:307:1: ( ( rule__User_Story__NutzenAssignment_3 ) )
            // InternalMyDsl.g:308:2: ( rule__User_Story__NutzenAssignment_3 )
            {
             before(grammarAccess.getUser_StoryAccess().getNutzenAssignment_3()); 
            // InternalMyDsl.g:309:2: ( rule__User_Story__NutzenAssignment_3 )
            // InternalMyDsl.g:309:3: rule__User_Story__NutzenAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__NutzenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getNutzenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__3__Impl"


    // $ANTLR start "rule__User_Story__Group__4"
    // InternalMyDsl.g:317:1: rule__User_Story__Group__4 : rule__User_Story__Group__4__Impl rule__User_Story__Group__5 ;
    public final void rule__User_Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:321:1: ( rule__User_Story__Group__4__Impl rule__User_Story__Group__5 )
            // InternalMyDsl.g:322:2: rule__User_Story__Group__4__Impl rule__User_Story__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__User_Story__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__4"


    // $ANTLR start "rule__User_Story__Group__4__Impl"
    // InternalMyDsl.g:329:1: rule__User_Story__Group__4__Impl : ( ', m\\u00F6chte ich als' ) ;
    public final void rule__User_Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( ( ', m\\u00F6chte ich als' ) )
            // InternalMyDsl.g:334:1: ( ', m\\u00F6chte ich als' )
            {
            // InternalMyDsl.g:334:1: ( ', m\\u00F6chte ich als' )
            // InternalMyDsl.g:335:2: ', m\\u00F6chte ich als'
            {
             before(grammarAccess.getUser_StoryAccess().getMöchteIchAlsKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getMöchteIchAlsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__4__Impl"


    // $ANTLR start "rule__User_Story__Group__5"
    // InternalMyDsl.g:344:1: rule__User_Story__Group__5 : rule__User_Story__Group__5__Impl rule__User_Story__Group__6 ;
    public final void rule__User_Story__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( rule__User_Story__Group__5__Impl rule__User_Story__Group__6 )
            // InternalMyDsl.g:349:2: rule__User_Story__Group__5__Impl rule__User_Story__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__User_Story__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__5"


    // $ANTLR start "rule__User_Story__Group__5__Impl"
    // InternalMyDsl.g:356:1: rule__User_Story__Group__5__Impl : ( ( rule__User_Story__RolleAssignment_5 ) ) ;
    public final void rule__User_Story__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( ( ( rule__User_Story__RolleAssignment_5 ) ) )
            // InternalMyDsl.g:361:1: ( ( rule__User_Story__RolleAssignment_5 ) )
            {
            // InternalMyDsl.g:361:1: ( ( rule__User_Story__RolleAssignment_5 ) )
            // InternalMyDsl.g:362:2: ( rule__User_Story__RolleAssignment_5 )
            {
             before(grammarAccess.getUser_StoryAccess().getRolleAssignment_5()); 
            // InternalMyDsl.g:363:2: ( rule__User_Story__RolleAssignment_5 )
            // InternalMyDsl.g:363:3: rule__User_Story__RolleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__RolleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getRolleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__5__Impl"


    // $ANTLR start "rule__User_Story__Group__6"
    // InternalMyDsl.g:371:1: rule__User_Story__Group__6 : rule__User_Story__Group__6__Impl rule__User_Story__Group__7 ;
    public final void rule__User_Story__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( rule__User_Story__Group__6__Impl rule__User_Story__Group__7 )
            // InternalMyDsl.g:376:2: rule__User_Story__Group__6__Impl rule__User_Story__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__User_Story__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User_Story__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__6"


    // $ANTLR start "rule__User_Story__Group__6__Impl"
    // InternalMyDsl.g:383:1: rule__User_Story__Group__6__Impl : ( ( rule__User_Story__Ziel_wunschAssignment_6 ) ) ;
    public final void rule__User_Story__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( ( ( rule__User_Story__Ziel_wunschAssignment_6 ) ) )
            // InternalMyDsl.g:388:1: ( ( rule__User_Story__Ziel_wunschAssignment_6 ) )
            {
            // InternalMyDsl.g:388:1: ( ( rule__User_Story__Ziel_wunschAssignment_6 ) )
            // InternalMyDsl.g:389:2: ( rule__User_Story__Ziel_wunschAssignment_6 )
            {
             before(grammarAccess.getUser_StoryAccess().getZiel_wunschAssignment_6()); 
            // InternalMyDsl.g:390:2: ( rule__User_Story__Ziel_wunschAssignment_6 )
            // InternalMyDsl.g:390:3: rule__User_Story__Ziel_wunschAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__Ziel_wunschAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUser_StoryAccess().getZiel_wunschAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__6__Impl"


    // $ANTLR start "rule__User_Story__Group__7"
    // InternalMyDsl.g:398:1: rule__User_Story__Group__7 : rule__User_Story__Group__7__Impl ;
    public final void rule__User_Story__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:402:1: ( rule__User_Story__Group__7__Impl )
            // InternalMyDsl.g:403:2: rule__User_Story__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User_Story__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__7"


    // $ANTLR start "rule__User_Story__Group__7__Impl"
    // InternalMyDsl.g:409:1: rule__User_Story__Group__7__Impl : ( '.' ) ;
    public final void rule__User_Story__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( ( '.' ) )
            // InternalMyDsl.g:414:1: ( '.' )
            {
            // InternalMyDsl.g:414:1: ( '.' )
            // InternalMyDsl.g:415:2: '.'
            {
             before(grammarAccess.getUser_StoryAccess().getFullStopKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUser_StoryAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Group__7__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalMyDsl.g:425:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:429:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalMyDsl.g:430:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalMyDsl.g:437:1: rule__Title__Group__0__Impl : ( ( rule__Title__SubstantivAssignment_0 ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( ( ( rule__Title__SubstantivAssignment_0 ) ) )
            // InternalMyDsl.g:442:1: ( ( rule__Title__SubstantivAssignment_0 ) )
            {
            // InternalMyDsl.g:442:1: ( ( rule__Title__SubstantivAssignment_0 ) )
            // InternalMyDsl.g:443:2: ( rule__Title__SubstantivAssignment_0 )
            {
             before(grammarAccess.getTitleAccess().getSubstantivAssignment_0()); 
            // InternalMyDsl.g:444:2: ( rule__Title__SubstantivAssignment_0 )
            // InternalMyDsl.g:444:3: rule__Title__SubstantivAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Title__SubstantivAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getSubstantivAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalMyDsl.g:452:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:456:1: ( rule__Title__Group__1__Impl )
            // InternalMyDsl.g:457:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalMyDsl.g:463:1: rule__Title__Group__1__Impl : ( ( rule__Title__VerbAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:1: ( ( ( rule__Title__VerbAssignment_1 ) ) )
            // InternalMyDsl.g:468:1: ( ( rule__Title__VerbAssignment_1 ) )
            {
            // InternalMyDsl.g:468:1: ( ( rule__Title__VerbAssignment_1 ) )
            // InternalMyDsl.g:469:2: ( rule__Title__VerbAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getVerbAssignment_1()); 
            // InternalMyDsl.g:470:2: ( rule__Title__VerbAssignment_1 )
            // InternalMyDsl.g:470:3: rule__Title__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getVerbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Nutzen__Group__0"
    // InternalMyDsl.g:479:1: rule__Nutzen__Group__0 : rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 ;
    public final void rule__Nutzen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 )
            // InternalMyDsl.g:484:2: rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Nutzen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0"


    // $ANTLR start "rule__Nutzen__Group__0__Impl"
    // InternalMyDsl.g:491:1: rule__Nutzen__Group__0__Impl : ( ( rule__Nutzen__SubjectAssignment_0 ) ) ;
    public final void rule__Nutzen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( ( ( rule__Nutzen__SubjectAssignment_0 ) ) )
            // InternalMyDsl.g:496:1: ( ( rule__Nutzen__SubjectAssignment_0 ) )
            {
            // InternalMyDsl.g:496:1: ( ( rule__Nutzen__SubjectAssignment_0 ) )
            // InternalMyDsl.g:497:2: ( rule__Nutzen__SubjectAssignment_0 )
            {
             before(grammarAccess.getNutzenAccess().getSubjectAssignment_0()); 
            // InternalMyDsl.g:498:2: ( rule__Nutzen__SubjectAssignment_0 )
            // InternalMyDsl.g:498:3: rule__Nutzen__SubjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__SubjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getSubjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0__Impl"


    // $ANTLR start "rule__Nutzen__Group__1"
    // InternalMyDsl.g:506:1: rule__Nutzen__Group__1 : rule__Nutzen__Group__1__Impl ;
    public final void rule__Nutzen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:510:1: ( rule__Nutzen__Group__1__Impl )
            // InternalMyDsl.g:511:2: rule__Nutzen__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1"


    // $ANTLR start "rule__Nutzen__Group__1__Impl"
    // InternalMyDsl.g:517:1: rule__Nutzen__Group__1__Impl : ( ( rule__Nutzen__VerbAssignment_1 ) ) ;
    public final void rule__Nutzen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( ( ( rule__Nutzen__VerbAssignment_1 ) ) )
            // InternalMyDsl.g:522:1: ( ( rule__Nutzen__VerbAssignment_1 ) )
            {
            // InternalMyDsl.g:522:1: ( ( rule__Nutzen__VerbAssignment_1 ) )
            // InternalMyDsl.g:523:2: ( rule__Nutzen__VerbAssignment_1 )
            {
             before(grammarAccess.getNutzenAccess().getVerbAssignment_1()); 
            // InternalMyDsl.g:524:2: ( rule__Nutzen__VerbAssignment_1 )
            // InternalMyDsl.g:524:3: rule__Nutzen__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getVerbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1__Impl"


    // $ANTLR start "rule__Ziel_Wunsch__Group__0"
    // InternalMyDsl.g:533:1: rule__Ziel_Wunsch__Group__0 : rule__Ziel_Wunsch__Group__0__Impl rule__Ziel_Wunsch__Group__1 ;
    public final void rule__Ziel_Wunsch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( rule__Ziel_Wunsch__Group__0__Impl rule__Ziel_Wunsch__Group__1 )
            // InternalMyDsl.g:538:2: rule__Ziel_Wunsch__Group__0__Impl rule__Ziel_Wunsch__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Ziel_Wunsch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__0"


    // $ANTLR start "rule__Ziel_Wunsch__Group__0__Impl"
    // InternalMyDsl.g:545:1: rule__Ziel_Wunsch__Group__0__Impl : ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) ) ;
    public final void rule__Ziel_Wunsch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) ) )
            // InternalMyDsl.g:550:1: ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) )
            {
            // InternalMyDsl.g:550:1: ( ( rule__Ziel_Wunsch__SubjectAssignment_0 ) )
            // InternalMyDsl.g:551:2: ( rule__Ziel_Wunsch__SubjectAssignment_0 )
            {
             before(grammarAccess.getZiel_WunschAccess().getSubjectAssignment_0()); 
            // InternalMyDsl.g:552:2: ( rule__Ziel_Wunsch__SubjectAssignment_0 )
            // InternalMyDsl.g:552:3: rule__Ziel_Wunsch__SubjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__SubjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getZiel_WunschAccess().getSubjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__0__Impl"


    // $ANTLR start "rule__Ziel_Wunsch__Group__1"
    // InternalMyDsl.g:560:1: rule__Ziel_Wunsch__Group__1 : rule__Ziel_Wunsch__Group__1__Impl ;
    public final void rule__Ziel_Wunsch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:564:1: ( rule__Ziel_Wunsch__Group__1__Impl )
            // InternalMyDsl.g:565:2: rule__Ziel_Wunsch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__1"


    // $ANTLR start "rule__Ziel_Wunsch__Group__1__Impl"
    // InternalMyDsl.g:571:1: rule__Ziel_Wunsch__Group__1__Impl : ( ( rule__Ziel_Wunsch__VerbAssignment_1 ) ) ;
    public final void rule__Ziel_Wunsch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:575:1: ( ( ( rule__Ziel_Wunsch__VerbAssignment_1 ) ) )
            // InternalMyDsl.g:576:1: ( ( rule__Ziel_Wunsch__VerbAssignment_1 ) )
            {
            // InternalMyDsl.g:576:1: ( ( rule__Ziel_Wunsch__VerbAssignment_1 ) )
            // InternalMyDsl.g:577:2: ( rule__Ziel_Wunsch__VerbAssignment_1 )
            {
             before(grammarAccess.getZiel_WunschAccess().getVerbAssignment_1()); 
            // InternalMyDsl.g:578:2: ( rule__Ziel_Wunsch__VerbAssignment_1 )
            // InternalMyDsl.g:578:3: rule__Ziel_Wunsch__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ziel_Wunsch__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getZiel_WunschAccess().getVerbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__Group__1__Impl"


    // $ANTLR start "rule__User_Stories__User_storyAssignment"
    // InternalMyDsl.g:587:1: rule__User_Stories__User_storyAssignment : ( ruleUser_Story ) ;
    public final void rule__User_Stories__User_storyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( ruleUser_Story ) )
            // InternalMyDsl.g:592:2: ( ruleUser_Story )
            {
            // InternalMyDsl.g:592:2: ( ruleUser_Story )
            // InternalMyDsl.g:593:3: ruleUser_Story
            {
             before(grammarAccess.getUser_StoriesAccess().getUser_storyUser_StoryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUser_Story();

            state._fsp--;

             after(grammarAccess.getUser_StoriesAccess().getUser_storyUser_StoryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Stories__User_storyAssignment"


    // $ANTLR start "rule__User_Story__TitleAssignment_0"
    // InternalMyDsl.g:602:1: rule__User_Story__TitleAssignment_0 : ( ruleTitle ) ;
    public final void rule__User_Story__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:606:1: ( ( ruleTitle ) )
            // InternalMyDsl.g:607:2: ( ruleTitle )
            {
            // InternalMyDsl.g:607:2: ( ruleTitle )
            // InternalMyDsl.g:608:3: ruleTitle
            {
             before(grammarAccess.getUser_StoryAccess().getTitleTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getTitleTitleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__TitleAssignment_0"


    // $ANTLR start "rule__User_Story__NutzenAssignment_3"
    // InternalMyDsl.g:617:1: rule__User_Story__NutzenAssignment_3 : ( ruleNutzen ) ;
    public final void rule__User_Story__NutzenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ruleNutzen ) )
            // InternalMyDsl.g:622:2: ( ruleNutzen )
            {
            // InternalMyDsl.g:622:2: ( ruleNutzen )
            // InternalMyDsl.g:623:3: ruleNutzen
            {
             before(grammarAccess.getUser_StoryAccess().getNutzenNutzenParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getNutzenNutzenParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__NutzenAssignment_3"


    // $ANTLR start "rule__User_Story__RolleAssignment_5"
    // InternalMyDsl.g:632:1: rule__User_Story__RolleAssignment_5 : ( ruleRolle ) ;
    public final void rule__User_Story__RolleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( ( ruleRolle ) )
            // InternalMyDsl.g:637:2: ( ruleRolle )
            {
            // InternalMyDsl.g:637:2: ( ruleRolle )
            // InternalMyDsl.g:638:3: ruleRolle
            {
             before(grammarAccess.getUser_StoryAccess().getRolleRolleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getRolleRolleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__RolleAssignment_5"


    // $ANTLR start "rule__User_Story__Ziel_wunschAssignment_6"
    // InternalMyDsl.g:647:1: rule__User_Story__Ziel_wunschAssignment_6 : ( ruleZiel_Wunsch ) ;
    public final void rule__User_Story__Ziel_wunschAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( ruleZiel_Wunsch ) )
            // InternalMyDsl.g:652:2: ( ruleZiel_Wunsch )
            {
            // InternalMyDsl.g:652:2: ( ruleZiel_Wunsch )
            // InternalMyDsl.g:653:3: ruleZiel_Wunsch
            {
             before(grammarAccess.getUser_StoryAccess().getZiel_wunschZiel_WunschParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleZiel_Wunsch();

            state._fsp--;

             after(grammarAccess.getUser_StoryAccess().getZiel_wunschZiel_WunschParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User_Story__Ziel_wunschAssignment_6"


    // $ANTLR start "rule__Title__SubstantivAssignment_0"
    // InternalMyDsl.g:662:1: rule__Title__SubstantivAssignment_0 : ( RULE_SUBSTANTIV ) ;
    public final void rule__Title__SubstantivAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:667:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:667:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:668:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getTitleAccess().getSubstantivSUBSTANTIVTerminalRuleCall_0_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getSubstantivSUBSTANTIVTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__SubstantivAssignment_0"


    // $ANTLR start "rule__Title__VerbAssignment_1"
    // InternalMyDsl.g:677:1: rule__Title__VerbAssignment_1 : ( RULE_VERB ) ;
    public final void rule__Title__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( RULE_VERB ) )
            // InternalMyDsl.g:682:2: ( RULE_VERB )
            {
            // InternalMyDsl.g:682:2: ( RULE_VERB )
            // InternalMyDsl.g:683:3: RULE_VERB
            {
             before(grammarAccess.getTitleAccess().getVerbVERBTerminalRuleCall_1_0()); 
            match(input,RULE_VERB,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getVerbVERBTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__VerbAssignment_1"


    // $ANTLR start "rule__Nutzen__SubjectAssignment_0"
    // InternalMyDsl.g:692:1: rule__Nutzen__SubjectAssignment_0 : ( RULE_SUBSTANTIV ) ;
    public final void rule__Nutzen__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:697:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:697:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:698:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getNutzenAccess().getSubjectSUBSTANTIVTerminalRuleCall_0_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getSubjectSUBSTANTIVTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__SubjectAssignment_0"


    // $ANTLR start "rule__Nutzen__VerbAssignment_1"
    // InternalMyDsl.g:707:1: rule__Nutzen__VerbAssignment_1 : ( RULE_ZUZUZUVERB ) ;
    public final void rule__Nutzen__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( ( RULE_ZUZUZUVERB ) )
            // InternalMyDsl.g:712:2: ( RULE_ZUZUZUVERB )
            {
            // InternalMyDsl.g:712:2: ( RULE_ZUZUZUVERB )
            // InternalMyDsl.g:713:3: RULE_ZUZUZUVERB
            {
             before(grammarAccess.getNutzenAccess().getVerbZUZUZUVERBTerminalRuleCall_1_0()); 
            match(input,RULE_ZUZUZUVERB,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getVerbZUZUZUVERBTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__VerbAssignment_1"


    // $ANTLR start "rule__Rolle__SubstantivAssignment"
    // InternalMyDsl.g:722:1: rule__Rolle__SubstantivAssignment : ( RULE_SUBSTANTIV ) ;
    public final void rule__Rolle__SubstantivAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:727:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:727:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:728:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getRolleAccess().getSubstantivSUBSTANTIVTerminalRuleCall_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getRolleAccess().getSubstantivSUBSTANTIVTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__SubstantivAssignment"


    // $ANTLR start "rule__Ziel_Wunsch__SubjectAssignment_0"
    // InternalMyDsl.g:737:1: rule__Ziel_Wunsch__SubjectAssignment_0 : ( RULE_SUBSTANTIV ) ;
    public final void rule__Ziel_Wunsch__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:742:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:742:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:743:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getZiel_WunschAccess().getSubjectSUBSTANTIVTerminalRuleCall_0_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getZiel_WunschAccess().getSubjectSUBSTANTIVTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__SubjectAssignment_0"


    // $ANTLR start "rule__Ziel_Wunsch__VerbAssignment_1"
    // InternalMyDsl.g:752:1: rule__Ziel_Wunsch__VerbAssignment_1 : ( RULE_VERB ) ;
    public final void rule__Ziel_Wunsch__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( RULE_VERB ) )
            // InternalMyDsl.g:757:2: ( RULE_VERB )
            {
            // InternalMyDsl.g:757:2: ( RULE_VERB )
            // InternalMyDsl.g:758:3: RULE_VERB
            {
             before(grammarAccess.getZiel_WunschAccess().getVerbVERBTerminalRuleCall_1_0()); 
            match(input,RULE_VERB,FOLLOW_2); 
             after(grammarAccess.getZiel_WunschAccess().getVerbVERBTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel_Wunsch__VerbAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});

}
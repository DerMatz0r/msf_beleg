package de.htwdd.sf.beleg.s85769s88750.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( ':' )
            // InternalMyDsl.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'Um' )
            // InternalMyDsl.g:12:9: 'Um'
            {
            match("Um"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( ', m\\u00F6chte ich als' )
            // InternalMyDsl.g:13:9: ', m\\u00F6chte ich als'
            {
            match(", m\u00F6chte ich als"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '.' )
            // InternalMyDsl.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_ANY_BUT_NOT_Z"
    public final void mRULE_ANY_BUT_NOT_Z() throws RecognitionException {
        try {
            // InternalMyDsl.g:410:29: ( 'a' .. 'y' )
            // InternalMyDsl.g:410:31: 'a' .. 'y'
            {
            matchRange('a','y'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_BUT_NOT_Z"

    // $ANTLR start "RULE_ANY_BUT_NOT_U"
    public final void mRULE_ANY_BUT_NOT_U() throws RecognitionException {
        try {
            // InternalMyDsl.g:412:29: ( ( 'a' .. 't' | 'v' .. 'z' ) )
            // InternalMyDsl.g:412:31: ( 'a' .. 't' | 'v' .. 'z' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_BUT_NOT_U"

    // $ANTLR start "RULE_NOT_ZU"
    public final void mRULE_NOT_ZU() throws RecognitionException {
        try {
            // InternalMyDsl.g:414:22: ( ( 'a' .. 't' | 'v' .. 'y' ) )
            // InternalMyDsl.g:414:24: ( 'a' .. 't' | 'v' .. 'y' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='y') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_ZU"

    // $ANTLR start "RULE_NEW_Z"
    public final void mRULE_NEW_Z() throws RecognitionException {
        try {
            // InternalMyDsl.g:416:21: ( ( 'z' )+ RULE_NOT_ZU )
            // InternalMyDsl.g:416:23: ( 'z' )+ RULE_NOT_ZU
            {
            // InternalMyDsl.g:416:23: ( 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='z') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:416:23: 'z'
            	    {
            	    match('z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            mRULE_NOT_ZU(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW_Z"

    // $ANTLR start "RULE_NEW_END"
    public final void mRULE_NEW_END() throws RecognitionException {
        try {
            // InternalMyDsl.g:418:23: ( ( 'z' )* 'zuzu' )
            // InternalMyDsl.g:418:25: ( 'z' )* 'zuzu'
            {
            // InternalMyDsl.g:418:25: ( 'z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='z') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='z') ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:418:25: 'z'
            	    {
            	    match('z'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("zuzu"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW_END"

    // $ANTLR start "RULE_ZUZUZUVERB"
    public final void mRULE_ZUZUZUVERB() throws RecognitionException {
        try {
            int _type = RULE_ZUZUZUVERB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:420:17: ( 'zu' ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )* RULE_NEW_END ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )* ( 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:420:19: 'zu' ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )* RULE_NEW_END ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )* ( 'en' | 'ern' | 'eln' )
            {
            match("zu"); 

            // InternalMyDsl.g:420:24: ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )*
            loop3:
            do {
                int alt3=3;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:420:25: RULE_ANY_BUT_NOT_Z
            	    {
            	    mRULE_ANY_BUT_NOT_Z(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:420:44: RULE_NEW_Z
            	    {
            	    mRULE_NEW_Z(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRULE_NEW_END(); 
            // InternalMyDsl.g:420:70: ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )*
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:420:71: RULE_ANY_BUT_NOT_Z
            	    {
            	    mRULE_ANY_BUT_NOT_Z(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:420:90: RULE_NEW_Z
            	    {
            	    mRULE_NEW_Z(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:420:103: ( 'en' | 'ern' | 'eln' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='e') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt5=1;
                    }
                    break;
                case 'r':
                    {
                    alt5=2;
                    }
                    break;
                case 'l':
                    {
                    alt5=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:420:104: 'en'
                    {
                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:420:109: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:420:115: 'eln'
                    {
                    match("eln"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZUZUZUVERB"

    // $ANTLR start "RULE_SUBSTANTIV"
    public final void mRULE_SUBSTANTIV() throws RecognitionException {
        try {
            int _type = RULE_SUBSTANTIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:422:17: ( ( 'A' .. 'Z' | '\\u00C4' | '\\u00DC' | '\\u00D6' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' )+ )
            // InternalMyDsl.g:422:19: ( 'A' .. 'Z' | '\\u00C4' | '\\u00DC' | '\\u00D6' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:422:57: ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='a' && LA6_0<='z')||LA6_0=='\u00DF'||LA6_0=='\u00E4'||LA6_0=='\u00F6'||LA6_0=='\u00FC') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUBSTANTIV"

    // $ANTLR start "RULE_VERB"
    public final void mRULE_VERB() throws RecognitionException {
        try {
            int _type = RULE_VERB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:424:11: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )+ ( 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:424:13: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )+ ( 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:424:13: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' | '\\u00DF' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='e') ) {
                    switch ( input.LA(2) ) {
                    case 'n':
                        {
                        int LA7_3 = input.LA(3);

                        if ( ((LA7_3>='a' && LA7_3<='z')||LA7_3=='\u00DF'||LA7_3=='\u00E4'||LA7_3=='\u00F6'||LA7_3=='\u00FC') ) {
                            alt7=1;
                        }


                        }
                        break;
                    case 'r':
                        {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4=='n') ) {
                            int LA7_7 = input.LA(4);

                            if ( ((LA7_7>='a' && LA7_7<='z')||LA7_7=='\u00DF'||LA7_7=='\u00E4'||LA7_7=='\u00F6'||LA7_7=='\u00FC') ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_4>='a' && LA7_4<='m')||(LA7_4>='o' && LA7_4<='z')||LA7_4=='\u00DF'||LA7_4=='\u00E4'||LA7_4=='\u00F6'||LA7_4=='\u00FC') ) {
                            alt7=1;
                        }


                        }
                        break;
                    case 'l':
                        {
                        int LA7_5 = input.LA(3);

                        if ( (LA7_5=='n') ) {
                            int LA7_8 = input.LA(4);

                            if ( ((LA7_8>='a' && LA7_8<='z')||LA7_8=='\u00DF'||LA7_8=='\u00E4'||LA7_8=='\u00F6'||LA7_8=='\u00FC') ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_5>='a' && LA7_5<='m')||(LA7_5>='o' && LA7_5<='z')||LA7_5=='\u00DF'||LA7_5=='\u00E4'||LA7_5=='\u00F6'||LA7_5=='\u00FC') ) {
                            alt7=1;
                        }


                        }
                        break;
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '\u00DF':
                    case '\u00E4':
                    case '\u00F6':
                    case '\u00FC':
                        {
                        alt7=1;
                        }
                        break;

                    }

                }
                else if ( ((LA7_0>='a' && LA7_0<='d')||(LA7_0>='f' && LA7_0<='z')||LA7_0=='\u00DF'||LA7_0=='\u00E4'||LA7_0=='\u00F6'||LA7_0=='\u00FC') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalMyDsl.g:424:61: ( 'en' | 'ern' | 'eln' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='e') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt8=1;
                    }
                    break;
                case 'r':
                    {
                    alt8=2;
                    }
                    break;
                case 'l':
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:424:62: 'en'
                    {
                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:424:67: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:424:73: 'eln'
                    {
                    match("eln"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERB"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:426:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:426:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:426:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:426:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:426:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:428:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:428:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:428:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:428:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:430:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:430:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:430:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:430:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:430:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:430:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:430:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:430:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:430:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:430:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:430:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:432:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:432:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:432:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:432:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:434:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:434:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:434:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:434:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalMyDsl.g:434:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:434:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:434:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:434:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:436:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:436:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:436:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:438:16: ( . )
            // InternalMyDsl.g:438:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | RULE_ZUZUZUVERB | RULE_SUBSTANTIV | RULE_VERB | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=14;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalMyDsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: RULE_ZUZUZUVERB
                {
                mRULE_ZUZUZUVERB(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:50: RULE_SUBSTANTIV
                {
                mRULE_SUBSTANTIV(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:66: RULE_VERB
                {
                mRULE_VERB(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:76: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:84: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:93: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:121: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:137: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:145: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA3_eotS =
        "\5\uffff";
    static final String DFA3_eofS =
        "\5\uffff";
    static final String DFA3_minS =
        "\2\141\3\uffff";
    static final String DFA3_maxS =
        "\2\172\3\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\3\1\2";
    static final String DFA3_specialS =
        "\5\uffff}>";
    static final String[] DFA3_transitionS = {
            "\31\2\1\1",
            "\24\4\1\3\4\4\1\1",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 420:24: ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )*";
        }
    }
    static final String DFA4_eotS =
        "\4\uffff\1\7\3\uffff\2\7";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\2\141\2\uffff\3\141\1\uffff\2\141";
    static final String DFA4_maxS =
        "\2\172\2\uffff\3\172\1\uffff\2\172";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\3\uffff\1\3\2\uffff";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\4\2\1\1\24\2\1\3",
            "\13\2\1\6\1\2\1\4\3\2\1\5\10\2",
            "",
            "",
            "\32\2",
            "\15\2\1\10\14\2",
            "\15\2\1\11\14\2",
            "",
            "\32\2",
            "\32\2"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 420:70: ( RULE_ANY_BUT_NOT_Z | RULE_NEW_Z )*";
        }
    }
    static final String DFA20_eotS =
        "\2\uffff\1\25\1\21\1\uffff\3\25\3\21\2\uffff\3\21\3\uffff\1\42\1\26\4\uffff\3\25\7\uffff\3\25\1\34\2\25\1\34\5\25\4\34\5\25\1\75\4\25\1\uffff\2\75\1\34\2\25\2\34";
    static final String DFA20_eofS =
        "\105\uffff";
    static final String DFA20_minS =
        "\1\0\1\uffff\1\141\1\40\1\uffff\3\141\1\101\2\141\2\uffff\2\0\1\52\3\uffff\2\60\4\uffff\3\141\7\uffff\3\141\1\60\2\141\1\60\5\141\4\60\5\141\1\60\4\141\1\uffff\3\60\2\141\2\60";
    static final String DFA20_maxS =
        "\1\uffff\1\uffff\1\u00fc\1\40\1\uffff\3\u00fc\1\172\2\u00fc\2\uffff\2\uffff\1\57\3\uffff\1\u00fc\1\172\4\uffff\3\u00fc\7\uffff\3\u00fc\1\172\2\u00fc\1\172\5\u00fc\4\172\12\u00fc\1\uffff\2\u00fc\1\172\2\u00fc\2\172";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\6\uffff\1\10\1\11\3\uffff\1\15\1\16\1\1\2\uffff\1\10\1\6\1\3\1\4\3\uffff\1\7\1\11\1\12\1\13\1\14\1\15\1\2\32\uffff\1\5\7\uffff";
    static final String DFA20_specialS =
        "\1\2\14\uffff\1\0\1\1\66\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\4\21\1\3\1\21\1\4\1\17\12\14\1\1\6\21\24\6\1\2\5\6\3\21\1\10\1\13\1\21\31\7\1\5\111\21\1\11\21\21\1\11\5\21\1\11\2\21\1\12\4\21\1\12\21\21\1\12\5\21\1\12\uff03\21",
            "",
            "\14\24\1\23\15\24\144\uffff\1\26\4\uffff\1\26\21\uffff\1\26\5\uffff\1\26",
            "\1\27",
            "",
            "\4\33\1\32\17\33\1\31\5\33\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\32\24\144\uffff\1\26\4\uffff\1\26\21\uffff\1\26\5\uffff\1\26",
            "\4\33\1\32\25\33\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\32\26\144\uffff\1\26\4\uffff\1\26\21\uffff\1\26\5\uffff\1\26",
            "\32\34\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "",
            "",
            "\0\36",
            "\0\36",
            "\1\37\4\uffff\1\40",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\24\144\uffff\1\26\4\uffff\1\26\21\uffff\1\26\5\uffff\1\26",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\24",
            "",
            "",
            "",
            "",
            "\4\45\1\43\24\45\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\33\1\32\6\33\1\50\1\33\1\46\3\33\1\47\10\33\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\33\1\32\25\33\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\45\1\43\6\45\1\53\1\45\1\51\3\45\1\52\7\45\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\56\1\55\17\56\1\54\4\56\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\45\1\43\24\45\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\33\1\32\25\33",
            "\4\33\1\32\10\33\1\57\14\33\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\33\1\32\10\33\1\60\14\33\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\45\1\43\24\45\1\44",
            "\4\45\1\43\10\45\1\61\13\45\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\45\1\43\10\45\1\62\13\45\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\33\1\32\24\33\1\63\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\45\1\43\6\45\1\53\1\45\1\51\3\45\1\52\7\45\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\45\1\43\24\45\1\44\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\33\1\32\25\33",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\33\1\32\25\33",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\45\1\43\24\45\1\44",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\45\1\43\24\45\1\44",
            "\4\33\1\32\17\33\1\64\5\33\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\24\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\6\66\1\72\1\66\1\70\3\66\1\71\7\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\24\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\74\1\73\17\74\1\33\4\74\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\66\1\65\24\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\10\66\1\76\13\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\10\66\1\77\13\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\6\66\1\102\1\66\1\100\3\66\1\101\7\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\24\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\66\1\65\24\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\66\1\65\24\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\66\1\65\24\66\1\67",
            "\4\66\1\65\10\66\1\103\13\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\4\66\1\65\10\66\1\104\13\66\1\67\144\uffff\1\34\4\uffff\1\34\21\uffff\1\34\5\uffff\1\34",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\66\1\65\24\66\1\67",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\66\1\65\24\66\1\67"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | RULE_ZUZUZUVERB | RULE_SUBSTANTIV | RULE_VERB | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_13 = input.LA(1);

                        s = -1;
                        if ( ((LA20_13>='\u0000' && LA20_13<='\uFFFF')) ) {s = 30;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_14 = input.LA(1);

                        s = -1;
                        if ( ((LA20_14>='\u0000' && LA20_14<='\uFFFF')) ) {s = 30;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0==':') ) {s = 1;}

                        else if ( (LA20_0=='U') ) {s = 2;}

                        else if ( (LA20_0==',') ) {s = 3;}

                        else if ( (LA20_0=='.') ) {s = 4;}

                        else if ( (LA20_0=='z') ) {s = 5;}

                        else if ( ((LA20_0>='A' && LA20_0<='T')||(LA20_0>='V' && LA20_0<='Z')) ) {s = 6;}

                        else if ( ((LA20_0>='a' && LA20_0<='y')) ) {s = 7;}

                        else if ( (LA20_0=='^') ) {s = 8;}

                        else if ( (LA20_0=='\u00C4'||LA20_0=='\u00D6'||LA20_0=='\u00DC') ) {s = 9;}

                        else if ( (LA20_0=='\u00DF'||LA20_0=='\u00E4'||LA20_0=='\u00F6'||LA20_0=='\u00FC') ) {s = 10;}

                        else if ( (LA20_0=='_') ) {s = 11;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 12;}

                        else if ( (LA20_0=='\"') ) {s = 13;}

                        else if ( (LA20_0=='\'') ) {s = 14;}

                        else if ( (LA20_0=='/') ) {s = 15;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 16;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='+')||LA20_0=='-'||(LA20_0>=';' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\u00C3')||(LA20_0>='\u00C5' && LA20_0<='\u00D5')||(LA20_0>='\u00D7' && LA20_0<='\u00DB')||(LA20_0>='\u00DD' && LA20_0<='\u00DE')||(LA20_0>='\u00E0' && LA20_0<='\u00E3')||(LA20_0>='\u00E5' && LA20_0<='\u00F5')||(LA20_0>='\u00F7' && LA20_0<='\u00FB')||(LA20_0>='\u00FD' && LA20_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
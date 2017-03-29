package com.yakindu.sct.domain.scenario.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScenarioTextLexer extends Lexer {
    public static final int RULE_HEX=9;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_BOOL=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_DOUBLE=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalScenarioTextLexer() {;} 
    public InternalScenarioTextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalScenarioTextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalScenarioText.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:11:7: ( 'blocks' )
            // InternalScenarioText.g:11:9: 'blocks'
            {
            match("blocks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:12:7: ( '{' )
            // InternalScenarioText.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:13:7: ( '}' )
            // InternalScenarioText.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:14:7: ( '@@statechart@@' )
            // InternalScenarioText.g:14:9: '@@statechart@@'
            {
            match("@@statechart@@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:15:7: ( '@@state@@' )
            // InternalScenarioText.g:15:9: '@@state@@'
            {
            match("@@state@@"); 


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
            // InternalScenarioText.g:16:7: ( '@@transition@@' )
            // InternalScenarioText.g:16:9: '@@transition@@'
            {
            match("@@transition@@"); 


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
            // InternalScenarioText.g:17:7: ( 'namespace' )
            // InternalScenarioText.g:17:9: 'namespace'
            {
            match("namespace"); 


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
            // InternalScenarioText.g:18:7: ( 'interface' )
            // InternalScenarioText.g:18:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:19:7: ( ':' )
            // InternalScenarioText.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:20:7: ( 'internal' )
            // InternalScenarioText.g:20:9: 'internal'
            {
            match("internal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:21:7: ( 'import' )
            // InternalScenarioText.g:21:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:22:7: ( '.' )
            // InternalScenarioText.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:23:7: ( 'event' )
            // InternalScenarioText.g:23:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:24:7: ( 'const' )
            // InternalScenarioText.g:24:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:25:7: ( 'var' )
            // InternalScenarioText.g:25:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:26:7: ( 'readonly' )
            // InternalScenarioText.g:26:9: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:27:7: ( 'external' )
            // InternalScenarioText.g:27:9: 'external'
            {
            match("external"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:28:7: ( '=' )
            // InternalScenarioText.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:29:7: ( 'alias' )
            // InternalScenarioText.g:29:9: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:30:7: ( 'operation' )
            // InternalScenarioText.g:30:9: 'operation'
            {
            match("operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:31:7: ( '(' )
            // InternalScenarioText.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:32:7: ( ',' )
            // InternalScenarioText.g:32:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:33:7: ( ')' )
            // InternalScenarioText.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:34:7: ( '<' )
            // InternalScenarioText.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:35:7: ( '>' )
            // InternalScenarioText.g:35:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:36:7: ( '...' )
            // InternalScenarioText.g:36:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:37:7: ( '/' )
            // InternalScenarioText.g:37:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:38:7: ( '#' )
            // InternalScenarioText.g:38:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:39:7: ( '[' )
            // InternalScenarioText.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:40:7: ( ']' )
            // InternalScenarioText.g:40:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:41:7: ( 'default' )
            // InternalScenarioText.g:41:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:42:7: ( 'else' )
            // InternalScenarioText.g:42:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:43:7: ( ';' )
            // InternalScenarioText.g:43:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:44:7: ( 'entry' )
            // InternalScenarioText.g:44:9: 'entry'
            {
            match("entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:45:7: ( 'exit' )
            // InternalScenarioText.g:45:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:46:7: ( 'always' )
            // InternalScenarioText.g:46:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:47:7: ( 'oncycle' )
            // InternalScenarioText.g:47:9: 'oncycle'
            {
            match("oncycle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:48:7: ( 'raise' )
            // InternalScenarioText.g:48:9: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:49:7: ( 'valueof' )
            // InternalScenarioText.g:49:9: 'valueof'
            {
            match("valueof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:50:7: ( 'active' )
            // InternalScenarioText.g:50:9: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:51:7: ( 'local' )
            // InternalScenarioText.g:51:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:52:7: ( 'in' )
            // InternalScenarioText.g:52:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:53:7: ( 'out' )
            // InternalScenarioText.g:53:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:54:7: ( '?' )
            // InternalScenarioText.g:54:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:55:7: ( 'as' )
            // InternalScenarioText.g:55:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:56:7: ( 'null' )
            // InternalScenarioText.g:56:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:57:7: ( '&&' )
            // InternalScenarioText.g:57:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:58:7: ( '||' )
            // InternalScenarioText.g:58:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:59:7: ( '!' )
            // InternalScenarioText.g:59:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:60:7: ( '^' )
            // InternalScenarioText.g:60:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:61:7: ( '|' )
            // InternalScenarioText.g:61:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:62:7: ( '&' )
            // InternalScenarioText.g:62:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:63:7: ( 'after' )
            // InternalScenarioText.g:63:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:64:7: ( 'every' )
            // InternalScenarioText.g:64:9: 'every'
            {
            match("every"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:65:7: ( 's' )
            // InternalScenarioText.g:65:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:66:7: ( 'ms' )
            // InternalScenarioText.g:66:9: 'ms'
            {
            match("ms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:67:7: ( 'us' )
            // InternalScenarioText.g:67:9: 'us'
            {
            match("us"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:68:7: ( 'ns' )
            // InternalScenarioText.g:68:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:69:7: ( '*=' )
            // InternalScenarioText.g:69:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:70:7: ( '/=' )
            // InternalScenarioText.g:70:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:71:7: ( '%=' )
            // InternalScenarioText.g:71:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:72:7: ( '+=' )
            // InternalScenarioText.g:72:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:73:7: ( '-=' )
            // InternalScenarioText.g:73:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:74:7: ( '<<=' )
            // InternalScenarioText.g:74:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:75:7: ( '>>=' )
            // InternalScenarioText.g:75:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:76:7: ( '&=' )
            // InternalScenarioText.g:76:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:77:7: ( '^=' )
            // InternalScenarioText.g:77:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:78:7: ( '|=' )
            // InternalScenarioText.g:78:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:79:7: ( '<<' )
            // InternalScenarioText.g:79:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:80:7: ( '>>' )
            // InternalScenarioText.g:80:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:81:7: ( '+' )
            // InternalScenarioText.g:81:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:82:7: ( '-' )
            // InternalScenarioText.g:82:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:83:7: ( '*' )
            // InternalScenarioText.g:83:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:84:7: ( '%' )
            // InternalScenarioText.g:84:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:85:7: ( '~' )
            // InternalScenarioText.g:85:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:86:7: ( '<=' )
            // InternalScenarioText.g:86:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:87:7: ( '>=' )
            // InternalScenarioText.g:87:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:88:7: ( '==' )
            // InternalScenarioText.g:88:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:89:7: ( '!=' )
            // InternalScenarioText.g:89:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:5417:11: ( ( 'true' | 'false' | 'yes' | 'no' ) )
            // InternalScenarioText.g:5417:13: ( 'true' | 'false' | 'yes' | 'no' )
            {
            // InternalScenarioText.g:5417:13: ( 'true' | 'false' | 'yes' | 'no' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'y':
                {
                alt1=3;
                }
                break;
            case 'n':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalScenarioText.g:5417:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5417:21: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalScenarioText.g:5417:29: 'yes'
                    {
                    match("yes"); 


                    }
                    break;
                case 4 :
                    // InternalScenarioText.g:5417:35: 'no'
                    {
                    match("no"); 


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
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:5419:10: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalScenarioText.g:5419:12: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalScenarioText.g:5419:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScenarioText.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:5421:13: ( RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'd' | 'D' )? )
            // InternalScenarioText.g:5421:15: RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'd' | 'D' )?
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            // InternalScenarioText.g:5421:37: ( 'e' ( '-' | '+' ) RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='e') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalScenarioText.g:5421:38: 'e' ( '-' | '+' ) RULE_INT
                    {
                    match('e'); 
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalScenarioText.g:5421:63: ( 'd' | 'D' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='D'||LA4_0=='d') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalScenarioText.g:
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:5423:12: ( RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'f' | 'F' )? )
            // InternalScenarioText.g:5423:14: RULE_INT '.' RULE_INT ( 'e' ( '-' | '+' ) RULE_INT )? ( 'f' | 'F' )?
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 
            // InternalScenarioText.g:5423:36: ( 'e' ( '-' | '+' ) RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='e') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalScenarioText.g:5423:37: 'e' ( '-' | '+' ) RULE_INT
                    {
                    match('e'); 
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalScenarioText.g:5423:62: ( 'f' | 'F' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='F'||LA6_0=='f') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalScenarioText.g:
                    {
                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalScenarioText.g:5425:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalScenarioText.g:5425:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalScenarioText.g:5425:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalScenarioText.g:5425:11: '^'
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

            // InternalScenarioText.g:5425:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalScenarioText.g:
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
            	    break loop8;
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
            // InternalScenarioText.g:5427:10: ( ( '0' .. '9' )+ )
            // InternalScenarioText.g:5427:12: ( '0' .. '9' )+
            {
            // InternalScenarioText.g:5427:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalScenarioText.g:5427:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalScenarioText.g:5429:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalScenarioText.g:5429:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalScenarioText.g:5429:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalScenarioText.g:5429:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalScenarioText.g:5429:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalScenarioText.g:5429:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalScenarioText.g:5429:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalScenarioText.g:5429:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalScenarioText.g:5429:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalScenarioText.g:5429:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalScenarioText.g:5429:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalScenarioText.g:5431:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalScenarioText.g:5431:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalScenarioText.g:5431:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalScenarioText.g:5431:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalScenarioText.g:5433:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalScenarioText.g:5433:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalScenarioText.g:5433:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalScenarioText.g:5433:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalScenarioText.g:5433:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalScenarioText.g:5433:41: ( '\\r' )? '\\n'
                    {
                    // InternalScenarioText.g:5433:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalScenarioText.g:5433:41: '\\r'
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
            // InternalScenarioText.g:5435:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalScenarioText.g:5435:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalScenarioText.g:5435:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalScenarioText.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalScenarioText.g:5437:16: ( . )
            // InternalScenarioText.g:5437:18: .
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
        // InternalScenarioText.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_BOOL | RULE_HEX | RULE_DOUBLE | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=90;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalScenarioText.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalScenarioText.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalScenarioText.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalScenarioText.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalScenarioText.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalScenarioText.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalScenarioText.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalScenarioText.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalScenarioText.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalScenarioText.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalScenarioText.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalScenarioText.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalScenarioText.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalScenarioText.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalScenarioText.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalScenarioText.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalScenarioText.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalScenarioText.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalScenarioText.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalScenarioText.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalScenarioText.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalScenarioText.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalScenarioText.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalScenarioText.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalScenarioText.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalScenarioText.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalScenarioText.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalScenarioText.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalScenarioText.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalScenarioText.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalScenarioText.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalScenarioText.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalScenarioText.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalScenarioText.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalScenarioText.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalScenarioText.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalScenarioText.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalScenarioText.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalScenarioText.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalScenarioText.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalScenarioText.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalScenarioText.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalScenarioText.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalScenarioText.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalScenarioText.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalScenarioText.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalScenarioText.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalScenarioText.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalScenarioText.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalScenarioText.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalScenarioText.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalScenarioText.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalScenarioText.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalScenarioText.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalScenarioText.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalScenarioText.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalScenarioText.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalScenarioText.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalScenarioText.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalScenarioText.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalScenarioText.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalScenarioText.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalScenarioText.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalScenarioText.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalScenarioText.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalScenarioText.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalScenarioText.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalScenarioText.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalScenarioText.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalScenarioText.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalScenarioText.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalScenarioText.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalScenarioText.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalScenarioText.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalScenarioText.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalScenarioText.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalScenarioText.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // InternalScenarioText.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // InternalScenarioText.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // InternalScenarioText.g:1:484: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 81 :
                // InternalScenarioText.g:1:494: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 82 :
                // InternalScenarioText.g:1:503: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 83 :
                // InternalScenarioText.g:1:515: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 84 :
                // InternalScenarioText.g:1:526: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 85 :
                // InternalScenarioText.g:1:534: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 86 :
                // InternalScenarioText.g:1:543: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 87 :
                // InternalScenarioText.g:1:555: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 88 :
                // InternalScenarioText.g:1:571: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 89 :
                // InternalScenarioText.g:1:587: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 90 :
                // InternalScenarioText.g:1:595: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\64\2\uffff\1\62\2\64\1\uffff\1\100\4\64\1\112\2\64\3\uffff\1\127\1\132\1\136\3\uffff\1\64\1\uffff\1\64\1\uffff\1\150\1\153\1\155\1\157\1\160\2\64\1\164\1\166\1\170\1\172\1\uffff\3\64\2\u0080\1\uffff\2\62\2\uffff\1\64\4\uffff\2\64\1\u008a\1\u008b\1\u008d\1\64\3\uffff\10\64\2\uffff\2\64\1\u009c\4\64\3\uffff\1\u00a2\2\uffff\1\u00a4\11\uffff\1\64\1\uffff\1\64\14\uffff\1\u00a7\1\u00a8\11\uffff\3\64\2\uffff\1\u0080\3\uffff\1\64\2\uffff\2\64\2\uffff\1\64\1\uffff\7\64\1\u00ba\6\64\1\uffff\3\64\1\u00c4\4\uffff\2\64\2\uffff\2\64\1\u008b\1\u00c9\1\64\1\uffff\1\64\1\u00cf\5\64\1\u00d5\1\u00d6\2\64\1\uffff\11\64\1\uffff\2\64\1\u008b\1\64\3\uffff\1\64\1\uffff\1\64\1\uffff\2\64\1\u00ec\1\u00ed\1\64\2\uffff\1\u00ef\1\u00f0\2\64\1\u00f3\1\u00f4\2\64\1\u00f7\3\64\1\u00fb\1\u008b\1\uffff\1\u00fd\1\uffff\3\64\1\u0102\2\uffff\1\64\2\uffff\2\64\2\uffff\1\u0106\1\u0107\1\uffff\3\64\1\uffff\1\u00c9\2\uffff\3\64\1\uffff\1\64\1\u0111\1\64\2\uffff\1\64\1\u0114\1\u0115\2\uffff\2\64\1\u0118\1\u0119\1\uffff\1\u011a\1\64\2\uffff\1\u011c\1\u011d\3\uffff\1\u011e\3\uffff";
    static final String DFA18_eofS =
        "\u011f\uffff";
    static final String DFA18_minS =
        "\1\0\1\154\2\uffff\1\100\1\141\1\155\1\uffff\1\56\1\154\1\157\2\141\1\75\1\143\1\156\3\uffff\1\74\1\75\1\52\3\uffff\1\145\1\uffff\1\157\1\uffff\1\46\3\75\1\60\2\163\4\75\1\uffff\1\162\1\141\1\145\2\56\1\uffff\2\0\2\uffff\1\157\3\uffff\1\163\1\155\1\154\3\60\1\160\3\uffff\1\145\1\151\1\163\1\164\1\156\1\154\1\141\1\151\2\uffff\1\151\1\164\1\60\1\164\1\145\1\143\1\164\3\uffff\1\75\2\uffff\1\75\11\uffff\1\146\1\uffff\1\143\14\uffff\2\60\11\uffff\1\165\1\154\1\163\2\uffff\1\56\1\60\2\uffff\1\143\1\164\1\uffff\1\145\1\154\2\uffff\1\145\1\uffff\1\157\1\156\1\145\1\164\1\145\1\162\1\163\1\60\1\165\1\144\1\163\2\141\1\151\1\uffff\1\145\1\162\1\171\1\60\4\uffff\2\141\2\uffff\1\145\1\163\2\60\1\153\1\141\1\163\1\60\2\162\1\164\1\171\1\162\2\60\1\171\1\164\1\uffff\1\145\1\157\1\145\1\163\1\171\1\166\1\162\1\141\1\143\1\uffff\1\165\1\154\1\60\1\145\1\uffff\1\53\1\uffff\1\163\1\164\1\160\1\uffff\1\146\1\164\2\60\1\156\2\uffff\2\60\1\157\1\156\2\60\1\163\1\145\1\60\1\164\2\154\4\60\1\145\3\141\1\60\2\uffff\1\141\2\uffff\1\146\1\154\2\uffff\2\60\1\uffff\1\151\1\145\1\164\1\uffff\1\60\1\uffff\1\100\2\143\1\154\1\uffff\1\154\1\60\1\171\2\uffff\1\157\2\60\2\uffff\2\145\2\60\1\uffff\1\60\1\156\2\uffff\2\60\3\uffff\1\60\3\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\154\2\uffff\1\100\1\165\1\156\1\uffff\1\56\1\170\1\157\1\141\1\145\1\75\1\163\1\165\3\uffff\1\75\1\76\1\75\3\uffff\1\145\1\uffff\1\157\1\uffff\1\75\1\174\1\75\2\172\2\163\4\75\1\uffff\1\162\1\141\1\145\1\170\1\71\1\uffff\2\uffff\2\uffff\1\157\3\uffff\1\164\1\155\1\154\3\172\1\160\3\uffff\1\145\1\164\1\163\1\164\1\156\1\162\1\141\1\151\2\uffff\1\167\1\164\1\172\1\164\1\145\1\143\1\164\3\uffff\1\75\2\uffff\1\75\11\uffff\1\146\1\uffff\1\143\14\uffff\2\172\11\uffff\1\165\1\154\1\163\2\uffff\2\71\2\uffff\1\143\1\164\1\uffff\1\145\1\154\2\uffff\1\145\1\uffff\1\157\1\162\1\145\1\164\1\145\1\162\1\163\1\172\1\165\1\144\1\163\2\141\1\151\1\uffff\1\145\1\162\1\171\1\172\4\uffff\2\141\2\uffff\1\145\1\163\1\172\1\146\1\153\1\141\1\163\1\172\2\162\1\164\1\171\1\162\2\172\1\171\1\164\1\uffff\1\145\1\157\1\145\1\163\1\171\1\166\1\162\1\141\1\143\1\uffff\1\165\1\154\1\172\1\145\1\uffff\1\55\1\uffff\1\163\1\164\1\160\1\uffff\1\156\1\164\2\172\1\156\2\uffff\2\172\1\157\1\156\2\172\1\163\1\145\1\172\1\164\2\154\2\172\1\71\1\172\1\145\3\141\1\172\2\uffff\1\141\2\uffff\1\146\1\154\2\uffff\2\172\1\uffff\1\151\1\145\1\164\1\uffff\1\146\1\uffff\3\143\1\154\1\uffff\1\154\1\172\1\171\2\uffff\1\157\2\172\2\uffff\2\145\2\172\1\uffff\1\172\1\156\2\uffff\2\172\3\uffff\1\172\3\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\11\10\uffff\1\25\1\26\1\27\3\uffff\1\34\1\35\1\36\1\uffff\1\41\1\uffff\1\54\13\uffff\1\113\5\uffff\1\124\2\uffff\1\131\1\132\1\uffff\1\124\1\2\1\3\7\uffff\1\11\1\32\1\14\10\uffff\1\116\1\22\7\uffff\1\25\1\26\1\27\1\uffff\1\114\1\30\1\uffff\1\115\1\31\1\74\1\127\1\130\1\33\1\34\1\35\1\36\1\uffff\1\41\1\uffff\1\54\1\57\1\102\1\64\1\60\1\104\1\63\1\117\1\61\1\103\1\62\1\67\2\uffff\1\73\1\111\1\75\1\112\1\76\1\107\1\77\1\110\1\113\3\uffff\1\121\1\125\2\uffff\1\126\1\131\2\uffff\1\6\2\uffff\1\72\1\120\1\uffff\1\52\16\uffff\1\55\4\uffff\1\100\1\105\1\101\1\106\2\uffff\1\70\1\71\21\uffff\1\17\11\uffff\1\53\4\uffff\1\122\1\uffff\1\123\3\uffff\1\56\5\uffff\1\43\1\40\25\uffff\1\15\1\66\1\uffff\1\42\1\16\2\uffff\1\46\1\23\2\uffff\1\65\3\uffff\1\51\1\uffff\1\1\4\uffff\1\13\3\uffff\1\44\1\50\3\uffff\1\4\1\5\4\uffff\1\47\2\uffff\1\45\1\37\2\uffff\1\12\1\21\1\20\1\uffff\1\7\1\10\1\24";
    static final String DFA18_specialS =
        "\1\2\56\uffff\1\0\1\1\u00ee\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\37\1\57\1\26\1\62\1\45\1\35\1\60\1\20\1\22\1\44\1\46\1\21\1\47\1\10\1\25\1\54\11\55\1\7\1\32\1\23\1\15\1\24\1\34\1\4\32\56\1\27\1\62\1\30\1\40\1\56\1\62\1\16\1\1\1\12\1\31\1\11\1\52\2\56\1\6\2\56\1\33\1\42\1\5\1\17\2\56\1\14\1\41\1\51\1\43\1\13\2\56\1\53\1\56\1\2\1\36\1\3\1\50\uff81\62",
            "\1\63",
            "",
            "",
            "\1\67",
            "\1\70\15\uffff\1\73\3\uffff\1\72\1\uffff\1\71",
            "\1\75\1\74",
            "",
            "\1\77",
            "\1\103\1\uffff\1\104\7\uffff\1\101\1\uffff\1\102",
            "\1\105",
            "\1\106",
            "\1\110\3\uffff\1\107",
            "\1\111",
            "\1\114\2\uffff\1\116\5\uffff\1\113\6\uffff\1\115",
            "\1\120\1\uffff\1\117\4\uffff\1\121",
            "",
            "",
            "",
            "\1\125\1\126",
            "\1\131\1\130",
            "\1\134\4\uffff\1\135\15\uffff\1\133",
            "",
            "",
            "",
            "\1\142",
            "",
            "\1\144",
            "",
            "\1\146\26\uffff\1\147",
            "\1\152\76\uffff\1\151",
            "\1\154",
            "\1\156\3\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165",
            "\1\167",
            "\1\171",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\u0082\1\uffff\12\u0081\36\uffff\1\177\37\uffff\1\177",
            "\1\u0082\1\uffff\12\u0081",
            "",
            "\0\u0083",
            "\0\u0083",
            "",
            "",
            "\1\u0085",
            "",
            "",
            "",
            "\1\u0086\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u008c\6\64",
            "\1\u008e",
            "",
            "",
            "",
            "\1\u008f",
            "\1\u0091\12\uffff\1\u0090",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0096\5\uffff\1\u0095",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "\1\u0099\15\uffff\1\u009a",
            "\1\u009b",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "",
            "",
            "\1\u00a1",
            "",
            "",
            "\1\u00a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u0082\1\uffff\12\u0081",
            "\12\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3\3\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\u00ac\14\uffff\1\u00cb\36\uffff\1\u00ca\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e4",
            "",
            "\1\u00e5\1\uffff\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9\7\uffff\1\u00ea",
            "\1\u00eb",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ee",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f1",
            "\1\u00f2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f5",
            "\1\u00f6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\u00fc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0103",
            "",
            "",
            "\1\u0104",
            "\1\u0105",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\12\u00fc\14\uffff\1\u00cb\37\uffff\1\u00cb",
            "",
            "\1\u010c\42\uffff\1\u010b",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0112",
            "",
            "",
            "\1\u0113",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0116",
            "\1\u0117",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u011b",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | RULE_BOOL | RULE_HEX | RULE_DOUBLE | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_47 = input.LA(1);

                        s = -1;
                        if ( ((LA18_47>='\u0000' && LA18_47<='\uFFFF')) ) {s = 131;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_48 = input.LA(1);

                        s = -1;
                        if ( ((LA18_48>='\u0000' && LA18_48<='\uFFFF')) ) {s = 131;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='b') ) {s = 1;}

                        else if ( (LA18_0=='{') ) {s = 2;}

                        else if ( (LA18_0=='}') ) {s = 3;}

                        else if ( (LA18_0=='@') ) {s = 4;}

                        else if ( (LA18_0=='n') ) {s = 5;}

                        else if ( (LA18_0=='i') ) {s = 6;}

                        else if ( (LA18_0==':') ) {s = 7;}

                        else if ( (LA18_0=='.') ) {s = 8;}

                        else if ( (LA18_0=='e') ) {s = 9;}

                        else if ( (LA18_0=='c') ) {s = 10;}

                        else if ( (LA18_0=='v') ) {s = 11;}

                        else if ( (LA18_0=='r') ) {s = 12;}

                        else if ( (LA18_0=='=') ) {s = 13;}

                        else if ( (LA18_0=='a') ) {s = 14;}

                        else if ( (LA18_0=='o') ) {s = 15;}

                        else if ( (LA18_0=='(') ) {s = 16;}

                        else if ( (LA18_0==',') ) {s = 17;}

                        else if ( (LA18_0==')') ) {s = 18;}

                        else if ( (LA18_0=='<') ) {s = 19;}

                        else if ( (LA18_0=='>') ) {s = 20;}

                        else if ( (LA18_0=='/') ) {s = 21;}

                        else if ( (LA18_0=='#') ) {s = 22;}

                        else if ( (LA18_0=='[') ) {s = 23;}

                        else if ( (LA18_0==']') ) {s = 24;}

                        else if ( (LA18_0=='d') ) {s = 25;}

                        else if ( (LA18_0==';') ) {s = 26;}

                        else if ( (LA18_0=='l') ) {s = 27;}

                        else if ( (LA18_0=='?') ) {s = 28;}

                        else if ( (LA18_0=='&') ) {s = 29;}

                        else if ( (LA18_0=='|') ) {s = 30;}

                        else if ( (LA18_0=='!') ) {s = 31;}

                        else if ( (LA18_0=='^') ) {s = 32;}

                        else if ( (LA18_0=='s') ) {s = 33;}

                        else if ( (LA18_0=='m') ) {s = 34;}

                        else if ( (LA18_0=='u') ) {s = 35;}

                        else if ( (LA18_0=='*') ) {s = 36;}

                        else if ( (LA18_0=='%') ) {s = 37;}

                        else if ( (LA18_0=='+') ) {s = 38;}

                        else if ( (LA18_0=='-') ) {s = 39;}

                        else if ( (LA18_0=='~') ) {s = 40;}

                        else if ( (LA18_0=='t') ) {s = 41;}

                        else if ( (LA18_0=='f') ) {s = 42;}

                        else if ( (LA18_0=='y') ) {s = 43;}

                        else if ( (LA18_0=='0') ) {s = 44;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 45;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||(LA18_0>='p' && LA18_0<='q')||(LA18_0>='w' && LA18_0<='x')||LA18_0=='z') ) {s = 46;}

                        else if ( (LA18_0=='\"') ) {s = 47;}

                        else if ( (LA18_0=='\'') ) {s = 48;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 49;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='$'||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='\u007F' && LA18_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
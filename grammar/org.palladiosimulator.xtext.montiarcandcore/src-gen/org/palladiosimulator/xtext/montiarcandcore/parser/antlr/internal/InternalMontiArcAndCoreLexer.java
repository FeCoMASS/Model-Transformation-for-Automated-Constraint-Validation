package org.palladiosimulator.xtext.montiarcandcore.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiArcAndCoreLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int RULE_MCQUALIFIEDNAME=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SYNC=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_DOTSTAR=5;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMontiArcAndCoreLexer() {;} 
    public InternalMontiArcAndCoreLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMontiArcAndCoreLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMontiArcAndCore.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiArcAndCore.g:11:7: ( 'import' )
            // InternalMontiArcAndCore.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiArcAndCore.g:12:7: ( ';' )
            // InternalMontiArcAndCore.g:12:9: ';'
            {
            match(';'); 

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
            // InternalMontiArcAndCore.g:13:7: ( 'package' )
            // InternalMontiArcAndCore.g:13:9: 'package'
            {
            match("package"); 


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
            // InternalMontiArcAndCore.g:14:7: ( 'boolean' )
            // InternalMontiArcAndCore.g:14:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalMontiArcAndCore.g:15:7: ( 'byte' )
            // InternalMontiArcAndCore.g:15:9: 'byte'
            {
            match("byte"); 


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
            // InternalMontiArcAndCore.g:16:7: ( 'short' )
            // InternalMontiArcAndCore.g:16:9: 'short'
            {
            match("short"); 


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
            // InternalMontiArcAndCore.g:17:7: ( 'int' )
            // InternalMontiArcAndCore.g:17:9: 'int'
            {
            match("int"); 


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
            // InternalMontiArcAndCore.g:18:7: ( 'long' )
            // InternalMontiArcAndCore.g:18:9: 'long'
            {
            match("long"); 


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
            // InternalMontiArcAndCore.g:19:7: ( 'char' )
            // InternalMontiArcAndCore.g:19:9: 'char'
            {
            match("char"); 


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
            // InternalMontiArcAndCore.g:20:7: ( 'float' )
            // InternalMontiArcAndCore.g:20:9: 'float'
            {
            match("float"); 


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
            // InternalMontiArcAndCore.g:21:7: ( 'double' )
            // InternalMontiArcAndCore.g:21:9: 'double'
            {
            match("double"); 


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
            // InternalMontiArcAndCore.g:22:7: ( 'Boolean' )
            // InternalMontiArcAndCore.g:22:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalMontiArcAndCore.g:23:7: ( 'Byte' )
            // InternalMontiArcAndCore.g:23:9: 'Byte'
            {
            match("Byte"); 


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
            // InternalMontiArcAndCore.g:24:7: ( 'Integer' )
            // InternalMontiArcAndCore.g:24:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalMontiArcAndCore.g:25:7: ( 'Long' )
            // InternalMontiArcAndCore.g:25:9: 'Long'
            {
            match("Long"); 


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
            // InternalMontiArcAndCore.g:26:7: ( 'Char' )
            // InternalMontiArcAndCore.g:26:9: 'Char'
            {
            match("Char"); 


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
            // InternalMontiArcAndCore.g:27:7: ( 'Double' )
            // InternalMontiArcAndCore.g:27:9: 'Double'
            {
            match("Double"); 


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
            // InternalMontiArcAndCore.g:28:7: ( 'String' )
            // InternalMontiArcAndCore.g:28:9: 'String'
            {
            match("String"); 


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
            // InternalMontiArcAndCore.g:29:7: ( 'Set' )
            // InternalMontiArcAndCore.g:29:9: 'Set'
            {
            match("Set"); 


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
            // InternalMontiArcAndCore.g:30:7: ( 'List' )
            // InternalMontiArcAndCore.g:30:9: 'List'
            {
            match("List"); 


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
            // InternalMontiArcAndCore.g:31:7: ( 'Map' )
            // InternalMontiArcAndCore.g:31:9: 'Map'
            {
            match("Map"); 


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
            // InternalMontiArcAndCore.g:32:7: ( 'Optional' )
            // InternalMontiArcAndCore.g:32:9: 'Optional'
            {
            match("Optional"); 


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
            // InternalMontiArcAndCore.g:33:7: ( '<' )
            // InternalMontiArcAndCore.g:33:9: '<'
            {
            match('<'); 

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
            // InternalMontiArcAndCore.g:34:7: ( '>' )
            // InternalMontiArcAndCore.g:34:9: '>'
            {
            match('>'); 

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
            // InternalMontiArcAndCore.g:35:7: ( '[' )
            // InternalMontiArcAndCore.g:35:9: '['
            {
            match('['); 

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
            // InternalMontiArcAndCore.g:36:7: ( ']' )
            // InternalMontiArcAndCore.g:36:9: ']'
            {
            match(']'); 

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
            // InternalMontiArcAndCore.g:37:7: ( '(' )
            // InternalMontiArcAndCore.g:37:9: '('
            {
            match('('); 

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
            // InternalMontiArcAndCore.g:38:7: ( ',' )
            // InternalMontiArcAndCore.g:38:9: ','
            {
            match(','); 

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
            // InternalMontiArcAndCore.g:39:7: ( ')' )
            // InternalMontiArcAndCore.g:39:9: ')'
            {
            match(')'); 

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
            // InternalMontiArcAndCore.g:40:7: ( 'classdiagram' )
            // InternalMontiArcAndCore.g:40:9: 'classdiagram'
            {
            match("classdiagram"); 


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
            // InternalMontiArcAndCore.g:41:7: ( '{' )
            // InternalMontiArcAndCore.g:41:9: '{'
            {
            match('{'); 

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
            // InternalMontiArcAndCore.g:42:7: ( '}' )
            // InternalMontiArcAndCore.g:42:9: '}'
            {
            match('}'); 

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
            // InternalMontiArcAndCore.g:43:7: ( 'public' )
            // InternalMontiArcAndCore.g:43:9: 'public'
            {
            match("public"); 


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
            // InternalMontiArcAndCore.g:44:7: ( 'class' )
            // InternalMontiArcAndCore.g:44:9: 'class'
            {
            match("class"); 


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
            // InternalMontiArcAndCore.g:45:7: ( 'extends' )
            // InternalMontiArcAndCore.g:45:9: 'extends'
            {
            match("extends"); 


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
            // InternalMontiArcAndCore.g:46:7: ( 'implements' )
            // InternalMontiArcAndCore.g:46:9: 'implements'
            {
            match("implements"); 


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
            // InternalMontiArcAndCore.g:47:7: ( 'enum' )
            // InternalMontiArcAndCore.g:47:9: 'enum'
            {
            match("enum"); 


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
            // InternalMontiArcAndCore.g:48:7: ( 'component' )
            // InternalMontiArcAndCore.g:48:9: 'component'
            {
            match("component"); 


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
            // InternalMontiArcAndCore.g:49:7: ( '=' )
            // InternalMontiArcAndCore.g:49:9: '='
            {
            match('='); 

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
            // InternalMontiArcAndCore.g:50:7: ( '->' )
            // InternalMontiArcAndCore.g:50:9: '->'
            {
            match("->"); 


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
            // InternalMontiArcAndCore.g:51:7: ( 'port' )
            // InternalMontiArcAndCore.g:51:9: 'port'
            {
            match("port"); 


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
            // InternalMontiArcAndCore.g:52:7: ( 'in' )
            // InternalMontiArcAndCore.g:52:9: 'in'
            {
            match("in"); 


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
            // InternalMontiArcAndCore.g:53:7: ( 'out' )
            // InternalMontiArcAndCore.g:53:9: 'out'
            {
            match("out"); 


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
            // InternalMontiArcAndCore.g:54:7: ( '<<' )
            // InternalMontiArcAndCore.g:54:9: '<<'
            {
            match("<<"); 


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
            // InternalMontiArcAndCore.g:55:7: ( 'delayed, ' )
            // InternalMontiArcAndCore.g:55:9: 'delayed, '
            {
            match("delayed, "); 


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
            // InternalMontiArcAndCore.g:56:7: ( 'condition' )
            // InternalMontiArcAndCore.g:56:9: 'condition'
            {
            match("condition"); 


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
            // InternalMontiArcAndCore.g:57:7: ( '>>' )
            // InternalMontiArcAndCore.g:57:9: '>>'
            {
            match(">>"); 


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
            // InternalMontiArcAndCore.g:58:7: ( 'automaton' )
            // InternalMontiArcAndCore.g:58:9: 'automaton'
            {
            match("automaton"); 


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
            // InternalMontiArcAndCore.g:59:7: ( 'state' )
            // InternalMontiArcAndCore.g:59:9: 'state'
            {
            match("state"); 


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
            // InternalMontiArcAndCore.g:60:7: ( '/' )
            // InternalMontiArcAndCore.g:60:9: '/'
            {
            match('/'); 

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
            // InternalMontiArcAndCore.g:61:7: ( '==' )
            // InternalMontiArcAndCore.g:61:9: '=='
            {
            match("=="); 


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
            // InternalMontiArcAndCore.g:62:7: ( '&&' )
            // InternalMontiArcAndCore.g:62:9: '&&'
            {
            match("&&"); 


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
            // InternalMontiArcAndCore.g:63:7: ( '+' )
            // InternalMontiArcAndCore.g:63:9: '+'
            {
            match('+'); 

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
            // InternalMontiArcAndCore.g:64:7: ( '-' )
            // InternalMontiArcAndCore.g:64:9: '-'
            {
            match('-'); 

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
            // InternalMontiArcAndCore.g:65:7: ( '*' )
            // InternalMontiArcAndCore.g:65:9: '*'
            {
            match('*'); 

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
            // InternalMontiArcAndCore.g:66:7: ( 'initial' )
            // InternalMontiArcAndCore.g:66:9: 'initial'
            {
            match("initial"); 


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
            // InternalMontiArcAndCore.g:67:7: ( 'final' )
            // InternalMontiArcAndCore.g:67:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "RULE_MCQUALIFIEDNAME"
    public final void mRULE_MCQUALIFIEDNAME() throws RecognitionException {
        try {
            int _type = RULE_MCQUALIFIEDNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiArcAndCore.g:3275:22: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalMontiArcAndCore.g:3275:24: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalMontiArcAndCore.g:3275:32: ( '.' RULE_ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3275:33: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MCQUALIFIEDNAME"

    // $ANTLR start "RULE_DOTSTAR"
    public final void mRULE_DOTSTAR() throws RecognitionException {
        try {
            int _type = RULE_DOTSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiArcAndCore.g:3277:14: ( '.*' )
            // InternalMontiArcAndCore.g:3277:16: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTSTAR"

    // $ANTLR start "RULE_SYNC"
    public final void mRULE_SYNC() throws RecognitionException {
        try {
            int _type = RULE_SYNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiArcAndCore.g:3279:11: ( '<<sync>>' )
            // InternalMontiArcAndCore.g:3279:13: '<<sync>>'
            {
            match("<<sync>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYNC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiArcAndCore.g:3281:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMontiArcAndCore.g:3281:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMontiArcAndCore.g:3281:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiArcAndCore.g:3281:11: '^'
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

            // InternalMontiArcAndCore.g:3281:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:
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
            	    break loop3;
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
            // InternalMontiArcAndCore.g:3283:10: ( ( '0' .. '9' )+ )
            // InternalMontiArcAndCore.g:3283:12: ( '0' .. '9' )+
            {
            // InternalMontiArcAndCore.g:3283:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3283:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalMontiArcAndCore.g:3285:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMontiArcAndCore.g:3285:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMontiArcAndCore.g:3285:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMontiArcAndCore.g:3285:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMontiArcAndCore.g:3285:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMontiArcAndCore.g:3285:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMontiArcAndCore.g:3285:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:3285:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMontiArcAndCore.g:3285:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMontiArcAndCore.g:3285:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMontiArcAndCore.g:3285:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalMontiArcAndCore.g:3287:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMontiArcAndCore.g:3287:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMontiArcAndCore.g:3287:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3287:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalMontiArcAndCore.g:3289:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMontiArcAndCore.g:3289:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMontiArcAndCore.g:3289:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3289:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalMontiArcAndCore.g:3289:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiArcAndCore.g:3289:41: ( '\\r' )? '\\n'
                    {
                    // InternalMontiArcAndCore.g:3289:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMontiArcAndCore.g:3289:41: '\\r'
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
            // InternalMontiArcAndCore.g:3291:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMontiArcAndCore.g:3291:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMontiArcAndCore.g:3291:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalMontiArcAndCore.g:3293:16: ( . )
            // InternalMontiArcAndCore.g:3293:18: .
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
        // InternalMontiArcAndCore.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | RULE_MCQUALIFIEDNAME | RULE_DOTSTAR | RULE_SYNC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=67;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMontiArcAndCore.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMontiArcAndCore.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMontiArcAndCore.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMontiArcAndCore.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMontiArcAndCore.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMontiArcAndCore.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMontiArcAndCore.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMontiArcAndCore.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMontiArcAndCore.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMontiArcAndCore.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMontiArcAndCore.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMontiArcAndCore.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMontiArcAndCore.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMontiArcAndCore.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMontiArcAndCore.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMontiArcAndCore.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMontiArcAndCore.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMontiArcAndCore.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMontiArcAndCore.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMontiArcAndCore.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMontiArcAndCore.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMontiArcAndCore.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMontiArcAndCore.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMontiArcAndCore.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMontiArcAndCore.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalMontiArcAndCore.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalMontiArcAndCore.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalMontiArcAndCore.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalMontiArcAndCore.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalMontiArcAndCore.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalMontiArcAndCore.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalMontiArcAndCore.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalMontiArcAndCore.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalMontiArcAndCore.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalMontiArcAndCore.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalMontiArcAndCore.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalMontiArcAndCore.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalMontiArcAndCore.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalMontiArcAndCore.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalMontiArcAndCore.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalMontiArcAndCore.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalMontiArcAndCore.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalMontiArcAndCore.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalMontiArcAndCore.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalMontiArcAndCore.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalMontiArcAndCore.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalMontiArcAndCore.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalMontiArcAndCore.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalMontiArcAndCore.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalMontiArcAndCore.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalMontiArcAndCore.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalMontiArcAndCore.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalMontiArcAndCore.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalMontiArcAndCore.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalMontiArcAndCore.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalMontiArcAndCore.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalMontiArcAndCore.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalMontiArcAndCore.g:1:352: RULE_MCQUALIFIEDNAME
                {
                mRULE_MCQUALIFIEDNAME(); 

                }
                break;
            case 59 :
                // InternalMontiArcAndCore.g:1:373: RULE_DOTSTAR
                {
                mRULE_DOTSTAR(); 

                }
                break;
            case 60 :
                // InternalMontiArcAndCore.g:1:386: RULE_SYNC
                {
                mRULE_SYNC(); 

                }
                break;
            case 61 :
                // InternalMontiArcAndCore.g:1:396: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 62 :
                // InternalMontiArcAndCore.g:1:404: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 63 :
                // InternalMontiArcAndCore.g:1:413: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // InternalMontiArcAndCore.g:1:425: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 65 :
                // InternalMontiArcAndCore.g:1:441: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 66 :
                // InternalMontiArcAndCore.g:1:457: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 67 :
                // InternalMontiArcAndCore.g:1:465: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\56\1\uffff\17\56\1\115\1\117\7\uffff\1\56\1\132\1\134\2\56\1\141\1\53\2\uffff\1\53\1\56\1\53\1\uffff\2\53\2\uffff\1\56\1\155\1\uffff\1\56\2\uffff\32\56\1\u008a\12\uffff\2\56\4\uffff\2\56\6\uffff\1\56\4\uffff\1\56\1\u0091\1\56\1\uffff\30\56\1\u00ab\1\u00ac\1\56\2\uffff\2\56\1\u00b0\3\56\1\uffff\3\56\1\u00b7\1\56\1\u00b9\2\56\1\u00bc\1\u00bd\10\56\1\u00c6\1\56\1\u00c8\1\u00c9\1\u00ca\2\56\2\uffff\2\56\1\u00cf\1\uffff\6\56\1\uffff\1\56\1\uffff\1\u00d7\1\u00d8\2\uffff\1\u00da\2\56\1\u00dd\1\u00de\3\56\1\uffff\1\56\3\uffff\4\56\1\uffff\1\56\1\u00e8\3\56\1\u00ec\1\56\2\uffff\1\56\1\uffff\2\56\2\uffff\1\u00f1\3\56\1\u00f5\1\u00f6\3\56\1\uffff\1\56\1\u00fb\1\u00fc\1\uffff\1\u00fd\3\56\1\uffff\1\56\1\u0102\1\u0103\2\uffff\1\56\1\u0105\2\56\3\uffff\3\56\3\uffff\1\u010b\1\uffff\3\56\1\u010f\1\u0110\1\uffff\1\u0111\1\u0112\1\56\4\uffff\1\56\1\u0115\1\uffff";
    static final String DFA13_eofS =
        "\u0116\uffff";
    static final String DFA13_minS =
        "\1\0\1\56\1\uffff\17\56\1\74\1\76\7\uffff\1\56\1\75\1\76\2\56\1\52\1\46\2\uffff\1\101\1\56\1\52\1\uffff\2\0\2\uffff\2\56\1\uffff\1\56\2\uffff\32\56\1\163\12\uffff\2\56\4\uffff\2\56\6\uffff\1\56\4\uffff\3\56\1\uffff\33\56\2\uffff\6\56\1\uffff\31\56\2\uffff\3\56\1\uffff\6\56\1\uffff\1\56\1\uffff\2\56\2\uffff\10\56\1\uffff\1\56\3\uffff\4\56\1\uffff\7\56\2\uffff\1\56\1\uffff\2\56\2\uffff\11\56\1\uffff\3\56\1\uffff\4\56\1\uffff\1\54\2\56\2\uffff\4\56\3\uffff\3\56\3\uffff\1\56\1\uffff\5\56\1\uffff\3\56\4\uffff\2\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\uffff\17\172\1\74\1\76\7\uffff\1\172\1\75\1\76\2\172\1\57\1\46\2\uffff\2\172\1\52\1\uffff\2\uffff\2\uffff\2\172\1\uffff\1\172\2\uffff\32\172\1\163\12\uffff\2\172\4\uffff\2\172\6\uffff\1\172\4\uffff\3\172\1\uffff\33\172\2\uffff\6\172\1\uffff\31\172\2\uffff\3\172\1\uffff\6\172\1\uffff\1\172\1\uffff\2\172\2\uffff\10\172\1\uffff\1\172\3\uffff\4\172\1\uffff\7\172\2\uffff\1\172\1\uffff\2\172\2\uffff\11\172\1\uffff\3\172\1\uffff\4\172\1\uffff\3\172\2\uffff\4\172\3\uffff\3\172\3\uffff\1\172\1\uffff\5\172\1\uffff\3\172\4\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\21\uffff\1\31\1\32\1\33\1\34\1\35\1\37\1\40\7\uffff\1\65\1\67\3\uffff\1\76\2\uffff\1\102\1\103\2\uffff\1\75\1\uffff\1\72\1\2\33\uffff\1\27\1\57\1\30\1\31\1\32\1\33\1\34\1\35\1\37\1\40\2\uffff\1\63\1\47\1\50\1\66\2\uffff\1\100\1\101\1\62\1\64\1\65\1\67\1\uffff\1\73\1\76\1\77\1\102\3\uffff\1\52\33\uffff\1\74\1\54\6\uffff\1\7\31\uffff\1\23\1\25\3\uffff\1\53\6\uffff\1\51\1\uffff\1\5\2\uffff\1\10\1\11\10\uffff\1\15\1\uffff\1\17\1\24\1\20\4\uffff\1\45\7\uffff\1\6\1\61\1\uffff\1\42\2\uffff\1\12\1\71\11\uffff\1\1\3\uffff\1\41\4\uffff\1\13\3\uffff\1\21\1\22\4\uffff\1\70\1\3\1\4\3\uffff\1\55\1\14\1\16\1\uffff\1\43\5\uffff\1\26\3\uffff\1\46\1\56\1\60\1\44\2\uffff\1\36";
    static final String DFA13_specialS =
        "\1\1\47\uffff\1\2\1\0\u00ec\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\50\3\53\1\41\1\51\1\26\1\30\1\43\1\42\1\27\1\35\1\46\1\40\12\47\1\53\1\2\1\22\1\34\1\23\2\53\1\45\1\12\1\15\1\16\4\45\1\13\2\45\1\14\1\20\1\45\1\21\3\45\1\17\7\45\1\24\1\53\1\25\1\44\1\45\1\53\1\37\1\4\1\7\1\11\1\33\1\10\2\45\1\1\2\45\1\6\2\45\1\36\1\3\2\45\1\5\7\45\1\31\1\53\1\32\uff82\53",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\54\1\55\14\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\62\15\57\1\64\5\57\1\63\5\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\65\11\57\1\66\1\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\67\13\57\1\70\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\71\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\72\3\57\1\73\2\57\1\74\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\76\2\57\1\75\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\100\11\57\1\77\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\101\11\57\1\102\1\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\103\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\105\5\57\1\104\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\106\22\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\107\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\111\16\57\1\110\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\112\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\113\12\57",
            "\1\114",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\130\11\57\1\127\2\57",
            "\1\131",
            "\1\133",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\135\5\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\136\5\57",
            "\1\137\4\uffff\1\140",
            "\1\142",
            "",
            "",
            "\32\145\4\uffff\1\145\1\uffff\32\145",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\146",
            "",
            "\0\150",
            "\0\150",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\152\12\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\154\12\57\1\153\6\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\156\27\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\157\30\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\160\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\161\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\162\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\163\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\164\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\165\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\166\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\167\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\170\1\171\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\172\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\173\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\174\5\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\175\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\176\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\177\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0080\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0081\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0082\7\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0083\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u0084\5\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0085\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0086\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u0087\12\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0088\6\57",
            "\1\u0089",
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
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u008b\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u008c\5\57",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u008d\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u008e\6\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0090\2\57\1\u008f\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0092\6\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\u0093\17\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0094\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0095\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0096\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0097\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0098\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0099\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u009a\23\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u009b\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u009c\7\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u009d\12\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u009e\26\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u009f\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00a0\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00a1\30\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00a2\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00a3\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a4\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a5\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00a6\23\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00a7\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00a8\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00a9\30\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00aa\21\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00ad\21\57",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00ae\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00af\15\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00b1\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00b2\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b3\25\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b4\21\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b5\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b6\21\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b8\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00ba\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00bb\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00be\7\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00bf\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00c0\21\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00c1\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00c2\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00c3\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u00c4\1\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c5\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00c7\23\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00cb\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00cc\14\57",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00cd\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00ce\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00d0\15\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00d1\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00d2\15\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00d3\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00d4\23\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00d5\27\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00d6\31\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00d9\26\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00db\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00dc\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00df\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00e0\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00e1\31\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00e2\25\57",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00e3\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00e4\23\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00e5\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00e6\26\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00e7\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00e9\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00ea\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00eb\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00ed\14\57",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00ee\21\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00ef\25\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00f0\21\57",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00f2\26\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00f3\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00f4\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00f7\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00f8\7\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00f9\6\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00fa\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00fe\31\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00ff\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0100\13\57",
            "",
            "\1\u0101\1\uffff\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0104\16\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0106\13\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0107\6\57",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u0108\23\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0109\6\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u010a\14\57",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u010c\14\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u010d\7\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u010e\10\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0113\31\57",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0114\15\57",
            "\1\60\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | RULE_MCQUALIFIEDNAME | RULE_DOTSTAR | RULE_SYNC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_41 = input.LA(1);

                        s = -1;
                        if ( ((LA13_41>='\u0000' && LA13_41<='\uFFFF')) ) {s = 104;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='i') ) {s = 1;}

                        else if ( (LA13_0==';') ) {s = 2;}

                        else if ( (LA13_0=='p') ) {s = 3;}

                        else if ( (LA13_0=='b') ) {s = 4;}

                        else if ( (LA13_0=='s') ) {s = 5;}

                        else if ( (LA13_0=='l') ) {s = 6;}

                        else if ( (LA13_0=='c') ) {s = 7;}

                        else if ( (LA13_0=='f') ) {s = 8;}

                        else if ( (LA13_0=='d') ) {s = 9;}

                        else if ( (LA13_0=='B') ) {s = 10;}

                        else if ( (LA13_0=='I') ) {s = 11;}

                        else if ( (LA13_0=='L') ) {s = 12;}

                        else if ( (LA13_0=='C') ) {s = 13;}

                        else if ( (LA13_0=='D') ) {s = 14;}

                        else if ( (LA13_0=='S') ) {s = 15;}

                        else if ( (LA13_0=='M') ) {s = 16;}

                        else if ( (LA13_0=='O') ) {s = 17;}

                        else if ( (LA13_0=='<') ) {s = 18;}

                        else if ( (LA13_0=='>') ) {s = 19;}

                        else if ( (LA13_0=='[') ) {s = 20;}

                        else if ( (LA13_0==']') ) {s = 21;}

                        else if ( (LA13_0=='(') ) {s = 22;}

                        else if ( (LA13_0==',') ) {s = 23;}

                        else if ( (LA13_0==')') ) {s = 24;}

                        else if ( (LA13_0=='{') ) {s = 25;}

                        else if ( (LA13_0=='}') ) {s = 26;}

                        else if ( (LA13_0=='e') ) {s = 27;}

                        else if ( (LA13_0=='=') ) {s = 28;}

                        else if ( (LA13_0=='-') ) {s = 29;}

                        else if ( (LA13_0=='o') ) {s = 30;}

                        else if ( (LA13_0=='a') ) {s = 31;}

                        else if ( (LA13_0=='/') ) {s = 32;}

                        else if ( (LA13_0=='&') ) {s = 33;}

                        else if ( (LA13_0=='+') ) {s = 34;}

                        else if ( (LA13_0=='*') ) {s = 35;}

                        else if ( (LA13_0=='^') ) {s = 36;}

                        else if ( (LA13_0=='A'||(LA13_0>='E' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||LA13_0=='N'||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='n')||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 37;}

                        else if ( (LA13_0=='.') ) {s = 38;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 39;}

                        else if ( (LA13_0=='\"') ) {s = 40;}

                        else if ( (LA13_0=='\'') ) {s = 41;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 42;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||LA13_0==':'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_40 = input.LA(1);

                        s = -1;
                        if ( ((LA13_40>='\u0000' && LA13_40<='\uFFFF')) ) {s = 104;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
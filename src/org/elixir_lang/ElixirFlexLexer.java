/* The following code was generated by JFlex 1.4.3 on 11/18/14 8:38 PM */

package org.elixir_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.lexer.group.*;
import org.elixir_lang.psi.ElixirTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/18/14 8:38 PM from the specification file
 * <tt>/Users/luke.imhoff/git/KronicDeth/intellij-elixir/src/org/elixir_lang/Elixir.flex</tt>
 */
public class ElixirFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int GROUP_HEREDOC_END = 8;
  public static final int INTERPOLATION = 16;
  public static final int GROUP_HEREDOC_LINE_START = 12;
  public static final int SIGIL_MODIFIERS = 22;
  public static final int SIGIL = 20;
  public static final int GROUP_HEREDOC_START = 14;
  public static final int GROUP = 6;
  public static final int ATOM_START = 4;
  public static final int YYINITIAL = 0;
  public static final int GROUP_HEREDOC_LINE_BODY = 10;
  public static final int NAMED_SIGIL = 18;
  public static final int ATOM_BODY = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\45\1\42\1\0\1\46\1\43\22\0\1\45\1\14\1\61"+
    "\1\47\1\0\1\17\1\7\1\60\1\62\1\63\1\33\1\30\1\0"+
    "\1\25\1\24\1\34\1\50\1\52\6\54\2\36\1\31\1\41\1\1"+
    "\1\15\1\2\1\35\1\32\4\40\1\57\1\40\24\37\1\62\1\26"+
    "\1\63\1\16\1\53\1\0\1\10\1\51\1\56\1\11\1\5\1\56"+
    "\1\55\1\4\5\55\1\6\1\22\2\55\1\27\1\55\1\23\2\55"+
    "\1\3\1\44\2\55\1\20\1\13\1\21\1\12\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\14\0\1\1\2\2\3\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\1\7\1\11\1\1\1\3\1\1\1\12"+
    "\1\1\1\12\1\13\1\14\1\15\1\1\1\16\1\17"+
    "\1\20\1\21\1\1\1\22\1\23\1\16\2\24\1\25"+
    "\1\26\1\27\1\25\2\30\3\31\1\30\1\31\1\1"+
    "\5\30\1\1\1\31\2\30\1\1\1\30\1\1\1\30"+
    "\1\1\1\32\1\33\1\34\3\33\1\0\1\35\1\33"+
    "\4\36\1\37\1\1\1\40\2\41\1\42\1\43\1\44"+
    "\1\43\1\0\1\45\1\46\1\0\1\2\1\47\1\0"+
    "\3\3\1\50\1\0\1\3\1\0\1\46\1\51\1\52"+
    "\1\53\1\52\2\0\1\54\1\51\1\45\1\55\1\22"+
    "\1\0\1\56\1\57\2\60\2\0\1\17\6\0\1\30"+
    "\3\0\1\30\2\0\2\30\2\0\1\30\3\61\1\62"+
    "\7\0\1\63\1\3\1\7\1\50\1\64\1\50\1\7"+
    "\1\51\1\65\1\66\1\67\2\60\4\16\1\24\1\0"+
    "\1\61\1\0\1\70\1\0\1\71\1\72\1\73\1\74"+
    "\1\75\1\0\1\60\3\0\1\76\1\0\1\77\2\0"+
    "\1\16\1\0\1\100\11\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac"+
    "\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618\0\u064c"+
    "\0\u0680\0\u06b4\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0270\0\u0270"+
    "\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u0270\0\u08bc"+
    "\0\u0270\0\u08f0\0\u0924\0\u0958\0\u098c\0\u0270\0\u09c0\0\u09f4"+
    "\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94"+
    "\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0270\0\u0d00"+
    "\0\u0270\0\u0270\0\u0270\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0270"+
    "\0\u0e04\0\u0270\0\u0e38\0\u0e6c\0\u0ea0\0\u0270\0\u0ed4\0\u0270"+
    "\0\u0270\0\u0f08\0\u0270\0\u0270\0\u0270\0\u0f3c\0\u0f70\0\u0fa4"+
    "\0\u0fd8\0\u100c\0\u1040\0\u0fa4\0\u1074\0\u10a8\0\u0270\0\u10dc"+
    "\0\u1110\0\u1144\0\u1178\0\u11ac\0\u1040\0\u11e0\0\u1214\0\u0fa4"+
    "\0\u1040\0\u1248\0\u127c\0\u0fa4\0\u12b0\0\u12e4\0\u0fa4\0\u0270"+
    "\0\u1318\0\u134c\0\u0270\0\u0270\0\u1380\0\u13b4\0\u13e8\0\u0270"+
    "\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1554"+
    "\0\u1588\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4"+
    "\0\u0b94\0\u1728\0\u0270\0\u175c\0\u1790\0\u0270\0\u17c4\0\u0e6c"+
    "\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8\0\u0270\0\u18fc\0\u12b0"+
    "\0\u1040\0\u0270\0\u12b0\0\u1040\0\u1040\0\u1930\0\u1930\0\u0270"+
    "\0\u1964\0\u1998\0\u19cc\0\u141c\0\u1450\0\u1484\0\u0270\0\u1a00"+
    "\0\u1a34\0\u1a68\0\u0270\0\u1a9c\0\u0270\0\u0270\0\u1ad0\0\u0270"+
    "\0\u0340\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0\0\u1bd4\0\u0270\0\u1c08"+
    "\0\u0270\0\u1c3c\0\u1c70\0\u1ca4\0\u1cd8\0\u0270\0\u1d0c\0\u1d40"+
    "\0\u1d74\0\u1da8\0\u1ddc\0\u1e10\0\u1e44\0\u1e78\0\u1eac";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\15\1\16\1\17\1\20\2\21\1\22\1\23\1\24"+
    "\1\21\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\15\1\34\1\21\1\35\1\36\1\37\1\21\1\40"+
    "\1\41\1\42\2\43\1\44\1\45\2\46\1\47\1\50"+
    "\1\51\1\21\2\52\1\53\1\54\1\21\1\45\1\21"+
    "\1\45\2\21\1\46\1\55\1\56\2\15\3\57\4\60"+
    "\1\57\2\60\2\57\1\61\5\57\2\60\3\57\1\60"+
    "\2\57\1\60\2\57\1\61\3\60\2\57\1\62\1\60"+
    "\3\57\10\60\4\57\1\15\1\63\1\64\1\65\2\66"+
    "\1\67\1\70\1\71\1\66\1\72\1\73\1\74\1\75"+
    "\1\76\1\77\1\100\1\15\1\101\1\66\1\102\1\103"+
    "\1\104\1\66\1\105\1\106\3\107\2\15\2\66\2\15"+
    "\1\110\1\66\4\15\1\66\1\15\1\66\1\15\3\66"+
    "\2\111\2\15\2\112\1\113\10\112\1\113\5\112\1\113"+
    "\4\112\1\114\5\112\1\113\6\112\1\115\3\112\1\116"+
    "\10\112\2\113\1\112\1\113\60\0\2\117\2\0\26\112"+
    "\1\114\13\112\1\120\1\121\3\112\1\116\14\112\43\122"+
    "\1\123\1\122\2\124\11\122\2\125\2\122\42\15\1\126"+
    "\1\127\21\15\1\16\1\17\1\20\2\21\1\22\1\23"+
    "\1\24\1\21\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\130\1\34\1\21\1\35\1\36\1\37\1\21"+
    "\1\40\1\41\1\42\2\43\1\44\1\45\2\46\1\47"+
    "\1\50\1\51\1\21\2\52\1\53\1\54\1\21\1\45"+
    "\1\21\1\45\2\21\1\46\1\55\1\56\3\15\1\131"+
    "\11\15\1\131\4\15\1\131\13\15\1\131\5\15\1\0"+
    "\15\15\2\132\1\131\4\15\4\133\1\15\2\133\10\15"+
    "\2\133\3\15\1\133\7\15\2\133\2\15\1\110\1\133"+
    "\4\15\1\133\3\15\3\133\4\15\3\134\4\135\1\134"+
    "\2\135\10\134\2\135\3\134\1\135\13\134\1\136\1\135"+
    "\4\134\1\135\3\134\2\135\5\134\65\0\1\137\1\140"+
    "\7\0\1\141\1\142\1\0\1\143\7\0\1\144\3\0"+
    "\1\145\34\0\1\142\12\0\1\143\13\0\1\145\35\0"+
    "\1\21\1\146\2\21\1\0\2\21\2\0\1\147\5\0"+
    "\2\21\3\0\1\21\5\0\1\147\3\21\3\0\1\21"+
    "\3\0\10\21\7\0\4\21\1\0\2\21\2\0\1\147"+
    "\5\0\2\21\3\0\1\21\5\0\1\147\3\21\3\0"+
    "\1\21\3\0\10\21\7\0\4\21\1\0\2\21\2\0"+
    "\1\147\5\0\1\150\1\21\3\0\1\21\5\0\1\147"+
    "\3\21\3\0\1\21\3\0\10\21\13\0\1\151\21\0"+
    "\1\152\35\0\3\21\1\153\1\0\2\21\2\0\1\147"+
    "\5\0\2\21\3\0\1\21\5\0\1\147\3\21\3\0"+
    "\1\21\3\0\10\21\6\0\1\141\7\0\1\154\53\0"+
    "\1\155\10\0\1\156\15\0\1\152\47\0\1\157\13\0"+
    "\1\145\34\0\1\160\7\0\1\161\2\0\1\157\13\0"+
    "\1\152\50\0\1\162\12\0\1\145\52\0\1\163\10\0"+
    "\1\152\53\0\1\164\45\0\4\21\1\0\2\21\2\0"+
    "\1\147\5\0\2\21\3\0\1\165\5\0\1\147\3\21"+
    "\3\0\1\21\3\0\10\21\30\0\1\166\41\0\1\167"+
    "\22\0\1\140\3\0\1\152\60\0\1\144\13\0\1\170"+
    "\1\171\50\0\1\140\1\152\63\0\1\172\10\0\2\173"+
    "\1\0\1\173\47\0\1\152\32\0\26\174\1\175\13\174"+
    "\1\0\21\174\24\0\1\176\11\0\1\45\11\0\1\45"+
    "\1\0\1\45\1\177\1\45\12\0\4\46\1\0\2\46"+
    "\2\0\1\200\5\0\2\46\3\0\1\46\5\0\1\200"+
    "\3\46\3\0\1\46\3\0\10\46\46\0\1\50\66\0"+
    "\2\52\15\0\42\53\2\0\20\53\22\0\1\201\1\0"+
    "\1\176\11\0\1\45\5\0\1\202\3\0\1\45\1\203"+
    "\1\45\1\177\1\45\67\0\1\204\64\0\1\205\5\0"+
    "\4\60\1\0\2\60\10\0\2\60\3\0\1\60\2\0"+
    "\1\60\3\0\3\60\3\0\1\60\3\0\10\60\46\0"+
    "\1\57\22\0\1\206\1\107\7\0\1\207\1\210\1\0"+
    "\1\107\7\0\1\107\40\0\1\210\12\0\1\107\52\0"+
    "\1\211\101\0\1\212\50\0\1\213\62\0\1\214\57\0"+
    "\1\207\7\0\1\215\53\0\1\107\10\0\1\216\65\0"+
    "\1\217\50\0\1\107\7\0\1\107\2\0\1\217\64\0"+
    "\1\220\65\0\1\221\64\0\1\107\71\0\1\107\60\0"+
    "\1\222\41\0\1\107\22\0\1\107\64\0\1\107\65\0"+
    "\1\107\64\0\1\107\74\0\1\15\21\0\43\223\1\224"+
    "\1\225\17\223\42\0\1\112\41\0\1\226\123\0\2\227"+
    "\44\0\1\120\63\0\1\122\66\0\2\230\11\0\2\231"+
    "\62\0\2\232\44\0\1\126\101\0\2\233\44\0\1\134"+
    "\22\0\1\155\1\234\7\0\1\155\102\0\1\235\34\0"+
    "\1\155\26\0\1\145\34\0\1\155\112\0\1\145\74\0"+
    "\2\236\1\0\1\236\21\0\2\21\1\237\1\21\1\0"+
    "\2\21\2\0\1\147\5\0\2\21\3\0\1\21\5\0"+
    "\1\147\3\21\3\0\1\21\3\0\10\21\7\0\4\21"+
    "\1\0\2\21\2\0\1\147\5\0\1\21\1\240\3\0"+
    "\1\21\5\0\1\147\3\21\3\0\1\21\3\0\10\21"+
    "\13\0\1\241\21\0\1\145\74\0\2\242\1\0\1\242"+
    "\21\0\4\21\1\0\1\21\1\243\2\0\1\147\5\0"+
    "\2\21\3\0\1\21\5\0\1\147\3\21\3\0\1\21"+
    "\3\0\10\21\16\0\1\244\64\0\1\245\15\0\1\145"+
    "\47\0\1\161\13\0\1\145\50\0\1\246\66\0\1\247"+
    "\45\0\4\21\1\0\2\21\2\0\1\147\5\0\2\21"+
    "\3\0\1\21\1\0\1\145\3\0\1\147\3\21\3\0"+
    "\1\21\3\0\10\21\30\0\1\147\4\0\1\235\74\0"+
    "\1\170\52\0\1\250\32\0\43\174\1\251\1\252\17\174"+
    "\36\0\1\253\11\0\1\253\1\0\1\253\1\0\1\253"+
    "\45\0\1\45\11\0\1\45\1\0\1\45\1\0\1\45"+
    "\57\0\1\254\1\0\1\254\1\0\1\254\14\0\1\255"+
    "\2\0\2\255\24\0\1\255\1\0\1\255\7\0\3\255"+
    "\1\0\1\255\1\0\2\255\54\0\1\256\1\0\1\256"+
    "\71\0\1\257\64\0\1\257\3\0\1\107\1\210\7\0"+
    "\1\107\53\0\1\107\66\0\1\260\101\0\1\107\47\0"+
    "\1\107\65\0\1\107\64\0\1\107\64\0\1\107\65\0"+
    "\1\107\64\0\1\107\71\0\1\107\101\0\1\223\26\0"+
    "\1\261\2\0\2\261\6\0\1\262\15\0\1\261\1\0"+
    "\1\261\7\0\3\261\1\0\1\261\1\0\2\261\64\0"+
    "\2\263\62\0\2\264\62\0\2\265\62\0\2\266\4\0"+
    "\1\267\123\0\2\270\1\0\1\270\21\0\3\21\1\271"+
    "\1\0\2\21\2\0\1\147\5\0\2\21\3\0\1\21"+
    "\5\0\1\147\3\21\3\0\1\21\3\0\10\21\35\0"+
    "\1\272\74\0\1\174\26\0\1\273\2\0\2\273\6\0"+
    "\1\274\15\0\1\273\1\0\1\273\7\0\3\273\1\0"+
    "\1\273\1\0\2\273\11\0\1\275\30\0\1\253\11\0"+
    "\1\253\1\0\1\253\1\176\1\253\2\0\1\275\12\0"+
    "\1\107\62\0\1\223\2\0\2\223\24\0\1\223\1\0"+
    "\1\223\7\0\3\223\1\0\1\223\1\0\2\223\11\0"+
    "\1\276\2\0\2\276\24\0\1\276\1\0\1\276\7\0"+
    "\3\276\1\0\1\276\1\0\2\276\64\0\2\277\33\0"+
    "\1\300\74\0\2\301\1\0\1\301\23\0\1\174\2\0"+
    "\2\174\24\0\1\174\1\0\1\174\7\0\3\174\1\0"+
    "\1\174\1\0\2\174\11\0\1\302\2\0\2\302\24\0"+
    "\1\302\1\0\1\302\7\0\3\302\1\0\1\302\1\0"+
    "\2\302\31\0\1\303\2\0\1\303\5\0\1\304\11\0"+
    "\1\304\1\0\1\304\1\0\1\304\14\0\1\305\2\0"+
    "\2\305\7\0\1\223\14\0\1\305\1\0\1\305\7\0"+
    "\3\305\1\0\1\305\1\0\2\305\46\0\2\306\1\0"+
    "\1\306\23\0\1\307\2\0\2\307\7\0\1\174\14\0"+
    "\1\307\1\0\1\307\7\0\3\307\1\0\1\307\1\0"+
    "\2\307\42\0\1\304\11\0\1\304\1\0\1\304\1\0"+
    "\1\304\45\0\1\304\11\0\1\304\1\0\1\304\1\303"+
    "\1\304\14\0\1\310\2\0\2\310\7\0\1\223\14\0"+
    "\1\310\1\0\1\310\7\0\3\310\1\0\1\310\1\0"+
    "\2\310\11\0\1\311\2\0\2\311\7\0\1\174\14\0"+
    "\1\311\1\0\1\311\7\0\3\311\1\0\1\311\1\0"+
    "\2\311\11\0\1\312\2\0\2\312\7\0\1\223\14\0"+
    "\1\312\1\0\1\312\7\0\3\312\1\0\1\312\1\0"+
    "\2\312\11\0\1\313\2\0\2\313\7\0\1\174\14\0"+
    "\1\313\1\0\1\313\7\0\3\313\1\0\1\313\1\0"+
    "\2\313\11\0\1\314\2\0\2\314\7\0\1\223\14\0"+
    "\1\314\1\0\1\314\7\0\3\314\1\0\1\314\1\0"+
    "\2\314\11\0\1\315\2\0\2\315\7\0\1\174\14\0"+
    "\1\315\1\0\1\315\7\0\3\315\1\0\1\315\1\0"+
    "\2\315\11\0\1\316\2\0\2\316\7\0\1\223\14\0"+
    "\1\316\1\0\1\316\7\0\3\316\1\0\1\316\1\0"+
    "\2\316\11\0\1\317\2\0\2\317\7\0\1\174\14\0"+
    "\1\317\1\0\1\317\7\0\3\317\1\0\1\317\1\0"+
    "\2\317\25\0\1\223\63\0\1\174\42\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7904];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\14\0\1\11\31\1\2\11\6\1\1\11\1\1\1\11"+
    "\4\1\1\11\20\1\1\11\1\1\3\11\3\1\1\0"+
    "\1\11\1\1\1\11\3\1\1\11\1\1\2\11\1\1"+
    "\3\11\1\1\1\0\2\1\1\0\2\1\1\0\1\1"+
    "\1\11\2\1\1\0\1\1\1\0\5\1\2\0\4\1"+
    "\1\11\1\0\1\1\2\11\1\1\2\0\1\11\6\0"+
    "\1\1\3\0\1\1\2\0\2\1\2\0\1\1\1\11"+
    "\2\1\1\11\7\0\1\11\3\1\1\11\5\1\1\11"+
    "\6\1\1\11\1\0\1\1\1\0\1\11\1\0\2\11"+
    "\1\1\1\11\1\1\1\0\1\1\3\0\1\11\1\0"+
    "\1\11\2\0\1\1\1\0\1\11\11\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[207];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private org.elixir_lang.lexer.Stack stack = new org.elixir_lang.lexer.Stack();

  private void startQuote(CharSequence quotePromoterCharSequence) {
    String quotePromoter = quotePromoterCharSequence.toString();
    stack.push(quotePromoter, yystate());

    if (Base.isHeredocPromoter(quotePromoter)) {
      yybegin(GROUP_HEREDOC_START);
    } else {
      yybegin(GROUP);
    }
  }

  private IElementType fragmentType() {
    return stack.fragmentType();
  }

  private void handleInState(int nextLexicalState) {
    yypushback(yylength());
    yybegin(nextLexicalState);
  }

  private boolean isTerminator(CharSequence terminator) {
    return stack.terminator().equals(terminator.toString());
  }

  private boolean isInterpolating() {
    return stack.isInterpolating();
  }

  private boolean isInterpolatingSigil(CharSequence sigilName) {
    if (sigilName.length() != 1) {
      throw new IllegalArgumentException("sigil names can only be 1 character long");
    }

    return isInterpolatingSigil(sigilName.charAt(0));
  }

  private boolean isInterpolatingSigil(char sigilName) {
    return (sigilName >= 'a' && sigilName <= 'z');
  }

  private boolean isSigil() {
    return stack.isSigil();
  }

  private void nameSigil(CharSequence sigilName) {
    stack.nameSigil(sigilName.charAt(0));
  }

  private org.elixir_lang.lexer.StackFrame pop() {
    return stack.pop();
  }

  private org.elixir_lang.lexer.group.Quote promotedQuote(CharSequence promoterCharSequence) {
    // CharSequences don't look up correctly, so convert to String, which do.
    String promoter = promoterCharSequence.toString();
    org.elixir_lang.lexer.group.Quote quote = org.elixir_lang.lexer.group.Quote.fetch(promoter);

    return quote;
  }

  private IElementType promoterType() {
    return stack.promoterType();
  }

  private void setPromoter(CharSequence promoter) {
    stack.setPromoter(promoter.toString());
  }

  private IElementType sigilNameType() {
    return stack.sigilNameType();
  }

  // public for testing
  public void pushAndBegin(int lexicalState) {
    stack.push(yystate());
    yybegin(lexicalState);
  }

  private IElementType terminatorType() {
    return stack.terminatorType();
  }


  public ElixirFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ElixirFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 28: 
          { if (isTerminator(yytext())) {
                         if (isSigil()) {
                           yybegin(SIGIL_MODIFIERS);
                           return terminatorType();
                         } else {
                           org.elixir_lang.lexer.StackFrame stackFrame = pop();
                           yybegin(stackFrame.getLastLexicalState());
                           return stackFrame.terminatorType();
                         }
                       } else {
                         return fragmentType();
                       }
          }
        case 65: break;
        case 55: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { pushAndBegin(ATOM_START);
                                               return ElixirTypes.COLON;
          }
        case 66: break;
        case 41: 
          { return ElixirTypes.OR_OPERATOR;
          }
        case 67: break;
        case 11: 
          { pushAndBegin(ATOM_START);
                                               return ElixirTypes.COLON;
          }
        case 68: break;
        case 15: 
          { return ElixirTypes.ALIAS;
          }
        case 69: break;
        case 62: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(GROUP_HEREDOC_END);
                                                  return TokenType.WHITE_SPACE;
          }
        case 70: break;
        case 43: 
          { return ElixirTypes.ASSOCIATION_OPERATOR;
          }
        case 71: break;
        case 6: 
          { return ElixirTypes.PIPE_OPERATOR;
          }
        case 72: break;
        case 64: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 4;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 73: break;
        case 63: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 3;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 74: break;
        case 60: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 2;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 75: break;
        case 52: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 76: break;
        case 51: 
          // lookahead expression with fixed lookahead length
          yypushback(2);
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 77: break;
        case 29: 
          { yybegin(GROUP_HEREDOC_LINE_START);
          return fragmentType();
          }
        case 78: break;
        case 18: 
          { return TokenType.WHITE_SPACE;
          }
        case 79: break;
        case 46: 
          { return ElixirTypes.TYPE_OPERATOR;
          }
        case 80: break;
        case 54: 
          { return ElixirTypes.MAP_OPERATOR;
          }
        case 81: break;
        case 7: 
          { return ElixirTypes.UNARY_OPERATOR;
          }
        case 82: break;
        case 49: 
          { if (isInterpolating()) {
                              return ElixirTypes.VALID_ESCAPE_SEQUENCE;
                            } else {
                              return fragmentType();
                            }
          }
        case 83: break;
        case 27: 
          { return fragmentType();
          }
        case 84: break;
        case 44: 
          { return ElixirTypes.TUPLE_OPERATOR;
          }
        case 85: break;
        case 12: 
          { return ElixirTypes.AT_OPERATOR;
          }
        case 86: break;
        case 17: 
          { return ElixirTypes.EOL;
          }
        case 87: break;
        case 42: 
          { return ElixirTypes.COMPARISON_OPERATOR;
          }
        case 88: break;
        case 24: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     yybegin(stackFrame.getLastLexicalState());
                     return ElixirTypes.ATOM_FRAGMENT;
          }
        case 89: break;
        case 38: 
          { return ElixirTypes.ARROW_OPERATOR;
          }
        case 90: break;
        case 59: 
          { return ElixirTypes.BIT_STRING_OPERATOR;
          }
        case 91: break;
        case 30: 
          { handleInState(GROUP_HEREDOC_LINE_BODY);
          }
        case 92: break;
        case 22: 
          { return ElixirTypes.ATOM_FRAGMENT;
          }
        case 93: break;
        case 56: 
          { if (isTerminator(yytext())) {
                                      if (isSigil()) {
                                        yybegin(SIGIL_MODIFIERS);
                                        return terminatorType();
                                      } else {
                                        org.elixir_lang.lexer.StackFrame stackFrame = pop();
                                        yybegin(stackFrame.getLastLexicalState());
                                        return stackFrame.terminatorType();
                                      }
                                   } else {
                                      handleInState(GROUP_HEREDOC_LINE_BODY);
                                   }
          }
        case 94: break;
        case 32: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                                yybegin(stackFrame.getLastLexicalState());
                                return ElixirTypes.INTERPOLATION_END;
          }
        case 95: break;
        case 61: 
          { return ElixirTypes.WHEN_OPERATOR;
          }
        case 96: break;
        case 47: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return ElixirTypes.COLON;
          }
        case 97: break;
        case 25: 
          { yybegin(ATOM_BODY);
                     return ElixirTypes.ATOM_FRAGMENT;
          }
        case 98: break;
        case 34: 
          { nameSigil(yytext());
                               yybegin(NAMED_SIGIL);
                               return sigilNameType();
          }
        case 99: break;
        case 13: 
          { return ElixirTypes.MULTIPLICATION_OPERATOR;
          }
        case 100: break;
        case 53: 
          { return ElixirTypes.HAT_OPERATOR;
          }
        case 101: break;
        case 4: 
          { return ElixirTypes.CAPTURE_OPERATOR;
          }
        case 102: break;
        case 45: 
          { return ElixirTypes.STAB_OPERATOR;
          }
        case 103: break;
        case 3: 
          { return ElixirTypes.IDENTIFIER;
          }
        case 104: break;
        case 31: 
          { yybegin(GROUP_HEREDOC_LINE_START);
          return ElixirTypes.EOL;
          }
        case 105: break;
        case 20: 
          { startQuote(yytext());
                                               return promoterType();
          }
        case 106: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 107: break;
        case 35: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     handleInState(stackFrame.getLastLexicalState());
          }
        case 108: break;
        case 37: 
          { return ElixirTypes.TWO_OPERATOR;
          }
        case 109: break;
        case 40: 
          { return ElixirTypes.AND_OPERATOR;
          }
        case 110: break;
        case 14: 
          { return ElixirTypes.NUMBER;
          }
        case 111: break;
        case 19: 
          { return ElixirTypes.COMMENT;
          }
        case 112: break;
        case 21: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                   handleInState(stackFrame.getLastLexicalState());
          }
        case 113: break;
        case 23: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                   yybegin(stackFrame.getLastLexicalState());
                   return ElixirTypes.ATOM_FRAGMENT;
          }
        case 114: break;
        case 39: 
          { return ElixirTypes.IN_MATCH_OPERATOR;
          }
        case 115: break;
        case 33: 
          { setPromoter(yytext());
                             yybegin(GROUP);
                             return promoterType();
          }
        case 116: break;
        case 10: 
          { return ElixirTypes.DUAL_OPERATOR;
          }
        case 117: break;
        case 5: 
          { pushAndBegin(SIGIL);
                                               return ElixirTypes.TILDE;
          }
        case 118: break;
        case 58: 
          { setPromoter(yytext());
                             yybegin(GROUP_HEREDOC_START);
                             return promoterType();
          }
        case 119: break;
        case 50: 
          { if (isInterpolating()) {
                             pushAndBegin(INTERPOLATION);
                             return ElixirTypes.INTERPOLATION_START;
                            } else {
                             return fragmentType();
                            }
          }
        case 120: break;
        case 8: 
          { return ElixirTypes.MATCH_OPERATOR;
          }
        case 121: break;
        case 48: 
          { return ElixirTypes.CHAR_TOKEN;
          }
        case 122: break;
        case 9: 
          { return ElixirTypes.STRUCT_OPERATOR;
          }
        case 123: break;
        case 36: 
          { return ElixirTypes.SIGIL_MODIFIER;
          }
        case 124: break;
        case 2: 
          { return ElixirTypes.RELATIONAL_OPERATOR;
          }
        case 125: break;
        case 16: 
          { return ElixirTypes.SEMICOLON;
          }
        case 126: break;
        case 57: 
          { handleInState(GROUP_HEREDOC_END);
          }
        case 127: break;
        case 26: 
          { /* At the end of the quote, return the state (YYINITIAL or INTERPOLATION) before ATOM_START as
                        anything after the closing quote should be handle by the state prior to ATOM_START.  Without
                        this, EOL and WHITESPACE won't be handled correctly */
                     org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     yybegin(stackFrame.getLastLexicalState());
                     startQuote(yytext());
                     return promoterType();
          }
        case 128: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

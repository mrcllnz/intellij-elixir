// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.elixir_lang.ElementTypeFactory;
import org.elixir_lang.psi.impl.*;

public interface ElixirTypes {

  IElementType ACCESS_EXPRESSION = new ElixirElementType("ACCESS_EXPRESSION");
  IElementType ADDITION_INFIX_OPERATOR = new ElixirElementType("ADDITION_INFIX_OPERATOR");
  IElementType ALIAS = new ElixirElementType("ALIAS");
  IElementType AND_INFIX_OPERATOR = new ElixirElementType("AND_INFIX_OPERATOR");
  IElementType ANONYMOUS_FUNCTION = new ElixirElementType("ANONYMOUS_FUNCTION");
  IElementType ARROW_INFIX_OPERATOR = new ElixirElementType("ARROW_INFIX_OPERATOR");
  IElementType ASSOCIATIONS = new ElixirElementType("ASSOCIATIONS");
  IElementType ASSOCIATIONS_BASE = new ElixirElementType("ASSOCIATIONS_BASE");
  IElementType ATOM = new ElixirElementType("ATOM");
  IElementType ATOM_KEYWORD = new ElixirElementType("ATOM_KEYWORD");
  IElementType AT_IDENTIFIER = new ElixirElementType("AT_IDENTIFIER");
  IElementType AT_PREFIX_OPERATOR = new ElixirElementType("AT_PREFIX_OPERATOR");
  IElementType BINARY_DIGITS = new ElixirElementType("BINARY_DIGITS");
  IElementType BINARY_WHOLE_NUMBER = new ElixirElementType("BINARY_WHOLE_NUMBER");
  IElementType BIT_STRING = new ElixirElementType("BIT_STRING");
  IElementType BLOCK_IDENTIFIER = new ElixirElementType("BLOCK_IDENTIFIER");
  IElementType BLOCK_ITEM = new ElixirElementType("BLOCK_ITEM");
  IElementType BLOCK_LIST = new ElixirElementType("BLOCK_LIST");
  IElementType BRACKET_ARGUMENTS = new ElixirElementType("BRACKET_ARGUMENTS");
  IElementType CAPTURE_NUMERIC_OPERATION = new ElixirElementType("CAPTURE_NUMERIC_OPERATION");
  IElementType CAPTURE_PREFIX_OPERATOR = new ElixirElementType("CAPTURE_PREFIX_OPERATOR");
  IElementType CHAR_TOKEN = new ElixirElementType("CHAR_TOKEN");
  IElementType COMPARISON_INFIX_OPERATOR = new ElixirElementType("COMPARISON_INFIX_OPERATOR");
  IElementType CONTAINER_ASSOCIATION_OPERATION = new ElixirElementType("CONTAINER_ASSOCIATION_OPERATION");
  IElementType DECIMAL_DIGITS = new ElixirElementType("DECIMAL_DIGITS");
  IElementType DECIMAL_FLOAT = new ElixirElementType("DECIMAL_FLOAT");
  IElementType DECIMAL_FLOAT_EXPONENT = new ElixirElementType("DECIMAL_FLOAT_EXPONENT");
  IElementType DECIMAL_FLOAT_EXPONENT_SIGN = new ElixirElementType("DECIMAL_FLOAT_EXPONENT_SIGN");
  IElementType DECIMAL_FLOAT_FRACTIONAL = new ElixirElementType("DECIMAL_FLOAT_FRACTIONAL");
  IElementType DECIMAL_FLOAT_INTEGRAL = new ElixirElementType("DECIMAL_FLOAT_INTEGRAL");
  IElementType DECIMAL_WHOLE_NUMBER = new ElixirElementType("DECIMAL_WHOLE_NUMBER");
  IElementType DOT_INFIX_OPERATOR = new ElixirElementType("DOT_INFIX_OPERATOR");
  IElementType DO_BLOCK = new ElixirElementType("DO_BLOCK");
  IElementType EEX = new ElixirElementType("EEX");
  IElementType EEX_TAG = new ElixirElementType("EEX_TAG");
  IElementType EMPTY_PARENTHESES = new ElixirElementType("EMPTY_PARENTHESES");
  IElementType ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType END_OF_EXPRESSION = new ElixirElementType("END_OF_EXPRESSION");
  IElementType ESCAPED_CHARACTER = new ElixirElementType("ESCAPED_CHARACTER");
  IElementType ESCAPED_EOL = new ElixirElementType("ESCAPED_EOL");
  IElementType ESCAPED_HEREDOC_TERMINATOR = new ElixirElementType("ESCAPED_HEREDOC_TERMINATOR");
  IElementType ESCAPED_LINE_TERMINATOR = new ElixirElementType("ESCAPED_LINE_TERMINATOR");
  IElementType HEREDOC = new ElixirElementType("HEREDOC");
  IElementType HEREDOC_LINE = new ElixirElementType("HEREDOC_LINE");
  IElementType HEREDOC_LINE_BODY = new ElixirElementType("HEREDOC_LINE_BODY");
  IElementType HEREDOC_LINE_PREFIX = new ElixirElementType("HEREDOC_LINE_PREFIX");
  IElementType HEREDOC_PREFIX = new ElixirElementType("HEREDOC_PREFIX");
  IElementType HEXADECIMAL_DIGITS = new ElixirElementType("HEXADECIMAL_DIGITS");
  IElementType HEXADECIMAL_ESCAPE_PREFIX = new ElixirElementType("HEXADECIMAL_ESCAPE_PREFIX");
  IElementType HEXADECIMAL_WHOLE_NUMBER = new ElixirElementType("HEXADECIMAL_WHOLE_NUMBER");
  IElementType IDENTIFIER = new ElixirElementType("IDENTIFIER");
  IElementType INTERPOLATED_HEREDOC_LINE = new ElixirElementType("INTERPOLATED_HEREDOC_LINE");
  IElementType INTERPOLATED_HEREDOC_LINE_BODY = new ElixirElementType("INTERPOLATED_HEREDOC_LINE_BODY");
  IElementType INTERPOLATED_SIGIL_HEREDOC = new ElixirElementType("INTERPOLATED_SIGIL_HEREDOC");
  IElementType INTERPOLATED_SIGIL_LINE = new ElixirElementType("INTERPOLATED_SIGIL_LINE");
  IElementType INTERPOLATED_SIGIL_LINE_BODY = new ElixirElementType("INTERPOLATED_SIGIL_LINE_BODY");
  IElementType INTERPOLATION = new ElixirElementType("INTERPOLATION");
  IElementType IN_INFIX_OPERATOR = new ElixirElementType("IN_INFIX_OPERATOR");
  IElementType IN_MATCH_INFIX_OPERATOR = new ElixirElementType("IN_MATCH_INFIX_OPERATOR");
  IElementType KEYWORDS = new ElixirElementType("KEYWORDS");
  IElementType KEYWORD_KEY = new ElixirElementType("KEYWORD_KEY");
  IElementType KEYWORD_PAIR = new ElixirElementType("KEYWORD_PAIR");
  IElementType LINE = new ElixirElementType("LINE");
  IElementType LINE_BODY = new ElixirElementType("LINE_BODY");
  IElementType LIST = new ElixirElementType("LIST");
  IElementType LITERAL_HEREDOC_LINE = new ElixirElementType("LITERAL_HEREDOC_LINE");
  IElementType LITERAL_HEREDOC_LINE_BODY = new ElixirElementType("LITERAL_HEREDOC_LINE_BODY");
  IElementType LITERAL_SIGIL_HEREDOC = new ElixirElementType("LITERAL_SIGIL_HEREDOC");
  IElementType LITERAL_SIGIL_LINE = new ElixirElementType("LITERAL_SIGIL_LINE");
  IElementType LITERAL_SIGIL_LINE_BODY = new ElixirElementType("LITERAL_SIGIL_LINE_BODY");
  IElementType MAP_ARGUMENTS = new ElixirElementType("MAP_ARGUMENTS");
  IElementType MAP_CONSTRUCTION_ARGUMENTS = new ElixirElementType("MAP_CONSTRUCTION_ARGUMENTS");
  IElementType MAP_OPERATION = new ElixirElementType("MAP_OPERATION");
  IElementType MAP_PREFIX_OPERATOR = new ElixirElementType("MAP_PREFIX_OPERATOR");
  IElementType MAP_UPDATE_ARGUMENTS = new ElixirElementType("MAP_UPDATE_ARGUMENTS");
  IElementType MATCHED_ADDITION_OPERATION = new ElixirElementType("MATCHED_ADDITION_OPERATION");
  IElementType MATCHED_AND_OPERATION = new ElixirElementType("MATCHED_AND_OPERATION");
  IElementType MATCHED_ARROW_OPERATION = new ElixirElementType("MATCHED_ARROW_OPERATION");
  IElementType MATCHED_AT_NUMERIC_BRACKET_OPERATION = new ElixirElementType("MATCHED_AT_NUMERIC_BRACKET_OPERATION");
  IElementType MATCHED_AT_OPERATION = new ElixirElementType("MATCHED_AT_OPERATION");
  IElementType MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION = new ElixirElementType("MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION");
  IElementType MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL = ElementTypeFactory.factory("MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL");
  IElementType MATCHED_BRACKET_OPERATION = new ElixirElementType("MATCHED_BRACKET_OPERATION");
  IElementType MATCHED_CAPTURE_NON_NUMERIC_OPERATION = new ElixirElementType("MATCHED_CAPTURE_NON_NUMERIC_OPERATION");
  IElementType MATCHED_COMPARISON_OPERATION = new ElixirElementType("MATCHED_COMPARISON_OPERATION");
  IElementType MATCHED_DOT_CALL = ElementTypeFactory.factory("MATCHED_DOT_CALL");
  IElementType MATCHED_EXPRESSION = new ElixirElementType("MATCHED_EXPRESSION");
  IElementType MATCHED_IN_MATCH_OPERATION = new ElixirElementType("MATCHED_IN_MATCH_OPERATION");
  IElementType MATCHED_IN_OPERATION = new ElixirElementType("MATCHED_IN_OPERATION");
  IElementType MATCHED_MATCH_OPERATION = new ElixirElementType("MATCHED_MATCH_OPERATION");
  IElementType MATCHED_MULTIPLICATION_OPERATION = new ElixirElementType("MATCHED_MULTIPLICATION_OPERATION");
  IElementType MATCHED_NOT_IN_OPERATION = new ElixirElementType("MATCHED_NOT_IN_OPERATION");
  IElementType MATCHED_OR_OPERATION = new ElixirElementType("MATCHED_OR_OPERATION");
  IElementType MATCHED_PARENTHESES_ARGUMENTS = new ElixirElementType("MATCHED_PARENTHESES_ARGUMENTS");
  IElementType MATCHED_PIPE_OPERATION = new ElixirElementType("MATCHED_PIPE_OPERATION");
  IElementType MATCHED_POWER_OPERATION = new ElixirElementType("MATCHED_POWER_OPERATION");
  IElementType MATCHED_QUALIFIED_ALIAS = new ElixirElementType("MATCHED_QUALIFIED_ALIAS");
  IElementType MATCHED_QUALIFIED_BRACKET_OPERATION = new ElixirElementType("MATCHED_QUALIFIED_BRACKET_OPERATION");
  IElementType MATCHED_QUALIFIED_MULTIPLE_ALIASES = new ElixirElementType("MATCHED_QUALIFIED_MULTIPLE_ALIASES");
  IElementType MATCHED_QUALIFIED_NO_ARGUMENTS_CALL = ElementTypeFactory.factory("MATCHED_QUALIFIED_NO_ARGUMENTS_CALL");
  IElementType MATCHED_QUALIFIED_NO_PARENTHESES_CALL = ElementTypeFactory.factory("MATCHED_QUALIFIED_NO_PARENTHESES_CALL");
  IElementType MATCHED_QUALIFIED_PARENTHESES_CALL = ElementTypeFactory.factory("MATCHED_QUALIFIED_PARENTHESES_CALL");
  IElementType MATCHED_RELATIONAL_OPERATION = new ElixirElementType("MATCHED_RELATIONAL_OPERATION");
  IElementType MATCHED_THREE_OPERATION = new ElixirElementType("MATCHED_THREE_OPERATION");
  IElementType MATCHED_TWO_OPERATION = new ElixirElementType("MATCHED_TWO_OPERATION");
  IElementType MATCHED_TYPE_OPERATION = new ElixirElementType("MATCHED_TYPE_OPERATION");
  IElementType MATCHED_UNARY_OPERATION = new ElixirElementType("MATCHED_UNARY_OPERATION");
  IElementType MATCHED_UNQUALIFIED_BRACKET_OPERATION = new ElixirElementType("MATCHED_UNQUALIFIED_BRACKET_OPERATION");
  IElementType MATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL = ElementTypeFactory.factory("MATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL");
  IElementType MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL = ElementTypeFactory.factory("MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL");
  IElementType MATCHED_UNQUALIFIED_PARENTHESES_CALL = ElementTypeFactory.factory("MATCHED_UNQUALIFIED_PARENTHESES_CALL");
  IElementType MATCHED_WHEN_OPERATION = new ElixirElementType("MATCHED_WHEN_OPERATION");
  IElementType MATCH_INFIX_OPERATOR = new ElixirElementType("MATCH_INFIX_OPERATOR");
  IElementType MULTIPLE_ALIASES = new ElixirElementType("MULTIPLE_ALIASES");
  IElementType MULTIPLICATION_INFIX_OPERATOR = new ElixirElementType("MULTIPLICATION_INFIX_OPERATOR");
  IElementType NOT_INFIX_OPERATOR = new ElixirElementType("NOT_INFIX_OPERATOR");
  IElementType NO_PARENTHESES_ARGUMENTS = new ElixirElementType("NO_PARENTHESES_ARGUMENTS");
  IElementType NO_PARENTHESES_KEYWORDS = new ElixirElementType("NO_PARENTHESES_KEYWORDS");
  IElementType NO_PARENTHESES_KEYWORD_PAIR = new ElixirElementType("NO_PARENTHESES_KEYWORD_PAIR");
  IElementType NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION = new ElixirElementType("NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION");
  IElementType NO_PARENTHESES_ONE_ARGUMENT = new ElixirElementType("NO_PARENTHESES_ONE_ARGUMENT");
  IElementType NO_PARENTHESES_STRICT = new ElixirElementType("NO_PARENTHESES_STRICT");
  IElementType OCTAL_DIGITS = new ElixirElementType("OCTAL_DIGITS");
  IElementType OCTAL_WHOLE_NUMBER = new ElixirElementType("OCTAL_WHOLE_NUMBER");
  IElementType OPEN_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("OPEN_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType OR_INFIX_OPERATOR = new ElixirElementType("OR_INFIX_OPERATOR");
  IElementType PARENTHESES_ARGUMENTS = new ElixirElementType("PARENTHESES_ARGUMENTS");
  IElementType PARENTHETICAL_STAB = new ElixirElementType("PARENTHETICAL_STAB");
  IElementType PIPE_INFIX_OPERATOR = new ElixirElementType("PIPE_INFIX_OPERATOR");
  IElementType POWER_INFIX_OPERATOR = new ElixirElementType("POWER_INFIX_OPERATOR");
  IElementType QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType RELATIONAL_INFIX_OPERATOR = new ElixirElementType("RELATIONAL_INFIX_OPERATOR");
  IElementType RELATIVE_IDENTIFIER = new ElixirElementType("RELATIVE_IDENTIFIER");
  IElementType SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE = new ElixirElementType("SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE");
  IElementType SIGIL_MODIFIERS = new ElixirElementType("SIGIL_MODIFIERS");
  IElementType STAB = new ElixirElementType("STAB");
  IElementType STAB_BODY = new ElixirElementType("STAB_BODY");
  IElementType STAB_INFIX_OPERATOR = new ElixirElementType("STAB_INFIX_OPERATOR");
  IElementType STAB_NO_PARENTHESES_SIGNATURE = new ElixirElementType("STAB_NO_PARENTHESES_SIGNATURE");
  IElementType STAB_OPERATION = new ElixirElementType("STAB_OPERATION");
  IElementType STAB_PARENTHESES_SIGNATURE = new ElixirElementType("STAB_PARENTHESES_SIGNATURE");
  IElementType STRUCT_OPERATION = new ElixirElementType("STRUCT_OPERATION");
  IElementType THREE_INFIX_OPERATOR = new ElixirElementType("THREE_INFIX_OPERATOR");
  IElementType TUPLE = new ElixirElementType("TUPLE");
  IElementType TWO_INFIX_OPERATOR = new ElixirElementType("TWO_INFIX_OPERATOR");
  IElementType TYPE_INFIX_OPERATOR = new ElixirElementType("TYPE_INFIX_OPERATOR");
  IElementType UNARY_PREFIX_OPERATOR = new ElixirElementType("UNARY_PREFIX_OPERATOR");
  IElementType UNKNOWN_BASE_DIGITS = new ElixirElementType("UNKNOWN_BASE_DIGITS");
  IElementType UNKNOWN_BASE_WHOLE_NUMBER = new ElixirElementType("UNKNOWN_BASE_WHOLE_NUMBER");
  IElementType UNMATCHED_ADDITION_OPERATION = new ElixirElementType("UNMATCHED_ADDITION_OPERATION");
  IElementType UNMATCHED_AND_OPERATION = new ElixirElementType("UNMATCHED_AND_OPERATION");
  IElementType UNMATCHED_ARROW_OPERATION = new ElixirElementType("UNMATCHED_ARROW_OPERATION");
  IElementType UNMATCHED_AT_NUMERIC_BRACKET_OPERATION = new ElixirElementType("UNMATCHED_AT_NUMERIC_BRACKET_OPERATION");
  IElementType UNMATCHED_AT_OPERATION = new ElixirElementType("UNMATCHED_AT_OPERATION");
  IElementType UNMATCHED_AT_UNQUALIFIED_BRACKET_OPERATION = new ElixirElementType("UNMATCHED_AT_UNQUALIFIED_BRACKET_OPERATION");
  IElementType UNMATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL = ElementTypeFactory.factory("UNMATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL");
  IElementType UNMATCHED_BRACKET_OPERATION = new ElixirElementType("UNMATCHED_BRACKET_OPERATION");
  IElementType UNMATCHED_CAPTURE_NON_NUMERIC_OPERATION = new ElixirElementType("UNMATCHED_CAPTURE_NON_NUMERIC_OPERATION");
  IElementType UNMATCHED_COMPARISON_OPERATION = new ElixirElementType("UNMATCHED_COMPARISON_OPERATION");
  IElementType UNMATCHED_DOT_CALL = ElementTypeFactory.factory("UNMATCHED_DOT_CALL");
  IElementType UNMATCHED_EXPRESSION = new ElixirElementType("UNMATCHED_EXPRESSION");
  IElementType UNMATCHED_IN_MATCH_OPERATION = new ElixirElementType("UNMATCHED_IN_MATCH_OPERATION");
  IElementType UNMATCHED_IN_OPERATION = new ElixirElementType("UNMATCHED_IN_OPERATION");
  IElementType UNMATCHED_MATCH_OPERATION = new ElixirElementType("UNMATCHED_MATCH_OPERATION");
  IElementType UNMATCHED_MULTIPLICATION_OPERATION = new ElixirElementType("UNMATCHED_MULTIPLICATION_OPERATION");
  IElementType UNMATCHED_NOT_IN_OPERATION = new ElixirElementType("UNMATCHED_NOT_IN_OPERATION");
  IElementType UNMATCHED_OR_OPERATION = new ElixirElementType("UNMATCHED_OR_OPERATION");
  IElementType UNMATCHED_PIPE_OPERATION = new ElixirElementType("UNMATCHED_PIPE_OPERATION");
  IElementType UNMATCHED_POWER_OPERATION = new ElixirElementType("UNMATCHED_POWER_OPERATION");
  IElementType UNMATCHED_QUALIFIED_ALIAS = new ElixirElementType("UNMATCHED_QUALIFIED_ALIAS");
  IElementType UNMATCHED_QUALIFIED_BRACKET_OPERATION = new ElixirElementType("UNMATCHED_QUALIFIED_BRACKET_OPERATION");
  IElementType UNMATCHED_QUALIFIED_MULTIPLE_ALIASES = new ElixirElementType("UNMATCHED_QUALIFIED_MULTIPLE_ALIASES");
  IElementType UNMATCHED_QUALIFIED_NO_ARGUMENTS_CALL = ElementTypeFactory.factory("UNMATCHED_QUALIFIED_NO_ARGUMENTS_CALL");
  IElementType UNMATCHED_QUALIFIED_NO_PARENTHESES_CALL = ElementTypeFactory.factory("UNMATCHED_QUALIFIED_NO_PARENTHESES_CALL");
  IElementType UNMATCHED_QUALIFIED_PARENTHESES_CALL = ElementTypeFactory.factory("UNMATCHED_QUALIFIED_PARENTHESES_CALL");
  IElementType UNMATCHED_RELATIONAL_OPERATION = new ElixirElementType("UNMATCHED_RELATIONAL_OPERATION");
  IElementType UNMATCHED_THREE_OPERATION = new ElixirElementType("UNMATCHED_THREE_OPERATION");
  IElementType UNMATCHED_TWO_OPERATION = new ElixirElementType("UNMATCHED_TWO_OPERATION");
  IElementType UNMATCHED_TYPE_OPERATION = new ElixirElementType("UNMATCHED_TYPE_OPERATION");
  IElementType UNMATCHED_UNARY_OPERATION = new ElixirElementType("UNMATCHED_UNARY_OPERATION");
  IElementType UNMATCHED_UNQUALIFIED_BRACKET_OPERATION = new ElixirElementType("UNMATCHED_UNQUALIFIED_BRACKET_OPERATION");
  IElementType UNMATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL = ElementTypeFactory.factory("UNMATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL");
  IElementType UNMATCHED_UNQUALIFIED_NO_PARENTHESES_CALL = ElementTypeFactory.factory("UNMATCHED_UNQUALIFIED_NO_PARENTHESES_CALL");
  IElementType UNMATCHED_UNQUALIFIED_PARENTHESES_CALL = ElementTypeFactory.factory("UNMATCHED_UNQUALIFIED_PARENTHESES_CALL");
  IElementType UNMATCHED_WHEN_OPERATION = new ElixirElementType("UNMATCHED_WHEN_OPERATION");
  IElementType UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL = ElementTypeFactory.factory("UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL");
  IElementType VARIABLE = new ElixirElementType("VARIABLE");
  IElementType WHEN_INFIX_OPERATOR = new ElixirElementType("WHEN_INFIX_OPERATOR");

  IElementType ADDITION_OPERATOR = new ElixirTokenType("ADDITION_OPERATOR");
  IElementType AFTER = new ElixirTokenType("after");
  IElementType ALIAS_TOKEN = new ElixirTokenType("Alias");
  IElementType AND_SYMBOL_OPERATOR = new ElixirTokenType("&&&, &&");
  IElementType AND_WORD_OPERATOR = new ElixirTokenType("`and`");
  IElementType ARROW_OPERATOR = new ElixirTokenType("<<<, <<~, <|>, <~>, >>>, ~>>, <~, |>, ~>");
  IElementType ASSOCIATION_OPERATOR = new ElixirTokenType("=>");
  IElementType ATOM_FRAGMENT = new ElixirTokenType("A-Z, a-z, _, @, 0-9. ?, !");
  IElementType AT_OPERATOR = new ElixirTokenType("@");
  IElementType BASE_WHOLE_NUMBER_PREFIX = new ElixirTokenType("0");
  IElementType BINARY_WHOLE_NUMBER_BASE = new ElixirTokenType("b");
  IElementType BIT_STRING_OPERATOR = new ElixirTokenType("<<>>");
  IElementType CALL = new ElixirTokenType("<zero-width-call>");
  IElementType CAPTURE_OPERATOR = new ElixirTokenType("&");
  IElementType CATCH = new ElixirTokenType("catch");
  IElementType CHAR_TOKENIZER = new ElixirTokenType("?");
  IElementType CLOSING_BIT = new ElixirTokenType(">>");
  IElementType CLOSING_BRACKET = new ElixirTokenType("]");
  IElementType CLOSING_CURLY = new ElixirTokenType("}");
  IElementType CLOSING_PARENTHESIS = new ElixirTokenType(")");
  IElementType COLON = new ElixirTokenType(":");
  IElementType COMMA = new ElixirTokenType(",");
  IElementType COMMENT = new ElixirTokenType("#");
  IElementType COMPARISON_OPERATOR = new ElixirTokenType("!==, ===, !=, ==, =~");
  IElementType DECIMAL_MARK = new ElixirTokenType("Decimal Mark (.)");
  IElementType DIVISION_OPERATOR = new ElixirTokenType("/");
  IElementType DO = new ElixirTokenType("do");
  IElementType DOT_OPERATOR = new ElixirTokenType(".");
  IElementType EEX_CLOSING = new ElixirTokenType("%>");
  IElementType EEX_COMMENT = new ElixirTokenType("EEx Comment");
  IElementType EEX_COMMENT_MARKER = new ElixirTokenType("EEx Comment Marker (#)");
  IElementType EEX_DATA = new ElixirTokenType("EEx Data");
  IElementType EEX_EMPTY_MARKER = new ElixirTokenType("EEx Empty Marker");
  IElementType EEX_EQUALS_MARKER = new ElixirTokenType("EEx Equals Marker (=)");
  IElementType EEX_ESCAPED_OPENING = new ElixirTokenType("<%%");
  IElementType EEX_FORWARD_SLASH_MARKER = new ElixirTokenType("EEx Forward Slash Marker (/)");
  IElementType EEX_OPENING = new ElixirTokenType("<%");
  IElementType EEX_PIPE_MARKER = new ElixirTokenType("EEx Pipe Marker (|)");
  IElementType ELSE = new ElixirTokenType("else");
  IElementType END = new ElixirTokenType("end");
  IElementType EOL = new ElixirTokenType("\\\\n, \\\\r\\\\n");
  IElementType ESCAPE = new ElixirTokenType("\\\\");
  IElementType ESCAPED_CHARACTER_TOKEN = new ElixirTokenType("\\\\<character>, \\\\x{<hexadecimal-digit>}, \\\\x<hexadecimal-digit>, \\\\\\\\n, \\\\\\\\r\\\\n");
  IElementType EXPONENT_MARK = new ElixirTokenType("E, e");
  IElementType FALSE = new ElixirTokenType("false");
  IElementType FN = new ElixirTokenType("fn");
  IElementType FRAGMENT = new ElixirTokenType("Fragment");
  IElementType HEREDOC_LINE_WHITE_SPACE_TOKEN = new ElixirTokenType("Whitespace at beginning of line of heredoc");
  IElementType HEREDOC_PREFIX_WHITE_SPACE = new ElixirTokenType("Whitespace at beginning of last line of heredoc before terminator");
  IElementType HEREDOC_PROMOTER = new ElixirTokenType("Heredoc Promoter (\"\"\", ''')");
  IElementType HEREDOC_TERMINATOR = new ElixirTokenType("Heredoc Terminator (\"\"\", ''')");
  IElementType HEXADECIMAL_WHOLE_NUMBER_BASE = new ElixirTokenType("x");
  IElementType IDENTIFIER_TOKEN = new ElixirTokenType("identifier");
  IElementType INTERPOLATING_SIGIL_NAME = new ElixirTokenType("a-z");
  IElementType INTERPOLATION_END = new ElixirTokenType("Interpolation End (})");
  IElementType INTERPOLATION_START = new ElixirTokenType("Interpolation Start (#{)");
  IElementType INVALID_BINARY_DIGITS = new ElixirTokenType("A-Z, a-z, 2-9");
  IElementType INVALID_DECIMAL_DIGITS = new ElixirTokenType("A-Z, a-z");
  IElementType INVALID_HEXADECIMAL_DIGITS = new ElixirTokenType("G-Z, g-z");
  IElementType INVALID_OCTAL_DIGITS = new ElixirTokenType("A-Z, a-z, 8-9");
  IElementType INVALID_UNKNOWN_BASE_DIGITS = new ElixirTokenType("A-Z, a-z, 0-9");
  IElementType IN_MATCH_OPERATOR = new ElixirTokenType("<-, \\\\\\\\");
  IElementType IN_OPERATOR = new ElixirTokenType("in");
  IElementType KEYWORD_PAIR_COLON = new ElixirTokenType("Keyword Pair Colon (:)");
  IElementType LINE_PROMOTER = new ElixirTokenType("{, [, <, \", /, (, |, '");
  IElementType LINE_TERMINATOR = new ElixirTokenType("}, ], >, \", /, ), |, '");
  IElementType LITERAL_SIGIL_NAME = new ElixirTokenType("A-Z");
  IElementType MAP_OPERATOR = new ElixirTokenType("%{}");
  IElementType MATCH_OPERATOR = new ElixirTokenType("=");
  IElementType MINUS_OPERATOR = new ElixirTokenType("MINUS_OPERATOR");
  IElementType MULTIPLICATION_OPERATOR = new ElixirTokenType("*");
  IElementType NEGATE_OPERATOR = new ElixirTokenType("NEGATE_OPERATOR");
  IElementType NIL = new ElixirTokenType("nil");
  IElementType NOT_OPERATOR = new ElixirTokenType("not");
  IElementType NUMBER_OR_BADARITH_OPERATOR = new ElixirTokenType("NUMBER_OR_BADARITH_OPERATOR");
  IElementType NUMBER_SEPARATOR = new ElixirTokenType("_");
  IElementType OBSOLETE_BINARY_WHOLE_NUMBER_BASE = new ElixirTokenType("B");
  IElementType OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE = new ElixirTokenType("X");
  IElementType OCTAL_WHOLE_NUMBER_BASE = new ElixirTokenType("o");
  IElementType OPENING_BIT = new ElixirTokenType("<<");
  IElementType OPENING_BRACKET = new ElixirTokenType("[");
  IElementType OPENING_CURLY = new ElixirTokenType("{");
  IElementType OPENING_PARENTHESIS = new ElixirTokenType("(");
  IElementType OR_SYMBOL_OPERATOR = new ElixirTokenType("|||, ||");
  IElementType OR_WORD_OPERATOR = new ElixirTokenType("`or`");
  IElementType PIPE_OPERATOR = new ElixirTokenType("|");
  IElementType PLUS_OPERATOR = new ElixirTokenType("+");
  IElementType POWER_OPERATOR = new ElixirTokenType("**");
  IElementType RANGE_OPERATOR = new ElixirTokenType("..");
  IElementType RELATIONAL_OPERATOR = new ElixirTokenType("<, <=, >=, >");
  IElementType RESCUE = new ElixirTokenType("rescue");
  IElementType SEMICOLON = new ElixirTokenType(";");
  IElementType SIGIL_MODIFIER = new ElixirTokenType("Sigil Modifier (A-Z, a-z)");
  IElementType SIGN_OPERATOR = new ElixirTokenType("Sign Operator (+, -)");
  IElementType STAB_OPERATOR = new ElixirTokenType("->");
  IElementType STRUCT_OPERATOR = new ElixirTokenType("%");
  IElementType SUBTRACTION_OPERATOR = new ElixirTokenType("-");
  IElementType THREE_OPERATOR = new ElixirTokenType("^^^");
  IElementType TILDE = new ElixirTokenType("~");
  IElementType TRUE = new ElixirTokenType("true");
  IElementType TUPLE_OPERATOR = new ElixirTokenType("{}");
  IElementType TWO_OPERATOR = new ElixirTokenType("++, --, <>");
  IElementType TYPE_OPERATOR = new ElixirTokenType("::");
  IElementType UNARY_OPERATOR = new ElixirTokenType("~~~, !, ^");
  IElementType UNICODE_ESCAPE_CHARACTER = new ElixirTokenType("u");
  IElementType UNKNOWN_WHOLE_NUMBER_BASE = new ElixirTokenType("A-Z, a, c-n, p-w, z");
  IElementType VALID_BINARY_DIGITS = new ElixirTokenType("0-1");
  IElementType VALID_DECIMAL_DIGITS = new ElixirTokenType("0-9");
  IElementType VALID_HEXADECIMAL_DIGITS = new ElixirTokenType("A-F, a-f, 0-9");
  IElementType VALID_OCTAL_DIGITS = new ElixirTokenType("0-7");
  IElementType WHEN_OPERATOR = new ElixirTokenType("when");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESS_EXPRESSION) {
        return new ElixirAccessExpressionImpl(node);
      }
      else if (type == ADDITION_INFIX_OPERATOR) {
        return new ElixirAdditionInfixOperatorImpl(node);
      }
      else if (type == ALIAS) {
        return new ElixirAliasImpl(node);
      }
      else if (type == AND_INFIX_OPERATOR) {
        return new ElixirAndInfixOperatorImpl(node);
      }
      else if (type == ANONYMOUS_FUNCTION) {
        return new ElixirAnonymousFunctionImpl(node);
      }
      else if (type == ARROW_INFIX_OPERATOR) {
        return new ElixirArrowInfixOperatorImpl(node);
      }
      else if (type == ASSOCIATIONS) {
        return new ElixirAssociationsImpl(node);
      }
      else if (type == ASSOCIATIONS_BASE) {
        return new ElixirAssociationsBaseImpl(node);
      }
      else if (type == ATOM) {
        return new ElixirAtomImpl(node);
      }
      else if (type == ATOM_KEYWORD) {
        return new ElixirAtomKeywordImpl(node);
      }
      else if (type == AT_IDENTIFIER) {
        return new ElixirAtIdentifierImpl(node);
      }
      else if (type == AT_PREFIX_OPERATOR) {
        return new ElixirAtPrefixOperatorImpl(node);
      }
      else if (type == BINARY_DIGITS) {
        return new ElixirBinaryDigitsImpl(node);
      }
      else if (type == BINARY_WHOLE_NUMBER) {
        return new ElixirBinaryWholeNumberImpl(node);
      }
      else if (type == BIT_STRING) {
        return new ElixirBitStringImpl(node);
      }
      else if (type == BLOCK_IDENTIFIER) {
        return new ElixirBlockIdentifierImpl(node);
      }
      else if (type == BLOCK_ITEM) {
        return new ElixirBlockItemImpl(node);
      }
      else if (type == BLOCK_LIST) {
        return new ElixirBlockListImpl(node);
      }
      else if (type == BRACKET_ARGUMENTS) {
        return new ElixirBracketArgumentsImpl(node);
      }
      else if (type == CAPTURE_NUMERIC_OPERATION) {
        return new ElixirCaptureNumericOperationImpl(node);
      }
      else if (type == CAPTURE_PREFIX_OPERATOR) {
        return new ElixirCapturePrefixOperatorImpl(node);
      }
      else if (type == CHAR_TOKEN) {
        return new ElixirCharTokenImpl(node);
      }
      else if (type == COMPARISON_INFIX_OPERATOR) {
        return new ElixirComparisonInfixOperatorImpl(node);
      }
      else if (type == CONTAINER_ASSOCIATION_OPERATION) {
        return new ElixirContainerAssociationOperationImpl(node);
      }
      else if (type == DECIMAL_DIGITS) {
        return new ElixirDecimalDigitsImpl(node);
      }
      else if (type == DECIMAL_FLOAT) {
        return new ElixirDecimalFloatImpl(node);
      }
      else if (type == DECIMAL_FLOAT_EXPONENT) {
        return new ElixirDecimalFloatExponentImpl(node);
      }
      else if (type == DECIMAL_FLOAT_EXPONENT_SIGN) {
        return new ElixirDecimalFloatExponentSignImpl(node);
      }
      else if (type == DECIMAL_FLOAT_FRACTIONAL) {
        return new ElixirDecimalFloatFractionalImpl(node);
      }
      else if (type == DECIMAL_FLOAT_INTEGRAL) {
        return new ElixirDecimalFloatIntegralImpl(node);
      }
      else if (type == DECIMAL_WHOLE_NUMBER) {
        return new ElixirDecimalWholeNumberImpl(node);
      }
      else if (type == DOT_INFIX_OPERATOR) {
        return new ElixirDotInfixOperatorImpl(node);
      }
      else if (type == DO_BLOCK) {
        return new ElixirDoBlockImpl(node);
      }
      else if (type == EEX) {
        return new ElixirEexImpl(node);
      }
      else if (type == EEX_TAG) {
        return new ElixirEexTagImpl(node);
      }
      else if (type == EMPTY_PARENTHESES) {
        return new ElixirEmptyParenthesesImpl(node);
      }
      else if (type == ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirEnclosedHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == END_OF_EXPRESSION) {
        return new ElixirEndOfExpressionImpl(node);
      }
      else if (type == ESCAPED_CHARACTER) {
        return new ElixirEscapedCharacterImpl(node);
      }
      else if (type == ESCAPED_EOL) {
        return new ElixirEscapedEOLImpl(node);
      }
      else if (type == ESCAPED_HEREDOC_TERMINATOR) {
        return new ElixirEscapedHeredocTerminatorImpl(node);
      }
      else if (type == ESCAPED_LINE_TERMINATOR) {
        return new ElixirEscapedLineTerminatorImpl(node);
      }
      else if (type == HEREDOC) {
        return new ElixirHeredocImpl(node);
      }
      else if (type == HEREDOC_LINE) {
        return new ElixirHeredocLineImpl(node);
      }
      else if (type == HEREDOC_LINE_BODY) {
        return new ElixirHeredocLineBodyImpl(node);
      }
      else if (type == HEREDOC_LINE_PREFIX) {
        return new ElixirHeredocLinePrefixImpl(node);
      }
      else if (type == HEREDOC_PREFIX) {
        return new ElixirHeredocPrefixImpl(node);
      }
      else if (type == HEXADECIMAL_DIGITS) {
        return new ElixirHexadecimalDigitsImpl(node);
      }
      else if (type == HEXADECIMAL_ESCAPE_PREFIX) {
        return new ElixirHexadecimalEscapePrefixImpl(node);
      }
      else if (type == HEXADECIMAL_WHOLE_NUMBER) {
        return new ElixirHexadecimalWholeNumberImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new ElixirIdentifierImpl(node);
      }
      else if (type == INTERPOLATED_HEREDOC_LINE) {
        return new ElixirInterpolatedHeredocLineImpl(node);
      }
      else if (type == INTERPOLATED_HEREDOC_LINE_BODY) {
        return new ElixirInterpolatedHeredocLineBodyImpl(node);
      }
      else if (type == INTERPOLATED_SIGIL_HEREDOC) {
        return new ElixirInterpolatedSigilHeredocImpl(node);
      }
      else if (type == INTERPOLATED_SIGIL_LINE) {
        return new ElixirInterpolatedSigilLineImpl(node);
      }
      else if (type == INTERPOLATED_SIGIL_LINE_BODY) {
        return new ElixirInterpolatedSigilLineBodyImpl(node);
      }
      else if (type == INTERPOLATION) {
        return new ElixirInterpolationImpl(node);
      }
      else if (type == IN_INFIX_OPERATOR) {
        return new ElixirInInfixOperatorImpl(node);
      }
      else if (type == IN_MATCH_INFIX_OPERATOR) {
        return new ElixirInMatchInfixOperatorImpl(node);
      }
      else if (type == KEYWORDS) {
        return new ElixirKeywordsImpl(node);
      }
      else if (type == KEYWORD_KEY) {
        return new ElixirKeywordKeyImpl(node);
      }
      else if (type == KEYWORD_PAIR) {
        return new ElixirKeywordPairImpl(node);
      }
      else if (type == LINE) {
        return new ElixirLineImpl(node);
      }
      else if (type == LINE_BODY) {
        return new ElixirLineBodyImpl(node);
      }
      else if (type == LIST) {
        return new ElixirListImpl(node);
      }
      else if (type == LITERAL_HEREDOC_LINE) {
        return new ElixirLiteralHeredocLineImpl(node);
      }
      else if (type == LITERAL_HEREDOC_LINE_BODY) {
        return new ElixirLiteralHeredocLineBodyImpl(node);
      }
      else if (type == LITERAL_SIGIL_HEREDOC) {
        return new ElixirLiteralSigilHeredocImpl(node);
      }
      else if (type == LITERAL_SIGIL_LINE) {
        return new ElixirLiteralSigilLineImpl(node);
      }
      else if (type == LITERAL_SIGIL_LINE_BODY) {
        return new ElixirLiteralSigilLineBodyImpl(node);
      }
      else if (type == MAP_ARGUMENTS) {
        return new ElixirMapArgumentsImpl(node);
      }
      else if (type == MAP_CONSTRUCTION_ARGUMENTS) {
        return new ElixirMapConstructionArgumentsImpl(node);
      }
      else if (type == MAP_OPERATION) {
        return new ElixirMapOperationImpl(node);
      }
      else if (type == MAP_PREFIX_OPERATOR) {
        return new ElixirMapPrefixOperatorImpl(node);
      }
      else if (type == MAP_UPDATE_ARGUMENTS) {
        return new ElixirMapUpdateArgumentsImpl(node);
      }
      else if (type == MATCHED_ADDITION_OPERATION) {
        return new ElixirMatchedAdditionOperationImpl(node);
      }
      else if (type == MATCHED_AND_OPERATION) {
        return new ElixirMatchedAndOperationImpl(node);
      }
      else if (type == MATCHED_ARROW_OPERATION) {
        return new ElixirMatchedArrowOperationImpl(node);
      }
      else if (type == MATCHED_AT_NUMERIC_BRACKET_OPERATION) {
        return new ElixirMatchedAtNumericBracketOperationImpl(node);
      }
      else if (type == MATCHED_AT_OPERATION) {
        return new ElixirMatchedAtOperationImpl(node);
      }
      else if (type == MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION) {
        return new ElixirMatchedAtUnqualifiedBracketOperationImpl(node);
      }
      else if (type == MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirMatchedAtUnqualifiedNoParenthesesCallImpl(node);
      }
      else if (type == MATCHED_BRACKET_OPERATION) {
        return new ElixirMatchedBracketOperationImpl(node);
      }
      else if (type == MATCHED_CAPTURE_NON_NUMERIC_OPERATION) {
        return new ElixirMatchedCaptureNonNumericOperationImpl(node);
      }
      else if (type == MATCHED_COMPARISON_OPERATION) {
        return new ElixirMatchedComparisonOperationImpl(node);
      }
      else if (type == MATCHED_DOT_CALL) {
        return new ElixirMatchedDotCallImpl(node);
      }
      else if (type == MATCHED_IN_MATCH_OPERATION) {
        return new ElixirMatchedInMatchOperationImpl(node);
      }
      else if (type == MATCHED_IN_OPERATION) {
        return new ElixirMatchedInOperationImpl(node);
      }
      else if (type == MATCHED_MATCH_OPERATION) {
        return new ElixirMatchedMatchOperationImpl(node);
      }
      else if (type == MATCHED_MULTIPLICATION_OPERATION) {
        return new ElixirMatchedMultiplicationOperationImpl(node);
      }
      else if (type == MATCHED_NOT_IN_OPERATION) {
        return new ElixirMatchedNotInOperationImpl(node);
      }
      else if (type == MATCHED_OR_OPERATION) {
        return new ElixirMatchedOrOperationImpl(node);
      }
      else if (type == MATCHED_PARENTHESES_ARGUMENTS) {
        return new ElixirMatchedParenthesesArgumentsImpl(node);
      }
      else if (type == MATCHED_PIPE_OPERATION) {
        return new ElixirMatchedPipeOperationImpl(node);
      }
      else if (type == MATCHED_POWER_OPERATION) {
        return new ElixirMatchedPowerOperationImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_ALIAS) {
        return new ElixirMatchedQualifiedAliasImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_BRACKET_OPERATION) {
        return new ElixirMatchedQualifiedBracketOperationImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_MULTIPLE_ALIASES) {
        return new ElixirMatchedQualifiedMultipleAliasesImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_NO_ARGUMENTS_CALL) {
        return new ElixirMatchedQualifiedNoArgumentsCallImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirMatchedQualifiedNoParenthesesCallImpl(node);
      }
      else if (type == MATCHED_QUALIFIED_PARENTHESES_CALL) {
        return new ElixirMatchedQualifiedParenthesesCallImpl(node);
      }
      else if (type == MATCHED_RELATIONAL_OPERATION) {
        return new ElixirMatchedRelationalOperationImpl(node);
      }
      else if (type == MATCHED_THREE_OPERATION) {
        return new ElixirMatchedThreeOperationImpl(node);
      }
      else if (type == MATCHED_TWO_OPERATION) {
        return new ElixirMatchedTwoOperationImpl(node);
      }
      else if (type == MATCHED_TYPE_OPERATION) {
        return new ElixirMatchedTypeOperationImpl(node);
      }
      else if (type == MATCHED_UNARY_OPERATION) {
        return new ElixirMatchedUnaryOperationImpl(node);
      }
      else if (type == MATCHED_UNQUALIFIED_BRACKET_OPERATION) {
        return new ElixirMatchedUnqualifiedBracketOperationImpl(node);
      }
      else if (type == MATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL) {
        return new ElixirMatchedUnqualifiedNoArgumentsCallImpl(node);
      }
      else if (type == MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirMatchedUnqualifiedNoParenthesesCallImpl(node);
      }
      else if (type == MATCHED_UNQUALIFIED_PARENTHESES_CALL) {
        return new ElixirMatchedUnqualifiedParenthesesCallImpl(node);
      }
      else if (type == MATCHED_WHEN_OPERATION) {
        return new ElixirMatchedWhenOperationImpl(node);
      }
      else if (type == MATCH_INFIX_OPERATOR) {
        return new ElixirMatchInfixOperatorImpl(node);
      }
      else if (type == MULTIPLE_ALIASES) {
        return new ElixirMultipleAliasesImpl(node);
      }
      else if (type == MULTIPLICATION_INFIX_OPERATOR) {
        return new ElixirMultiplicationInfixOperatorImpl(node);
      }
      else if (type == NOT_INFIX_OPERATOR) {
        return new ElixirNotInfixOperatorImpl(node);
      }
      else if (type == NO_PARENTHESES_ARGUMENTS) {
        return new ElixirNoParenthesesArgumentsImpl(node);
      }
      else if (type == NO_PARENTHESES_KEYWORDS) {
        return new ElixirNoParenthesesKeywordsImpl(node);
      }
      else if (type == NO_PARENTHESES_KEYWORD_PAIR) {
        return new ElixirNoParenthesesKeywordPairImpl(node);
      }
      else if (type == NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION) {
        return new ElixirNoParenthesesManyStrictNoParenthesesExpressionImpl(node);
      }
      else if (type == NO_PARENTHESES_ONE_ARGUMENT) {
        return new ElixirNoParenthesesOneArgumentImpl(node);
      }
      else if (type == NO_PARENTHESES_STRICT) {
        return new ElixirNoParenthesesStrictImpl(node);
      }
      else if (type == OCTAL_DIGITS) {
        return new ElixirOctalDigitsImpl(node);
      }
      else if (type == OCTAL_WHOLE_NUMBER) {
        return new ElixirOctalWholeNumberImpl(node);
      }
      else if (type == OPEN_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirOpenHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == OR_INFIX_OPERATOR) {
        return new ElixirOrInfixOperatorImpl(node);
      }
      else if (type == PARENTHESES_ARGUMENTS) {
        return new ElixirParenthesesArgumentsImpl(node);
      }
      else if (type == PARENTHETICAL_STAB) {
        return new ElixirParentheticalStabImpl(node);
      }
      else if (type == PIPE_INFIX_OPERATOR) {
        return new ElixirPipeInfixOperatorImpl(node);
      }
      else if (type == POWER_INFIX_OPERATOR) {
        return new ElixirPowerInfixOperatorImpl(node);
      }
      else if (type == QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirQuoteHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == RELATIONAL_INFIX_OPERATOR) {
        return new ElixirRelationalInfixOperatorImpl(node);
      }
      else if (type == RELATIVE_IDENTIFIER) {
        return new ElixirRelativeIdentifierImpl(node);
      }
      else if (type == SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE) {
        return new ElixirSigilHexadecimalEscapeSequenceImpl(node);
      }
      else if (type == SIGIL_MODIFIERS) {
        return new ElixirSigilModifiersImpl(node);
      }
      else if (type == STAB) {
        return new ElixirStabImpl(node);
      }
      else if (type == STAB_BODY) {
        return new ElixirStabBodyImpl(node);
      }
      else if (type == STAB_INFIX_OPERATOR) {
        return new ElixirStabInfixOperatorImpl(node);
      }
      else if (type == STAB_NO_PARENTHESES_SIGNATURE) {
        return new ElixirStabNoParenthesesSignatureImpl(node);
      }
      else if (type == STAB_OPERATION) {
        return new ElixirStabOperationImpl(node);
      }
      else if (type == STAB_PARENTHESES_SIGNATURE) {
        return new ElixirStabParenthesesSignatureImpl(node);
      }
      else if (type == STRUCT_OPERATION) {
        return new ElixirStructOperationImpl(node);
      }
      else if (type == THREE_INFIX_OPERATOR) {
        return new ElixirThreeInfixOperatorImpl(node);
      }
      else if (type == TUPLE) {
        return new ElixirTupleImpl(node);
      }
      else if (type == TWO_INFIX_OPERATOR) {
        return new ElixirTwoInfixOperatorImpl(node);
      }
      else if (type == TYPE_INFIX_OPERATOR) {
        return new ElixirTypeInfixOperatorImpl(node);
      }
      else if (type == UNARY_PREFIX_OPERATOR) {
        return new ElixirUnaryPrefixOperatorImpl(node);
      }
      else if (type == UNKNOWN_BASE_DIGITS) {
        return new ElixirUnknownBaseDigitsImpl(node);
      }
      else if (type == UNKNOWN_BASE_WHOLE_NUMBER) {
        return new ElixirUnknownBaseWholeNumberImpl(node);
      }
      else if (type == UNMATCHED_ADDITION_OPERATION) {
        return new ElixirUnmatchedAdditionOperationImpl(node);
      }
      else if (type == UNMATCHED_AND_OPERATION) {
        return new ElixirUnmatchedAndOperationImpl(node);
      }
      else if (type == UNMATCHED_ARROW_OPERATION) {
        return new ElixirUnmatchedArrowOperationImpl(node);
      }
      else if (type == UNMATCHED_AT_NUMERIC_BRACKET_OPERATION) {
        return new ElixirUnmatchedAtNumericBracketOperationImpl(node);
      }
      else if (type == UNMATCHED_AT_OPERATION) {
        return new ElixirUnmatchedAtOperationImpl(node);
      }
      else if (type == UNMATCHED_AT_UNQUALIFIED_BRACKET_OPERATION) {
        return new ElixirUnmatchedAtUnqualifiedBracketOperationImpl(node);
      }
      else if (type == UNMATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirUnmatchedAtUnqualifiedNoParenthesesCallImpl(node);
      }
      else if (type == UNMATCHED_BRACKET_OPERATION) {
        return new ElixirUnmatchedBracketOperationImpl(node);
      }
      else if (type == UNMATCHED_CAPTURE_NON_NUMERIC_OPERATION) {
        return new ElixirUnmatchedCaptureNonNumericOperationImpl(node);
      }
      else if (type == UNMATCHED_COMPARISON_OPERATION) {
        return new ElixirUnmatchedComparisonOperationImpl(node);
      }
      else if (type == UNMATCHED_DOT_CALL) {
        return new ElixirUnmatchedDotCallImpl(node);
      }
      else if (type == UNMATCHED_IN_MATCH_OPERATION) {
        return new ElixirUnmatchedInMatchOperationImpl(node);
      }
      else if (type == UNMATCHED_IN_OPERATION) {
        return new ElixirUnmatchedInOperationImpl(node);
      }
      else if (type == UNMATCHED_MATCH_OPERATION) {
        return new ElixirUnmatchedMatchOperationImpl(node);
      }
      else if (type == UNMATCHED_MULTIPLICATION_OPERATION) {
        return new ElixirUnmatchedMultiplicationOperationImpl(node);
      }
      else if (type == UNMATCHED_NOT_IN_OPERATION) {
        return new ElixirUnmatchedNotInOperationImpl(node);
      }
      else if (type == UNMATCHED_OR_OPERATION) {
        return new ElixirUnmatchedOrOperationImpl(node);
      }
      else if (type == UNMATCHED_PIPE_OPERATION) {
        return new ElixirUnmatchedPipeOperationImpl(node);
      }
      else if (type == UNMATCHED_POWER_OPERATION) {
        return new ElixirUnmatchedPowerOperationImpl(node);
      }
      else if (type == UNMATCHED_QUALIFIED_ALIAS) {
        return new ElixirUnmatchedQualifiedAliasImpl(node);
      }
      else if (type == UNMATCHED_QUALIFIED_BRACKET_OPERATION) {
        return new ElixirUnmatchedQualifiedBracketOperationImpl(node);
      }
      else if (type == UNMATCHED_QUALIFIED_MULTIPLE_ALIASES) {
        return new ElixirUnmatchedQualifiedMultipleAliasesImpl(node);
      }
      else if (type == UNMATCHED_QUALIFIED_NO_ARGUMENTS_CALL) {
        return new ElixirUnmatchedQualifiedNoArgumentsCallImpl(node);
      }
      else if (type == UNMATCHED_QUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirUnmatchedQualifiedNoParenthesesCallImpl(node);
      }
      else if (type == UNMATCHED_QUALIFIED_PARENTHESES_CALL) {
        return new ElixirUnmatchedQualifiedParenthesesCallImpl(node);
      }
      else if (type == UNMATCHED_RELATIONAL_OPERATION) {
        return new ElixirUnmatchedRelationalOperationImpl(node);
      }
      else if (type == UNMATCHED_THREE_OPERATION) {
        return new ElixirUnmatchedThreeOperationImpl(node);
      }
      else if (type == UNMATCHED_TWO_OPERATION) {
        return new ElixirUnmatchedTwoOperationImpl(node);
      }
      else if (type == UNMATCHED_TYPE_OPERATION) {
        return new ElixirUnmatchedTypeOperationImpl(node);
      }
      else if (type == UNMATCHED_UNARY_OPERATION) {
        return new ElixirUnmatchedUnaryOperationImpl(node);
      }
      else if (type == UNMATCHED_UNQUALIFIED_BRACKET_OPERATION) {
        return new ElixirUnmatchedUnqualifiedBracketOperationImpl(node);
      }
      else if (type == UNMATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL) {
        return new ElixirUnmatchedUnqualifiedNoArgumentsCallImpl(node);
      }
      else if (type == UNMATCHED_UNQUALIFIED_NO_PARENTHESES_CALL) {
        return new ElixirUnmatchedUnqualifiedNoParenthesesCallImpl(node);
      }
      else if (type == UNMATCHED_UNQUALIFIED_PARENTHESES_CALL) {
        return new ElixirUnmatchedUnqualifiedParenthesesCallImpl(node);
      }
      else if (type == UNMATCHED_WHEN_OPERATION) {
        return new ElixirUnmatchedWhenOperationImpl(node);
      }
      else if (type == UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL) {
        return new ElixirUnqualifiedNoParenthesesManyArgumentsCallImpl(node);
      }
      else if (type == VARIABLE) {
        return new ElixirVariableImpl(node);
      }
      else if (type == WHEN_INFIX_OPERATOR) {
        return new ElixirWhenInfixOperatorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

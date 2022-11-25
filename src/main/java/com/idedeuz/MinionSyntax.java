package com.idedeuz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class MinionSyntax {
    public static final String[] KEYWORDS = new String[]{
            "papoi","banana","papoi","poopaye"
    };
    public static final String[] CICLOS = new String[]{
            "hana","sae","chasy"
    };

    public static final String[] TIPOS = new String[]{
            "dul"
    };

    public static final String[] TRUEFALSE = new String[]{
            "True","False"
    };

    public static final List<String> KEYWORDS_lIST = new ArrayList<>();
    public static final HashMap<String,String> CLASSES_LIST = new HashMap<>();

    private static final String CICLOS_PATTERN = "\\b(" + String.join("|", CICLOS) + ")\\b";

    private static final String TIPOS_PATTERN = "\\b(" + String.join("|", TIPOS) + ")\\b";

    private static final String TRUEFALSE_PATTERN = "\\b(" + String.join("|", TRUEFALSE) + ")\\b";
    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private static final String PAREN_PATTERN = "\\(|\\)";
    private static final String BRACE_PATTERN = "\\{|\\}";
    private static final String SEMICOLON_PATTERN = "\\;";
    private static final String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"";
    private static final String COMMENT_PATTERN = "//[^\n]*" + "|" + "/\\*(.|\\R)*?\\*/";
    private static final String OPERATION_PATTERN = ":|==|>|<|!=|>=|<=|->|=|>|<|%|-|-=|%=|\\+|\\-|\\-=|\\+=|\\^|\\&|\\|::|\\?|\\*";
    private static final String NUMBERS_PATTERN = "[0-9]+";


    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<TIPOS>" + TIPOS_PATTERN + ")"
                    + "|(?<CICLOS>" + CICLOS_PATTERN + ")"
                    + "|(?<TRUEFALSE>" + TRUEFALSE_PATTERN + ")"
                    + "|(?<PAREN>" + PAREN_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<SEMICOLON>" + SEMICOLON_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
                    + "|(?<OPERATION>" + OPERATION_PATTERN + ")"
                    + "|(?<NUMBER>" + NUMBERS_PATTERN + ")"
    );
}

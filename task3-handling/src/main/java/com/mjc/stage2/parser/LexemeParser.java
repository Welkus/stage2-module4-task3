package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

import java.util.ArrayList;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {

        String[] wordsList = string.split(LEXEME_REGEX);
        for(String word : wordsList){
            AbstractTextComponent lexemComp = new TextComponent(TextComponentType.WORD);
            nextParser.parse(lexemComp,word);
            abstractTextComponent.add(lexemComp);

        }
    }

}

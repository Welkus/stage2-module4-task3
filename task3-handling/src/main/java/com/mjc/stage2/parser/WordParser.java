package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser{
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {

        for(char c : string.toCharArray()){
            AbstractTextComponent leaf = new SymbolLeaf(TextComponentType.SYMBOL,c);
            abstractTextComponent.add(leaf);
        }

    }



}
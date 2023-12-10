package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        if(!parsers.isEmpty()){
            AbstractTextParser parserer = parsers.get(parsers.size()-1);
            parserer.setNextParser(parserer);
        }
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        return parsers.isEmpty() ? null : parsers.get(0);
    }
}

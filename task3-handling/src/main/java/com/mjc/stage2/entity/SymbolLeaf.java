package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent{

    private char value;

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    public SymbolLeaf(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {

    }

    @Override
    public int getSize() {
        return 1;
    }

}
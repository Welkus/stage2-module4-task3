package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
StringBuilder sb = new StringBuilder();
    componentList.forEach(sb::append);
    if(componentType != TextComponentType.SYMBOL){
        sb.append(componentType.getDelimiter());
    }
    return sb.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
    componentList.add(textComponent);

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
    componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return componentList.stream().mapToInt(AbstractTextComponent::getSize).sum();
    }

}

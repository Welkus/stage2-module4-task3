package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;


    public TextComponent(TextComponentType componentType, List<AbstractTextComponent> componentList) {
        super(componentType);
        this.componentList = componentList;
    }

    @Override
    public String operation() {
        StringBuilder sb = new StringBuilder();

        componentList.forEach(t -> {
            sb.append(t.operation());
            if(t instanceof TextComponent && t.getComponentType() == TextComponentType.WORD) {
                sb.append(" ");
            }
        });

        return sb.toString().trim();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {

    }

    @Override
    public int getSize() {
        return 0;
    }

}

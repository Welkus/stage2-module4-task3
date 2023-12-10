package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {

        Rectangle rectangle = event.getSource();
        RectangleValues rv = RectangleWarehouse.getInstance().get(rectangle.getId());

        rv.setPerimeter(newPerimeter(rectangle));
        rv.setSquare(newSquare(rectangle));

    }

    private double newPerimeter(Rectangle rectangle){
    return (rectangle.getSideA()*2)+(rectangle.getSideB()*2);
    }

    private double newSquare(Rectangle rectangle){
    return rectangle.getSideA()* rectangle.getSideB();
    }

}

package com.mjc.stage2.entity;

import com.mjc.stage2.Observable;
import com.mjc.stage2.Observer;
import com.mjc.stage2.event.RectangleEvent;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Observable {
    @Getter
    private int id;
    @Getter
    private double sideA;
    @Getter
    private double sideB;

   List<Observer> observerList = new ArrayList<>();
    public Rectangle(int id, double sideA, double sideB) {
        this.id = id;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
        notifyObserver();
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        RectangleEvent event = new RectangleEvent(this);

        for(Observer o : observerList){
            o.handleEvent(event);
        }

    }

}

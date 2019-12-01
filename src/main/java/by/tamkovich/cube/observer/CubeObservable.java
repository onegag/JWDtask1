package by.tamkovich.cube.observer;

import by.tamkovich.cube.entity.CubeIterable;
import by.tamkovich.cube.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class CubeObservable extends CubeIterable implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();


    public CubeObservable(Point center, Double side, Long id) {
        super(center, side, id);
    }

    @Override
    public void setSide(double side) {
        super.setSide(side);
        notifyObservers();
    }


    @Override
    public void attach(Observer observer) {
        observers.add(observer);

    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

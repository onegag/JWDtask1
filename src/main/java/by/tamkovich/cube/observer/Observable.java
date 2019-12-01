package by.tamkovich.cube.observer;

import by.tamkovich.cube.entity.Cube;

public interface Observable<T extends Cube> {
    void attach(Observer observer);
}
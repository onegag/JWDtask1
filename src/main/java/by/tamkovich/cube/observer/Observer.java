package by.tamkovich.cube.observer;


import by.tamkovich.cube.service.CubeCalculator;

import java.util.HashMap;
import java.util.Map;

public class Observer {
    private final CubeCalculator cubeCalculator;
    private static Observer instance;

    private Map<Long, CubeParameters> cubeParametersMap = new HashMap<>();

    private Observer(CubeCalculator cubeCalculator) {
        this.cubeCalculator = cubeCalculator;
    }

    public static Observer getInstance(CubeCalculator cubeCalculator) {
        if (instance == null) {
            instance = new Observer(cubeCalculator);
        }
        return instance;
    }

    public void update(CubeObservable item) {
        double area = cubeCalculator.calculateSurfaceArea(item);
        double volume = cubeCalculator.calculateVolume(item);

        CubeParameters parameters = new CubeParameters(area, volume);

        cubeParametersMap.put(item.getId(), parameters);
    }

    public CubeParameters getParameters(Integer id) {
        return cubeParametersMap.get(id);
    }
}

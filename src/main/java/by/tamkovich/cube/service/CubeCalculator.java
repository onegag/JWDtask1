package by.tamkovich.cube.service;

import by.tamkovich.cube.entity.Cube;

public class CubeCalculator {
    private static final int CUBE_PLANE_COUNT = 6;

    public boolean isCube(Cube cube) {
        if (cube != null && cube.getCenter() != null && cube.getSide() != null && cube.getSide() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }

    public double calculateSurfaceArea(Cube cube) {
        return CUBE_PLANE_COUNT * Math.pow(cube.getSide(), 2);
    }

    public double volumesRatio(Cube cube, double secantPlaneHigh) {
        double cubeHighestPoint = cube.getCenter().getY() + cube.getSide() / 2;
        double cubeLowestPoint = cube.getCenter().getY() - cube.getSide() / 2;
        if (secantPlaneHigh > cubeLowestPoint &&
                secantPlaneHigh < cubeHighestPoint) {
          return   (cubeHighestPoint - secantPlaneHigh) / (secantPlaneHigh - cubeLowestPoint);
        }
        else return 0;
    }

    public boolean isOnAxis(Cube cube){
        return true;
    }
}

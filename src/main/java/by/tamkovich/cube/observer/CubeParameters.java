package by.tamkovich.cube.observer;

public class CubeParameters {
    private double SurfaceArea;
    private  double Volume;

    public CubeParameters(double surfaceArea, double volume) {
        SurfaceArea = surfaceArea;
        Volume = volume;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }

    public double getVolume() {
        return Volume;
    }


}

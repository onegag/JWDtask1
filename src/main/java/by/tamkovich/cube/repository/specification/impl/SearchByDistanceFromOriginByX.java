package by.tamkovich.cube.repository.specification.impl;

import by.tamkovich.cube.entity.CubeIterable;
import by.tamkovich.cube.repository.specification.CubeSpecification;
import by.tamkovich.cube.service.CubeCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchByDistanceFromOriginByX implements CubeSpecification {
    private static final Logger log = LogManager.getLogger(SearchByRangeOfVolume.class);
    private double minDistance   ;
    private double maxDistance;
    private CubeCalculator cubeCalculator = new CubeCalculator();

    public SearchByDistanceFromOriginByX(int minDistance, int maxDistance) {
        this.minDistance = minDistance;
        this.maxDistance = maxDistance;
    }

    @Override
    public boolean specified(CubeIterable cube) {
        double cubeNearPointX = cube.getCenter().getX()-1./2*cube.getSide() ;
        double cubeFarthestPointX = cube.getCenter().getX()+1./2*cube.getSide();

        if (cubeNearPointX >= minDistance && cubeFarthestPointX <= maxDistance) {
            log.info("Search by range of volume is done");
            return true;

        } else {
            log.info("Search by range of volume is not done");
            return false;
        }
    }
}

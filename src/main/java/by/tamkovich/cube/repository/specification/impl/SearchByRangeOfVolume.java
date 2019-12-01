package by.tamkovich.cube.repository.specification.impl;

import by.tamkovich.cube.entity.CubeIterable;
import by.tamkovich.cube.repository.specification.CubeSpecification;
import by.tamkovich.cube.service.CubeCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SearchByRangeOfVolume implements CubeSpecification {
    private static final Logger log = LogManager.getLogger(SearchByRangeOfVolume.class);
    private double minVolume;
    private double maxVolume;
    private CubeCalculator cubeCalculator = new CubeCalculator();

    public SearchByRangeOfVolume(double minVolume, double maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    @Override
    public boolean specified(CubeIterable object) {
        double cubeVolume = cubeCalculator.calculateVolume(object);

        if (cubeVolume >= minVolume && cubeVolume <= maxVolume) {
            log.info("Search by range of volume is done");
            return true;

        } else {
            log.info("Search by range of volume is not done");
            return false;
        }
    }
}

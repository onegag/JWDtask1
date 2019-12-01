package by.tamkovich.cube.repository.specification.impl;

import by.tamkovich.cube.entity.CubeIterable;
import by.tamkovich.cube.repository.specification.CubeSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchById implements CubeSpecification {
    private static final Logger log = LogManager.getLogger(SearchById.class);
    private long id;

    public SearchById(long id) {
        this.id = id;
    }

    @Override
    public boolean specified(CubeIterable cube) {
        if (id == cube.getId()) {
            log.info("Search by id is done");
            return true;
        } else {
            log.warn("Search by id is not done");
            return false;
        }
    }
}

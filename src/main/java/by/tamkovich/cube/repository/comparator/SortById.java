package by.tamkovich.cube.repository.comparator;

import by.tamkovich.cube.entity.Cube;
import by.tamkovich.cube.entity.CubeIterable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class SortById implements Comparator<CubeIterable> {

        private static final Logger log = LogManager.getLogger(SortById.class);
        public static final int LARGER = 1;
        public static final int LESS = -1;
        public static final int EQUALS = 0;

        @Override
        public int compare(CubeIterable o1, CubeIterable o2) {
            long firstId = o1.getId();
            long secondId = o2.getId();
            if (firstId < secondId) {
                log.info("Sort by id is done: first id < second id");
                return LESS;
            } else if (firstId > secondId) {
                log.info("Sort by id is done: first id > second id");
                return LARGER;
            } else {
                log.info("Sort by id is done: first id = second id");
                return EQUALS;
            }
        }
    }

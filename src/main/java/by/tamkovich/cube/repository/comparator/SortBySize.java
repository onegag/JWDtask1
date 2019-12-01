package by.tamkovich.cube.repository.comparator;

import by.tamkovich.cube.entity.Cube;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class SortBySize implements Comparator<Cube> {
    private static final Logger log = LogManager.getLogger(SortById.class);
    public static final int LARGER = 1;
    public static final int LESS = -1;
    public static final int EQUALS = 0;

    @Override
    public int compare(Cube o1, Cube o2) {
        Double firstSize = o1.getSide();
        Double secondSide = o2.getSide();
        if (firstSize < secondSide) {
            log.info("Sort by size is done: first size < second size");
            return LESS;
        } else if (firstSize > secondSide) {
            log.info("Sort by id is done: first size > second size");
            return LARGER;
        } else {
            log.info("Sort by id is done: first size = second size");
            return EQUALS;
        }
    }
}

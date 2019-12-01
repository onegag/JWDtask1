package by.tamkovich.cube.repository.specification;

import by.tamkovich.cube.entity.Cube;
import by.tamkovich.cube.entity.CubeIterable;

public interface CubeSpecification {

    boolean specified(CubeIterable cube);
}

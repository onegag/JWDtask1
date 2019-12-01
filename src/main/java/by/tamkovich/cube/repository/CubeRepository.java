package by.tamkovich.cube.repository;

import by.tamkovich.cube.entity.CubeIterable;
import by.tamkovich.cube.repository.specification.CubeSpecification;

import java.util.*;

public class CubeRepository {

    private Map<Long, CubeIterable> cubes = new HashMap<>();

    private Long idCounter = 0l;


    public void add( CubeIterable cube) {
        cube.setId(idCounter);
        cubes.put(idCounter, cube);
        idCounter++;
    }


    public void remove(CubeIterable cube) {
        cubes.remove(cube.getId());

    }

    public void update(CubeIterable cube) {
            cubes.replace(cube.getId(), cube);
        }



    public List<CubeIterable> query(CubeSpecification specification) {
        List<CubeIterable> cubesList = new ArrayList<>(cubes.values());
        List<CubeIterable> foundCubes = new ArrayList<>();
        for(CubeIterable cube : cubesList){
            if(specification.specified(cube)){
                foundCubes.add(cube);
            }
        }
        return foundCubes;

    }



    public List<CubeIterable> getSorted(Comparator cubeSortComparator) {
        List<CubeIterable> cubesList = new ArrayList<>(cubes.values());
        Collections.sort(cubesList, cubeSortComparator);
        return cubesList;
    }


}

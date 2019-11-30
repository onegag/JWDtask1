package by.tamkovich.cube.director;

import by.tamkovich.cube.creator.CubeCreator;
import by.tamkovich.cube.entity.Cube;
import by.tamkovich.cube.exception.WrongFilePathException;
import by.tamkovich.cube.reader.DataReader;
import by.tamkovich.cube.validator.DataValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Director {
    private DataReader dataReader;
    private CubeCreator cubeCreator;

    public Director(DataReader dataReader, DataValidator dataValidator) {
        this.dataReader = dataReader;
        this.cubeCreator = new CubeCreator(dataValidator);
    }

    public List<Cube> createList(String path) {
        List<String> stringLines;
        List<Cube> cubes = new ArrayList<>();
        Optional<Cube> cube;

        try {
            stringLines = dataReader.read(path);
        } catch (WrongFilePathException e) {
            return new ArrayList<>();
        }

        for (String s : stringLines) {
            cube = cubeCreator.create(s);
            if (cube.isPresent()) {
                cubes.add(cube.get());
            }
        }
        return cubes;


    }
}

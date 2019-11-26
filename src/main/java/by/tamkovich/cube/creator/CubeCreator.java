package by.tamkovich.cube.creator;

import by.tamkovich.cube.entity.Cube;
import by.tamkovich.cube.entity.Point;
import by.tamkovich.cube.parser.LineParser;
import by.tamkovich.cube.validator.DataValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CubeCreator {
    DataValidator dataValidator;
    LineParser lineParser;


    public CubeCreator (DataValidator dataValidator, LineParser lineParser){
        this.dataValidator = dataValidator;
        this.lineParser = lineParser;
    }

    public Optional<Cube> create(String line){
        List<Double> fields = new ArrayList<>();

        if (dataValidator.isValid(line)){
            fields = lineParser.parse(line);
            Optional<Point> point = Optional.ofNullable(new Point(fields.get(0),fields.get(1),fields.get(2)));
            return null;//Optional.ofNullable(new Cube(point, fields.get(3)));
        }
        else{
            return Optional.empty();
        }

    }

}

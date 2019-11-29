package by.tamkovich.cube.creator;

import by.tamkovich.cube.entity.Cube;
import by.tamkovich.cube.entity.Point;
import by.tamkovich.cube.validator.DataValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CubeCreator {
    DataValidator dataValidator;
    public static final String REGEX_DELIMITER = "\\s+";


    public CubeCreator (DataValidator dataValidator){
        this.dataValidator = dataValidator;

    }

    public Optional<Cube> create(String line){
        List<Double> fields = new ArrayList<>();
        List<String> stringFields = Arrays.asList(line.split(REGEX_DELIMITER));


            for (String s : stringFields) {
               try {
                   fields.add(Double.parseDouble(s.replace(",", ".")));
               }
               catch (NumberFormatException e){
                   return Optional.empty();
               }
            }
            if (dataValidator.isValid(fields)){
                Point point = new Point(fields.get(0),fields.get(1),fields.get(2));
                return Optional.of(new Cube(point,fields.get(3)));
            }
            else {
                return Optional.empty();
            }

        }

}

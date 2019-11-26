package by.tamkovich.cube.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CubeLineParser implements LineParser {
    public static final String REGEX_DELIMITER = "\\s+";
    List<Double> fields = new ArrayList<>();


    public List<Double> parse(String line) {
        List<String> stringFields = Arrays.asList(line.split(REGEX_DELIMITER));
        for (String s : stringFields) {

            fields.add(Double.parseDouble(s.replace(",", ".")));
        }
        return fields;
    }
}

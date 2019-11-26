package by.tamkovich.cube.validator;

import java.util.regex.Pattern;

public class CubeDataValidator implements DataValidator {
    final static Pattern CUBE_FORMAT_DATA = Pattern.compile("(\\d*[.,]\\d*\\s+){4}");
    @Override
    public boolean isValid(String line) {
       return CUBE_FORMAT_DATA.matcher(line).find();

    }
}

package by.tamkovich.cube.validator;

import java.util.List;

public class CubeDataValidator implements DataValidator<Double> {

    @Override
    public boolean isValid(List<Double> fields) {
        if (fields.size() == 4 && fields.get(3) > 0) {
            return true;
        } else {
            return false;
        }

    }

}

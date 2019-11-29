package by.tamkovich.cube.validator;

import java.util.List;
import java.util.regex.Pattern;

public class CubeDataValidator implements DataValidator <Double>{

    @Override
    public boolean isValid(List<Double> fields) {
        if(fields.size()==4 && fields.get(3)>0){
            return true;
        }
        else {
            return false;
        }

    }

}

package by.tamkovich.cube.validator;

import java.util.List;

public interface DataValidator < T extends Number>  {
    public boolean isValid(List <T> fields);
}

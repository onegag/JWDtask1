package by.tamkovich.cube.validator;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CubeDataValidatorTest {

    DataValidator cubeDataValidator = new CubeDataValidator();


    @Test
    public void testCubeDataValidatorShouldTrueWhenDataCorrect() {
        List<Double> validFieldsOne = Arrays.asList(23.4, 14.2, 1., 134.5);
        List<Double> validFieldsTwo = Arrays.asList(0., 0., 0., 0.1);
        assertTrue(cubeDataValidator.isValid(validFieldsOne));
        assertTrue(cubeDataValidator.isValid(validFieldsTwo));
    }

    @Test
    public void testCubeDataValidatorShouldTrueWhenDataIncorrect() {
        List<Double> invalidFieldsOne = Arrays.asList(0., 0., 0., 0.);
        List<Double> invalidFieldsTwo = Arrays.asList(0., 0., 0., 0.1, 1.);

        assertFalse(cubeDataValidator.isValid(invalidFieldsOne));
        assertFalse(cubeDataValidator.isValid(invalidFieldsTwo));
    }


}

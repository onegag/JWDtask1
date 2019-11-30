package by.tamkovich.cube.creator;

import by.tamkovich.cube.entity.Cube;
import by.tamkovich.cube.validator.CubeDataValidator;
import by.tamkovich.cube.validator.DataValidator;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CubeCreatorTest {

    DataValidator dataValidator = new CubeDataValidator();
    CubeCreator cubeCreator = new CubeCreator(dataValidator);

    @Test
    public void testCubeCreatorShouldCreateCubeWhenDataCorrect() {
        //given
        String line = "2 12.4 3. 4";
        //when
        Optional<Cube> cube = cubeCreator.create(line);
        //then
        assertTrue(cube.isPresent());
    }

    @Test
    public void testCubeCreatorShouldCreateCubeWhenDataIncorrect() {
        //given
        String line = "2 12.4 3. 4 5";
        //when
        Optional<Cube> cube = cubeCreator.create(line);
        //then
        assertFalse(cube.isPresent());

    }
}

package by.tamkovich.cube.reader;

import by.tamkovich.cube.exception.WrongFilePathException;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class DataReaderTest {
    DataReader dataReader = new DataReader();
    String [] lines = {"23,4 14,2 1 134,5" , "afdsafs safas safds", "32,1 33,4 44.6 4",  "4.6 4.7 55.7 44.0"};

    @Test
    public void testReaderShouldReadLinesWhenDataCorrect() throws WrongFilePathException {

        //Given:
        String path = "./src/test/resources/testdata.txt";
        List<String> expected = Arrays.asList(lines);

        // When:
        List<String> actual = null;

        actual = dataReader.read(path);
        //Then:
        assertEquals(expected, actual);

    }
    @Test(expected = WrongFilePathException.class)
    public void testReaderShouldThrowExceptionWhenDataIncorrect() throws WrongFilePathException {
        String path = "./src/test/resources/data.txt";
        dataReader.read(path);
    }


}

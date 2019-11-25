package by.tamkovich.cube.reader;

import by.tamkovich.cube.exception.WrongFilePathException;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;




public class DataReaderTest {
    DataReader dataReader = new DataReader();
    String [] lines = {"23,4 14,2 1 134,5" , "afdsafs safas safds", "32,1 33,4 44.6 4",  "4.6 4.7 55.7 44.0"};

    @Test
    public void testReaderShouldReadLinesWhenDataCorrect() {

        //Given:
        String path = "./src/test/resources/testdata.txt";
        List<String> expected =  Arrays.asList(lines);

       // When:
        List<String> actual = dataReader.read(path);

        //Then:
        assertEquals(expected,actual);
    }

    @Test
    @Disabled
    public void testReaderShouldEndedWithExceptionWhenDataIncorrect(){
        dataReader.read("");
    }
}

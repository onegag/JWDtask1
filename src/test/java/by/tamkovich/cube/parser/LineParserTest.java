package by.tamkovich.cube.parser;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineParserTest {
    LineParser lineParser = new LineParser();

    @Test
    public void testParserShouldParseLineWhenDataCorrect(){
        //given
        String  line = "23,4  14.2 1 134.5";
        List <Double> expected = new ArrayList<Double>();
        Collections.addAll(expected,23.4,14.2 ,1. ,134.5);

        //when
        List <Double> actual = lineParser.parse(line);

        //then
        assertEquals(expected,actual);
    }
}

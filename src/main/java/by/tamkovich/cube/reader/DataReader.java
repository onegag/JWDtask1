package by.tamkovich.cube.reader;

import by.tamkovich.cube.exception.WrongFilePathException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    public List<String> read(String path) throws WrongFilePathException {
        File file;
        List<String> lines = new ArrayList<>();

        if (!(path == null)) {
            file = new File(path);
        } else {
            throw new WrongFilePathException();
        }

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine().trim());
            }
            return lines;

        } catch (FileNotFoundException e) {
            throw new WrongFilePathException();
        }
    }
}

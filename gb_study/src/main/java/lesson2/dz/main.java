package lesson2.dz;

import lesson2.dz.ex.MyArrayDataException;
import lesson2.dz.ex.NuArraySizeException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class main {


    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"11", "22", "33", "44"},
                {"101", "202", "303", "404"},
                {"110", "220", "330", "hellWorld"}
        };

        try {
            System.out.println(checkArray(array, 4));
        } catch (NuArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


    }

    public static int checkArray(String[][] array, int size) throws NuArraySizeException, MyArrayDataException {


        if (array.length != size || array[0].length != size) {
            throw new NuArraySizeException();
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(++i, ++j);
                }

            }
        }
        return sum;

    }




}

package lesson3;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        int firstIntValue = 1;
        int secondIntValue = 2;
        int thirdIntValue = 3;
        int fourthIntValue = 4;
        int fifthIntValue = 5;


        List<Integer> listInt = new ArrayList<>();
        listInt.add(firstIntValue);
        listInt.add(secondIntValue);
        listInt.add(thirdIntValue);

        NumberBox<Integer> numberBox1 = new NumberBox<>(listInt);

        numberBox1.addIntegerNumber(fourthIntValue);
        numberBox1.addIntegerNumber(fifthIntValue);

        double firstDoubleValue = 1.0;
        double secondDoubleValue = 2.0;
        double thirdDoubleValue = 3.0;
        double fourthDoubleValue = 4.0;
        double fifthDoubleValue = 5.0;

        NumberBox<Double> numberBox2 = new NumberBox<>();

        numberBox2.addIntegerNumber(firstDoubleValue);
        numberBox2.addIntegerNumber(secondDoubleValue);
        numberBox2.addIntegerNumber(thirdDoubleValue);
        numberBox2.addIntegerNumber(fourthDoubleValue);
        numberBox2.addIntegerNumber(fifthDoubleValue);

        System.out.println(numberBox1.getListNumber());
        System.out.println(numberBox2.getListNumber());
        System.out.println("- - - - - - - - - - - - -");
        System.out.println(numberBox1.getAverageValue());
        System.out.println(numberBox2.getAverageValue());
        System.out.println("- - - - - - - - - - - - -");
        System.out.println(numberBox1.comparisonOfAverages(numberBox2));
        System.out.println("- - - - - - - - - - - - -");

        List<Integer> listInt2 = new ArrayList<>();
        listInt.add(6);
        listInt.add(7);
        listInt.add(8);

        NumberBox<Integer> numberBox3 = new NumberBox<>(listInt2);

        numberBox1.addBoxToBox(numberBox3);
       /*
        Будет ошибка ибо нельзя в Integer складывать Double
        numberBox1.addBoxToBox(numberBox2);
        */
        System.out.println(numberBox1.getListNumber());
        System.out.println(numberBox3.getListNumber());

    }


}

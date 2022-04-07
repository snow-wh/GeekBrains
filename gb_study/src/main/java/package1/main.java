package package1;

import package2.Animal;
import package2.Cat;

import java.util.Arrays;

public class main {


    public static void main(String[] args) {

//       Cat cat1 = new Cat("Русская голобая", "Смертокрыл", "male", 3);
//        Cat cat2 = new Cat("Русская голобая", "Смертокрыл", "male", 3);
        Cat cat3 = new Cat("Русская голобая", "Смертокрыл", "male", 3);

        main2.changeCat();

        Cat cat = Cat.getInstance("Русская голобая", "Алекстраза", "male", 3);


        //Использование паттерна синглтон Singleton
        System.out.println(cat);


        cat.setColor("asdasd","asdas","asdasd","asda");
        System.out.println(cat3);
        System.out.println( Cat.getInstance("Русская голобая", "Алекстраза", "male", 3));




       // Cat cat4 = cat1;
//       Cat cat2 = new Cat("Смертокрыл", "male", 3);
//
//       Animal cat3 = new Cat("Смертокрыл", "male", 3);


//        System.out.println(cat1.equals(cat2));
//        System.out.println(cat2.equals(cat1));
//        System.out.println(cat2.equals(cat3));
//        System.out.println(cat1.equals(cat3));



//        System.out.println(cat1);
//
//
//
//       cat1.allInfo("Серый");
//
//        cat1.allInfo();
//        cat1.voice();


    }


}

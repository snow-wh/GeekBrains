package lesson1.package2;

import java.util.Objects;

public class Cat extends Animal implements Move, Eat {

    private String poroda;
    private String voice = "мяу";
    private String color;
    private String[] colors;

    private static Cat INSTANCE;

    public static Cat getInstance(String poroda, String name, String sex, int age) {
        if (INSTANCE == null) {
            INSTANCE = new Cat(poroda, name, sex, age);
        }
        return INSTANCE;
    }

    public Cat(String poroda, String name, String sex, int age) {
        super(name, sex, age);
        this.poroda = poroda;
    }

    public Cat(String name, String sex, int age) {
        super(name, sex, age);

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setColor(String ... colors){
        this.colors = colors;
    }

    public void allInfo() {
        System.out.println("Порода " + poroda + " Имя " + super.name + " Пол " + super.sex + " Возраст " + super.age + " Цвет " + color);
    }

    public void allInfo(String color) {
        System.out.println("Порода " + poroda + " Имя " + super.name + " Пол " + super.sex + " Возраст " + super.age + " Цвет " + color);
    }

    @Override
    public void voice() {
        System.out.println(voice);
    }

    @Override
    public void move() {
        System.out.println("прыгать бегать");
    }

    @Override
    public void eat() {
        System.out.println("Котик поел");
    }

    @Override
    public String toString() {
        return "Порода " + poroda + " Имя " + super.name + " Пол " + super.sex + " Возраст " + super.age + " Цвет " + color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cat another = (Cat) o;
        return (this.age == another.age) && (this.name.equals(another.name)) && (this.sex.equals(another.sex) && this.hashCode() == another.hashCode());

    }

    @Override
    public int hashCode() {
        //  return ((Integer)this.age) + this.name.hashCode()+this.sex.hashCode();
        return Objects.hash(age, name, sex);
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        Cat another = (Cat) o;
//        if (this.age == another.age) {
//            if (this.name.equals(another.name)) {
//                if (this.sex.equals(another.sex)){
//                    return true;
//                }else {
//                    System.out.println(this.name + " не равен " + another.name);
//                    return false;
//                }
//            } else {
//                System.out.println(this.name + " не равен " + another.name);
//                return false;
//            }
//        } else {
//            System.out.println(this.age + " не равен "  + another.age);
//            return false;
//        }
//
//    }


//    public void setName(String name){
//        if(name.length()==2)
//            this.name = name;
//        else
//            System.out.println("Длина слова не равна двум");
//    }
//
//    public String getName(){
//        return name;
//    }


}

package lesson1.package2;

public abstract class Animal {

    protected String name;
    protected String sex;
    protected int age;

    public Animal(String name, String sex, int age){
        this.name = name;

     //   this.sex = checkSex(sex); // есди бы пол быд будевым значением (boolean sex)

        this.sex = sex;
        this.age = age;

    }

//    private String checkSex (boolean sex){
//        if(sex){
//            return "Male";
//        }else {
//            return "Female";
//        }
//    }

    public abstract void voice();


}


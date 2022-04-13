package lesson2;

public class People {

    private String name;
    private int age;
    private String position;
    private int stamina;

    public People(String name, int age, String position, int stamina) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

}

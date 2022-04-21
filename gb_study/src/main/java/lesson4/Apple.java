package lesson4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Apple implements Comparable{

    private int cost;
    private String name;

    public int getCost() {
        return cost;
    }

    Apple(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {

        Apple anotherApple = (Apple)o;

        return this.cost - anotherApple.cost;
    }


    @Override
    public String toString(){
        return name;
    }
}

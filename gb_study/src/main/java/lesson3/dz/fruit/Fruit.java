package lesson3.dz.fruit;

public abstract class Fruit {

    protected double weight;

    @Override
    public String toString(){
        return Double.toString(weight);
    }

}

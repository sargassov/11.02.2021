package lesson1.task3package;
import lesson1.task3package.fruits.Apple;
import lesson1.task3package.fruits.Fruit;
import lesson1.task3package.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {
    private ArrayList<T> fruits;
    private double weight;

    public Box(){
        fruits = new ArrayList<>();
    }

    public Box(T... someFriut){
        fruits = new ArrayList(Arrays.asList(someFriut));
    }

    public double getWeight() {
        if(fruits.size() != 0)
            return fruits.get(0).getWeight() * fruits.size();
        else
            return 0.0;
    }

    public boolean compare(Box<?> otherBox){
        return this.getWeight() == otherBox.getWeight();
    }

    public void add(T someFruit){
        fruits.add(someFruit);
    }

    public void add(T... someFruit){
        fruits.addAll(Arrays.asList(someFruit));
    }

    public void replaceFruit(Box<T> anotherBox){
        if(this == anotherBox) return;
        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Apple> appleBox2 = new Box<>(new Apple());

        appleBox2.replaceFruit(appleBox);
        Orange[] oranges = new Orange[10];
        orangeBox.add(oranges);

    }
}

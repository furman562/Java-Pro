package Homework3;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void information() {
        System.out.println("Я пес " + name);
    }

    @Override
    protected String getRunResult(int obstacleLength) {
        int maxRunDistance = 500;
        return "пробігла " + Math.min(maxRunDistance, obstacleLength) + "m";
    }

    @Override
    protected String getSwimResult(int obstacleLength) {
        int maxSwimDistance = 10;
        return "пропливла " + Math.min(maxSwimDistance, obstacleLength) + "m";
    }

    public static void main(String[] args) {
        Dog firstDog = new Dog("Whiskey ");
        firstDog.information();
        firstDog.run(600);
        firstDog.swim(10);
    }


}

package Homework3;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void information() {
        System.out.println("Кішка " + name);
    }

    @Override
    protected String getRunResult(int obstacleLength) {
        int maxRunDistance = 200;
        if (obstacleLength > maxRunDistance) {
            System.out.println("УВАГА - Обмеження на дію біг, максимальне допустиме значення - 200 м, внесені дані " + obstacleLength + " m");
        }
        return Math.min(maxRunDistance, obstacleLength) + " m";
    }

    @Override
    protected String getSwimResult(int obstacleLength) {
        return "не плаває ";
    }

    public static void main(String[] args) {
        Cat firstCat = new Cat("Nirvana");
        firstCat.information();
        firstCat.run(210);
        firstCat.swim(5);
    }
}

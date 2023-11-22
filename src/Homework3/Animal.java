package Homework3;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    protected String getRunResult(int obstacleLength) {
        return "не біжить ";
    }

    protected String getSwimResult(int obstacleLength) {
        return "не плаває";
    }

    public void run(int obstacleLength) {
        System.out.println("Тварина пробігла " + getRunResult(obstacleLength));
    }

    public void swim(int obstacleLength) {
        System.out.println("Тварина  " + getSwimResult(obstacleLength));
    }

}



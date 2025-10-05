package one.terenin.oop.classes;

public class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("The car is driving \n" + "Model: " + model + "\n" + "Year: " + year);
    }
}

package one.terenin.oop;

import one.terenin.oop.classes.Car;
import one.terenin.oop.classes.Person;
import one.terenin.oop.classes.Shape;
import one.terenin.oop.classes.child.Circle;
import one.terenin.oop.classes.child.Dog;
import one.terenin.oop.classes.child.Square;
import one.terenin.oop.classes.parent.Animal;

public class L3 {

    public static void main(String[] args) {
        Car myCar = new Car("MyModel", 1986);
        myCar.drive();

        Person person1 = new Person("MyPerson", 1986);
        person1.getAge();
        person1.getName();

        Animal myAnimal = new Dog("region", "name");

        myAnimal.move();

        Dog dog = new Dog("Africa", "Buddy");

        dog.info();
        dog.move();
        dog.movingSound();

        Shape circle = new Circle(2.58d);
        System.out.println(circle.area());
        Shape square = new Square(9);
        System.out.println(square.area());
    }

}

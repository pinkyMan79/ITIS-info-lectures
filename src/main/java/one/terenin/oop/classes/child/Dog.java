package one.terenin.oop.classes.child;

import one.terenin.oop.classes.parent.Animal;

public class Dog extends Animal {

    public Dog(String livingRegion, String name) {
        super(10);
        this.liveRegion = livingRegion;
        this.name = name;
    }

    public void info() {
        System.out.println("Living region: " + this.liveRegion + ", name: " + this.name + ", age:" + this.getAge());
    }

    @Override
    public void move() {
        System.out.println("Dog move");
    }

    @Override
    public void movingSound() {
        System.out.println("dog sound");
    }
}

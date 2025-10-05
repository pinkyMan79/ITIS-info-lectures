package one.terenin.oop.classes.parent;

abstract public class Animal {

    private int age;
    public String name;
    protected String liveRegion;

    public Animal(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Animal is moving");
    }

    abstract public void movingSound();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

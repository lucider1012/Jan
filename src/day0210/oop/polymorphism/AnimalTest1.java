package day0210.oop.polymorphism;

public class AnimalTest1 {
    public void moveAnimal(Animal a){
        a.move();
    }
    public static void main(String[] args) {
        AnimalTest1 at1 = new AnimalTest1();
        at1.moveAnimal(new Human());
        at1.moveAnimal(new Tiger());
        at1.moveAnimal(new Eagle());
    }
}

package day0213.ncs.Test1;
public class Example {
    public static void main(String[] args) {
        Student s1 = new Student("jerry", 1, 10000);
        Student s2 = new Student("tom", 2, 15000);
        Bus b1 = new Bus(100, 1000);
        Bus b2 = new Bus(200, 2000);
        Subway sub = new Subway("2", 1250);
        s1.takeSubway(sub);
        s1.takeBus(b1);
        s2.takeBus(b2);
        s1.showMoney();
        s2.showMoney();
    }
}


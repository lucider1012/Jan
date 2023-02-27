package day0213.ncs.Test2;

public class CustomerMain {
    public static void main(String[] args) {
        Customer b = new Customer(10000,0);
        Noodle nd = new Noodle();
        Rice rc = new Rice();
        b.order(nd);
        b.order(rc);
        b.M();
    }
}

package day0213.ncs.Test1;
class Student {
    String name;
    int grade, money;
    public Student(String name, int grade, int money) {
        this.name = name;
        this.grade = grade;
        this.money = money;
    }
    public void takeBus(Bus b) {
        b.take();
        money -= b.charge;
        System.out.println(name + "이 " + b.busNumber + "번 버스에 탑승");
        b.showInfo();
    }
    public void takeSubway(Subway s) {
        s.take();
        money -= s.charge;
        System.out.println(name + "이 " + s.lineNumber + "호선 지하철 탑승");
        s.showInfo();
    }
    public void showMoney() {
        System.out.println(name + "의 용돈이 " + money + "만큼 남았습니다.");
    }
}
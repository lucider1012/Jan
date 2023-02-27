package day0213.ncs.Test1;
class Bus {
    int busNumber;
    int charge, income, count;
    public Bus(int busNumber, int charge) {
        this.busNumber = busNumber;
        this.charge = charge;
    }
    public void take() {
        count++;
        income += charge;
        //System.out.println("버스에 승객이 탑승");
    }
    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객수: " + count + ", 총 수입은: " + income);
    }
}
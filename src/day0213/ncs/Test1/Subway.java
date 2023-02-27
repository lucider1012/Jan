package day0213.ncs.Test1;
class Subway {
    String lineNumber;
    int count, income, charge;
    public Subway(String lineNumber, int charge) {
        this.lineNumber = lineNumber;
        this.charge = charge;
    }
    public void take() {
        count++;
        income += charge;
        //System.out.println("지하철에 승객이 탑승");
    }
    public void showInfo() {
        System.out.println(lineNumber+"호선의 승객수: " + count + ", 총 수입은: " + income);
    }
}

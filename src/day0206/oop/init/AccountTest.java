package day0206.oop.init;
class Account{
    private String account;//변수 생성
    private int balance;//변수 생성
    private double interestRate;//변수 생성
    public Account() {//기본 생성자
    }
    public Account(String account, int balance, double interestRate) {//3개 변수 받는 생성자.
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate/100;
    }
    public void setAccount(String account) {//계좌정보 셋팅용 생성자
        this.account = account;
    }
    public String getAccount() {//계좌정보 리턴용 생성자
        return account;
    }
    public int getBalance() {
        return balance;
    }
    public double calculateInterest(){
        return balance*interestRate;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money){
        balance -= money;
    }
public String toString() {
    return "계좌번호: "+account+" 잔고: "+ balance;
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("441-0290-1203", 500000, 7.3);
        //account 객체 생성
        System.out.println(account.toString());
        //account 기본 정보 출력
        account.deposit(20000);
        //account 에 20000원 입금
        System.out.println(account.toString());
        //account 변경 정보 출력

        System.out.println("이자 금액: " +account.calculateInterest());
        //이자 출력 - 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력한다
    }
}

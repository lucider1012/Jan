package day0207.opp;
class Account{
    String account;
    int balance;
    double interestRate;
    int money;
    public Account() {

    }
    public Account(String account, int balance, double interestRate) {
    this.account=account;
    this.balance = balance;
    this.interestRate = interestRate;
    }

    public String getAccount() {

        return account;
    }
    public void setAccount(String account) {

        this.account = account;
    }

    public int getBalance() {
        return balance;
    }
    public double calculateInterestRate;

    public void deposit(int money){

    }
    public void withdraw(int money){

    }
    public String toString() {
        return "계좌정보: "+ account+" 현재 잔액: "+balance;
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("441-0209-1203", 500000, 7.3);
        System.out.println(account.toString());
        account.money = 20000;
        account.balance += account.money;
        account.calculateInterestRate = account.balance * account.interestRate / 100;
        System.out.println(account.toString());
        System.out.println("이자: "+account.calculateInterestRate);
    }
}

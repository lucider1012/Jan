package day0210.oop;
class book{
    private String bookName;
    private int bookPrice;
    private double bookDiscountRate;
    public book() {
    }
    public book(String bookName, int bookPrice, double bookDiscountRate) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookDiscountRate = bookDiscountRate;
    }
    public double getDiscountBookPrice(){
        return bookPrice-bookPrice*(bookDiscountRate/100);
        //return bookPrice * (1-bookDiscountRate * 0.01);
    }
    public String toString() {
        return bookName + "\t"+bookPrice+"원\t"+bookDiscountRate+"%\t"+getDiscountBookPrice()+"원";
    }
}
public class BookTest {
    public static void main(String[] args) {
        System.out.println("책이름\t\t가격\t\t할인율\t할인 후 금액");
        System.out.println("______________________________________");
        book b1 = new book("SQL Plus", 50000, 5.0);
        book b2 = new book("Java 2.0", 40000, 3.0);
        book b3 = new book("JSP Servlet", 60000, 6.0);
        //book b1 = new book("SQL Plus", 50000, 5.0);
        //Book[] books = {b1, new Book("Java 2.0",40000,3.0), new Book("JSP Servlet", 60000, 6.0)};
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        //for(Book b : books) {
        //  System.out.println(b.getBookName()+"\t"+
        //                      b.getBookPrice()+\t+
        //                      b.getBookDiscountRate()+"%\t"+
        //                      b.getDiscountBookPrice()+"원"
        //                      );
    }
}

package day0214.exception;

public class ThrowEx {
    public static void main(String[] args) {
        try {
                throw new Exception("강제 예외 발생");
        }
        catch (Exception e){
            System.err.println("예외처리: "+e.getMessage());
            e.printStackTrace();
        }
    }
}

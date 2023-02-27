package day0205.oop.method;

public class StaticInstance    {
    static int cv;
    int iv;
    int iv2 = cv;
    int iv3=iv;
    void instanceMethod(){
        System.out.println(iv);
        System.out.println(cv);
    }
    static int cv2 = cv;
    
    static void staticMethod(){
        StaticInstance si = new StaticInstance();
        System.out.println(si.iv);
    }
}

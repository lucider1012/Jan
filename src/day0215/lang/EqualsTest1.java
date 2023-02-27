package day0215.lang;

class Value{
    int value;
    public Value(int value) {
        this.value = value;
    }
    //value에 저장된 값이 같으면 같은 객체 ->overriding


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Value){
            Value v = (Value) obj;
            // (value == v2.value) {
                //return equals(v2.value);
                return value == v.value;
            //}
        }
        return false;
    }

    @Override
    public int hashCode() {
        return value;
        //주소값을 리턴하지 말고 비교 기준 값을 리턴(int)한다.
    }
}
public class EqualsTest1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());

        if (v1==v2) {
            //기본형을 비교할 때는 == 사용
            System.out.println("v1과 v2는 같습니다.");
        }
        else {
            System.out.println("v1과 v2는 다릅니다.");
        }
        if (v1.equals(v2)){
            //객체를 비교할때는 equals() 사용
            //Object의 equals()는 가리키고 있는 객체가 같은지 다른지 비교한다.
            //결과적으로 주소값 비교와 같은 역할
            System.out.println("v1과 v2는 같습니다.");
        }
        else {
            System.out.println("v1과 v2는 다릅니다.");
        }
        if (v1.equals(v2)) {
            System.out.println("같습니다.");
        }
        else {
            System.out.println("다릅니다.");
        }
        System.out.println(v1);
        System.out.println(v2);
    }
}

package day0214.oop.test01;

public class TV implements Volume{
    private int VolLevel;
    public void volumeUp(int level){
        VolLevel+=level;
        System.out.println("TV 볼륨 내립니다."+VolLevel);
    }
    public void volumeDown(int level){
        VolLevel-=level;
        if (VolLevel <= 0) {
            VolLevel = 0;
        }
        System.out.println("TV 볼륨 내립니다."+VolLevel);
    }
}

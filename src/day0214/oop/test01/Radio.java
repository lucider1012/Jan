package day0214.oop.test01;

public class Radio implements Volume{
    private int VolLevel;
    public void volumeUp(int level){
        VolLevel+=level;
        System.out.println("Radio 볼륨 올립니다."+VolLevel);
    }
    public void volumeDown(int level){
        VolLevel-=level;

        System.out.println("Radio 볼륨 내립니다."+VolLevel);
    }
}

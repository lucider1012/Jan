package day0214.inner;
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AnonymousTest {
    public static void main(String[] args) {
        Frame f = new Frame("프레임창");
        Button b = new Button("버튼을 누르세요");
        //b.addActionListener(new ClickEvent());
        b.addActionListener(new ActionListener() {

                                @Override
                                public void actionPerformed(ActionEvent e) {

                                }
                            }
        );
        f.add(b);
        f.setBounds(100,100,300,300);
        f.setVisible(true);
    }
}
class ClickEvent implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //연결된 객체에 이벤트가 발생하면 자동으로 호출됨
        System.out.println("클릭했습니다.");
    }
}
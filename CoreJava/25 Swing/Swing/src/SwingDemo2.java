
import javax.swing.JFrame;

public class SwingDemo2 extends JFrame {
    public SwingDemo2() {
        setTitle("My Second Frame");
        setLayout(null);
        setSize(600,600);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingDemo2();
    }
}

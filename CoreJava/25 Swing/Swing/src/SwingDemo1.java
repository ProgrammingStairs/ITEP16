
import javax.swing.JFrame;

public class SwingDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My First Frame");
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

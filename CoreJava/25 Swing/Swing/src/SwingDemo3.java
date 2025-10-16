
import javax.swing.JFrame;
import javax.swing.*;

public class SwingDemo3 extends JFrame {
    JMenuBar mBar;
    JMenu menu,menu1,menu2;
    JMenuItem i1,i2;
    
    public SwingDemo3() {
        setTitle("My Second Frame");
        setLayout(null);
        setSize(600,600);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mBar = new JMenuBar();
            menu = new JMenu("File");
            menu1 = new JMenu("Edit");
            menu2 = new JMenu("Save");

            i1 = new JMenuItem("New Project");
            i2 = new JMenuItem("Open Project");
            
            setJMenuBar(mBar);
            mBar.add(menu);
             mBar.add(menu1);
              mBar.add(menu2);
            menu.add(i1);
            menu.add(i2);
            
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingDemo3();
    }
}

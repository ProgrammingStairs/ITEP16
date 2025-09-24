package MainPackage;
import Bpackage.Bclass;
import Cpackage.Cclass;

public class MainClass {
    public static void main(String[] args) {
        Bclass bobj = new Bclass();
        bobj.draw();
       // bobj.show();
        Cclass cobj = new Cclass();
        cobj.display();
    }
}

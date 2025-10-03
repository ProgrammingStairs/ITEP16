
import java.util.StringJoiner;

public class Demo6 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("/");
        sj.add("03");
        sj.add("10");
        sj.add("2025");
        System.out.println("Date : "+sj);

        String s = String.join("/", "03","10","2025");
        System.out.println("Date : "+s);
    }
}

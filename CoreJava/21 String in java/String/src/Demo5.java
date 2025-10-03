import java.util.Scanner;
import java.util.StringTokenizer;
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.nextLine();
        StringTokenizer st = new StringTokenizer(content, " ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

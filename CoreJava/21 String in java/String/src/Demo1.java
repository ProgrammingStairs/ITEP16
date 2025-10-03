import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.nextLine();
        char ch[] = content.toCharArray();
        
        for(int i=0;i<ch.length/2;i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        String s = new String(ch);
        System.out.println("Reverse String : "+s);
    }
}

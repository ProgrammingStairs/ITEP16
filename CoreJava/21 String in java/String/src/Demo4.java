import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.next();
        char ch[] = content.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90)
                ch[i] = (char)((int)(ch[i])+32);
            else if(ch[i]>='a' && ch[i]<='z')
                    ch[i] = (char)((int)(ch[i])-32);
            else if(ch[i]>=48 && ch[i]<='9')
                    ch[i] = '#';
        }
        String s = new String(ch);
        System.out.println("String : "+s);
    }
}

import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.nextLine();
        String words[] = content.split(" ");
        
        for(int i=0;i<words.length;i++){
            char temp[] = words[i].toCharArray();
                for(int j=0;j<temp.length/2;j++){
                    char flag = temp[j];
                    temp[j] = temp[temp.length-1-j];
                    temp[temp.length-1-j] = flag;
                }
                String s = new String(temp);
                words[i] = s;
        }
        System.out.print("Reverse String : ");
        for(String word : words){
            System.out.print(word+" ");
        }
    }
}

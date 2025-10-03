import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.nextLine();
        String words[] = content.split(" ");
        
        for(int i=0;i<words.length/2;i++){
            String temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        System.out.print("Reverse String : ");
        for(String word : words){
            System.out.print(word+" ");
        }
    }
}

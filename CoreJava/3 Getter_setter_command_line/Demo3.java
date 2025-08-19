import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();

        Student obj = new Student();
            obj.setRno(rno);
            obj.setName(name);
            obj.setPer(per);

            System.out.println("\nRoll Number : "+obj.getRno());
            System.out.println("Name : "+obj.getName());
            System.out.println("Percentage : "+obj.getPer());
            
    }
}
// example showing the concept of function
// with argument with return type

class Demo8{
    int getAge(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Age : ");
        return sc.nextInt();
    }
    int checkNationality(char ch){
        if(ch=='i' || ch=='I'){
            System.out.println("Citizen is Indian");
            if(getAge()>=18)
                return 1;
            else
                return 0;
        }else
            return -1;
    }
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Nationality(i/I) for Indian : ");
        char ch = sc.next().charAt(0);
        Demo8 obj = new Demo8();
        int res = obj.checkNationality(ch);
        if(res==1)
            System.out.println("Eligible to vote");
        else if(res==0)
            System.out.println("Not Eligible to vote");
        else 
            System.out.println("Citizen is not an Indian");
    }
}


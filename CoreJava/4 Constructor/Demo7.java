// example showing the concept of shallow copy

class Address{
    String city,state;
    Address(String city,String state){
        this.city=city;
        this.state=state;
    }
}
class Student{
    int rno;
    double per;
    Address address;

    Student(int rno,double per,Address address){
        this.rno = rno;
        this.per=per;
        this.address = address;
    }
    Student(Student obj){
        this.rno=obj.rno;
        this.per=obj.per;
        this.address = obj.address;
    }
}
class Demo7{
    public static void main(String args[]){
        Address address = new Address("Indore","MP");
        Student s1 = new Student(101,67.78,address);
        Student s2 = new Student(s1);
        
        s2.address.city = "Jabalpur";
        s2.address.state = "Madhya Pradesh";

        System.out.println("s1 : \n");
        System.out.println("Roll Number : "+s1.rno);
        System.out.println("Percentage : "+s1.per);
        System.out.println("Address : \n\tcity : "+s1.address.city+"\n\tstate : "+s1.address.state);

        System.out.println("\nAfter Copying : \ns2 : \n");
        System.out.println("Roll Number : "+s2.rno);
        System.out.println("Percentage : "+s2.per);
        System.out.println("Address : \n\tcity : "+s2.address.city+"\n\tstate : "+s2.address.state);

    }
}

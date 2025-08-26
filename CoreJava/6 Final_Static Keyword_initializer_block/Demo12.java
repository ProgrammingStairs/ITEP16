// example showing the concept of static
class Student{
    int rno;
    String name;
    static String cname = "ABC College, Indore";

    // Parameterized constructor
    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void printData(){
        System.out.println(rno+"\t"+name+"\t"+cname);
    }
}
class Demo12{
    public static void main(String args[]){
        Student s1 = new Student(101,"Andrew Anderson");
        Student s2 = new Student(102,"Peter Parker");

        System.out.println("############ Student Details ##########");
        s1.printData();
        s2.printData();
    }
}
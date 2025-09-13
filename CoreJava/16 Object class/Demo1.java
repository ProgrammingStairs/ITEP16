// example showing the concept of Object class methods | toString() method
class Student{
    int rno;
    double per;
    String name;
    Student(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;    
    }
    @Override
    public String toString(){
        return "Object details : { "+rno+" , "+per+" , "+name+" }\n";
    }
    @Override
    public int hashCode(){
        return rno;
    }
}
class Demo1{
    public static void main(String args[]){
        Student s1 = new Student(101,56.67,"Peter Parker");
        System.out.println("student : "+s1);
        System.out.println("student : "+s1.toString());   

        System.out.println("student : "+s1.hashCode());   
    }
}

/*
class Object{
     public String toString(){
            return getClass().getName()+"@"+Integer.toHexString(hashCode());
        }
}
class Demo1 extends Object{ // Demo1 directly extends Object class
    ...
    ...
    public static void main(String args[]){
        Demo1 s1 = new Demo1();
        System.out.println(s1); // s1.toString()

    }
}
*/

/*
    class Parent extends Object{} // Parent class Directly extends Object class
    class Demo1 extends Parent {} // Demo1 indirectly extends Object class
*/
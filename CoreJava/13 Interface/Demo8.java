// example showing the concept of interface
// interface Showable{
//     int age=18;
// }
// class Demo8 implements Showable{
//     public static void main(String args[]){
//         System.out.println("Age : "+age);
//     }
// }


// interface Showable{
//     int age=18;
// }
// class Demo8{
//     public static void main(String args[]){
//         System.out.println("Age : "+Showable.age);
//     }
// }

interface Showable{
    int age=18;
}
interface Movable{
    int age=28;
}

class Demo8 implements Showable,Movable{
    public static void main(String args[]){
        System.out.println("Showable Age : "+Showable.age);
        System.out.println("Movable Age : "+Movable.age);
    }
}
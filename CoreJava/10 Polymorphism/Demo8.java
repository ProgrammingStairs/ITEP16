// example showing the concept of polymorphism 
// method overriding 

class Parent{
    void shape(){
        System.out.println("Its shape");
    }
}
class Circle extends Parent{
    @Override
    void shape(){
        System.out.println("Its Circle shape");
    }
}
class Rectangle extends Parent{
    @Override
    void shape(){
        System.out.println("Its Rectangle shape");
    }
}
class Square extends Parent{}

class Demo8{
    public static void main(String args[]){
        Circle cobj = new Circle();
        Rectangle robj = new Rectangle();
        Square sobj = new Square();
            cobj.shape();
            robj.shape();
            sobj.shape();
    }
}
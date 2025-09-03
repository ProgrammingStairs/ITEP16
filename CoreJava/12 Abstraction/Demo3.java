// example showing the concept of abstract class 

abstract class Parent{
    abstract void shape();
}
class Circle extends Parent{
    @Override
    void shape(){
        System.out.println("Its circle shape");
    }
}
class Rectangle extends Parent{
    @Override
    void shape(){
        System.out.println("Its rectangle shape");
    }
}
class Square extends Parent{
    @Override
    void shape(){
        System.out.println("Its Square shape");
    }
}

class Demo3{
    public static void main(String args[]){
        Parent obj;
        obj = new Circle();
        obj.shape();
        obj = new Rectangle();
        obj.shape();
        obj = new Square();
        obj.shape();
    }
}
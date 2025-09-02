// example showing the concept of aggregation(Has-A relationship) and inheritance (Is-A relationship)
// Maruti Has-A Engine
// Maruti Is-A Car

class Engine{
    int horsePower;
    Engine(int hp){
        this.horsePower = hp;
    }
}
class Car{
    int price;
    String color;
    void setPrice(int price){
        this.price=price;
    }
    void setColor(String color){
        this.color=color;
    }
    void showInfo(){
        System.out.println("\nPrice : "+price+"\nColor : "+color);
    }
}
class Maruti extends Car{
    Engine engine;
    Maruti(int price,String color,Engine engine){
        setPrice(price);
        setColor(color);
        this.engine=engine;
        this.showInfo();
    }
    void showHorsePower(){
        System.out.println("Horse Power : "+engine.horsePower);
    }
}
class Demo1{
    public static void main(String args[]){
        Engine engine = new Engine(200);
        Maruti mobj = new Maruti(50000,"Blue",engine);
        mobj.showHorsePower();
    }
}
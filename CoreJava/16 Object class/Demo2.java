// example showing the concept of Object class methods | equals() method
class Complex{
    @Override 
    public boolean equals(Object c2){
        if(this==c2)
            return true;
        else 
            return false;
    }
}
class Demo2{
    public static void main(String args[]){
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        if(c1.equals(c2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
    }
}

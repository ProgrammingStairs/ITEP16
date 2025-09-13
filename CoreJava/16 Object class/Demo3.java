// example showing the concept of Object class methods | hashCode() method
class Demo3{
    public static void main(String args[]){
String str1 = "FB";
// String str2 = "Ea";
String str2 = "Andrew";

System.out.println("str1 : "+str1.hashCode()); 
System.out.println("str2 : "+str2.hashCode()); 

System.out.println(str1.hashCode() == str2.hashCode()); // true
    }
}

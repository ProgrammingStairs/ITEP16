// example showing the concept of polymorphism 
// method overloading
class Demo6{
    public static void main(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater number : "+res);
    }
    public static void main(int a,int b,int c){
        int res = a>b ? (a>c?a:c) : (b>c?b:c);
        System.out.println("Greater number : "+res);        
    }
    public static void main(String args[]){
        main(4,5);
        main(6,7,8);    
    }
}


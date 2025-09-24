package Cpackage;

import Apackage.Aclass;

public class Cclass {
    public void display(){
        System.out.println("display of Cclass called");
        Aclass aobj = new Aclass();
        aobj.printData();
    }
}

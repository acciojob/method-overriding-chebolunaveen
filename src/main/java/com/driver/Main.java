package com.driver;

public class Main {
    public static <sout> void main(String[] args) {
        A ob = new B();
        System.out.println(ob.meth());
        B obj = new B() ;
      System.out.println(obj.meth());
    }
}
class A{
  public String meth(){
    return "Invoking method from class A";
  }
}
class B extends A{
  public String meth(){
   return "Method is overridden in Extendend class B";
  }
}

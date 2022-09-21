package com.sh.oop.method;

public class Test {

	 int a = 100;
     static int s = 99;
     
     public static void main(String[] args) {
         Test t = new Test();
         t.test1(); //a = 1000, b = 99
         
         t.test2(); //a=100
         
         Test t3 = new Test();
         t.test3(t3); //a=10
         System.out.println(t3.a); //a=10
             
     }

     public void test1() {
         int a = 1000;
         int s = 999;
         System.out.println(this.a);
         System.out.println(Test.s);
     }

     public void test2() {
         Test t = new Test();
         t.a = 1000;
         System.out.println(a);
     }

     public void test3(Test t) {
         t.a = 10;
         this.a = 200;
         System.out.println(t.a);
     }


 }


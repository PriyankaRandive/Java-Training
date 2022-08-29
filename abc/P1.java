package com.abc;

abstract class P1
{
   abstract void show();
   public void test()
  {
    System.out.println(“test is non abstract method”);
   }
}
class  C1 extends P1
{
  void show()
{
  System.out.println(“show overrides ”);
}
 static public void main(String s[])
 {
   C1 obj = new C1();
   obj.show();
   obj.test();
 }

}

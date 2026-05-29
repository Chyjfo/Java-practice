abstract class A
{
public void make(){
System.out.print("Making");
}
abstract void stuff();
}
class B extends A
{
public void stuff(){
System.out.println(" bread...");
}
}
class work
{
public static void main(String agrs[])
{
B obj=new B();
obj.make();
obj.stuff();
}
}
class A 
{
void stuff(){
System.out.println("bread");
}
}
class B extends A
{
void stuff()
{
super.stuff();
System.out.println("Yeast");
}
}
class override
{
public static void main(String args[])
{
B item=new B();
item.stuff();
}
}
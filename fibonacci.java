import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter number of terms: ");
int term= scan.nextInt();
int first=0,second=1;
System.out.print("Fibonacci series: " + first + "," +second + " ");
for(int i =3;i<=term;i++)
{
int next= first+second;
System.out.print("," + next);
first= second;
second= next;
}
System.out.println();
scan.close();
}
}
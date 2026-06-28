import java.util.Scanner;
class AmstrongNumber{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter an integer: ");
int num= scan.nextInt();
int originalNumber= num;
int result=0;
int digits =String.valueOf(num).length();
while(originalNumber != 0)
{
int remainder =originalNumber % 10;
result += Math.pow(remainder, digits);
originalNumber /= 10;
}
if(result==num)
{
System.out.println(num + " is an Amstrong number");
}
else{
System.out.println(num + " is not an Amstrong number");
}
scan.close();
}
}

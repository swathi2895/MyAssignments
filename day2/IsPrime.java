package week1.day2;
public class IsPrime {
public static void main(String[] args) {
int n = 10;
boolean flag=false;
for(int i=2; i<n-1; i++)
{
if(n%i==0)
{
flag=true;
break;
}}
if(flag==false)
{
System.out.println("Entered number is a prime number-" + n);
}
else
{
System.out.println("Entered number is not a prime number-"+ n);
}
}
}


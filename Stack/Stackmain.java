import java.util.*;
public class Stackmain
{
public void display(Stack s1,Stack s2)
{
if(s1.count()==s2.count())
{
System.out.println("Both stacks have " + s2.count()+ " elements");
}
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
Stack s1=new Stack(10);
Stack s2=new Stack(10);
int choice,data;
Stackmain s=new Stackmain();
while(true)
{
System.out.println("\n1. Push into Stack 1");
System.out.println("2. Push into Stack 2");
System.out.println("3. Pop from Stack 1");
System.out.println("4. Pop from Stack 1");
System.out.println("Enter Your Choice : ");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter The Data");
data=sc.nextInt();
s.push(data);
s.display(s1,s2);
break;
case 2:
System.out.println("Enter The Data");
data=sc.nextInt();
s2.push(data);
s.display(s1,s2);
break;
case 3:
System.out.println(s1.pop());
s.display(s1,s2);
break;
case 4:
System.out.println(s2.pop());
s.display(s1,s2);
break;
default:
}
}
}
}

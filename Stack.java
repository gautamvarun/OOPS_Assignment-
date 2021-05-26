
public class Stack {


private int []s;
private int top,max;
Stack(int i)
{
max=i;
s=new int[max];
top=-1;
}
void push(int data)
{
if(top==max)
{
System.out.print("Stack is Overflow");
}
else
{
s[++top]=data;
}
}
int pop()
{
if(top==-1)
{
System.out.print("Stack is Underflow");
return 0;
}
else
{
return s[top--];
}
}
boolean checkEmpty()
{
if(max==-1)
{
return true;
}
else
{
return false;
}
}
public int count()
{
if(top>-1)
return top+1;
else
return 0;
}
}

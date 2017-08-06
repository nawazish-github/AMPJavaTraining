package stack;

import java.util.Scanner;

public class stack { //it is convention in Java to name classes with initial capital alphabet -- Stack
	int length;
	int top;
	int Array[]; // we do not start variable names with capital letter; it should be array[]
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int l=s.nextInt();
		stack mystack=new stack(l);
		System.out.println("checking stack is empty:");
		System.out.println(mystack.empty());
		for(int i=0;i<l;i++) {
			System.out.println("enter the element");
			int ele=s.nextInt();
		mystack.push(ele);
		//System.out.println(mystack.empty());
		
		}
		
		
		mystack.printstack();
		System.out.println(" ");
		System.out.println(mystack.peek()+ " is in the peek");
		
		System.out.print("LIFO from stack ");
		while(!mystack.empty())
		{
			
			System.out.print( mystack.pop()+" ");
		}
			
			//System.out.println(mystack.pop()+ "  is poped");
			
	}
	
public stack(int n)
{
length=n;
Array=new int[length];
top=0;

}
public boolean empty()
{
	if(top==0)
	{
		return true;
	}
	else
	{
		return false;
	
	}
}
public void push(int m)
{
	if(top<length)
	{
		Array[top]=m;
		top++;
		
		//above assignment and increment order is incorrect; this will overwrite previous top element.
		//correct code as follows
		top++;
		Array[top]=m;
		// or you can combine the above two lines in one line as follows:
		Array[++top]=m;
	}
	else
	{
		System.out.println("stack overflow");
	}
}
public int peek()
{
	// what if the stack had only one element; in that case the top will be at 0th index
	// and hence top>0 will always fail (although the stack has one element in it)
	if (top>0) 
	{
		return Array[top-1];
	}
	else
	{
		return   -1;
	}
}
 void printstack()
{
	 System.out.print("stack elements ");
for(int i=0;i<Array.length;i++) 
{
	//by looping from 0 to array.length you completely ignored basic stack concept
	// stack has only one point access to the its underlying data; that is, from the top
	//think about stack of plate, how can u access 0th element; array[0]
	System.out.print(Array[i]+" ");
}

}
	public int pop()
	{
		
			int temp=this.peek();
			//Array[top-1]= -1;
			top--;
			return temp;
		
		
}
}

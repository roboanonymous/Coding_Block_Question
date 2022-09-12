package Stack_and_queue;

import java.util.*;

public class reverse_stack {
	
	public static void inseatAtBottom(Stack <Integer> s, int a)
	{
		if(s.isEmpty())
		{
			s.push(a);
			return;
			
		}
		
		int top = s.pop();
		inseatAtBottom( s,  a);
		s.push(top);
		
	}
	
	public static void reverse(Stack <Integer> s)
	{
		if(s.isEmpty())
		{
			return;
		}
		
		int a = s.pop();
		reverse(s);
		inseatAtBottom(s, a);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <Integer> s = new Stack <>();
		int n=5;
		for(int i=0 ; i<n;i++)
		{
			s.push(i+1);
		}
		
		System.out.println(s);

		
		reverse(s);
		
		System.out.println(s);

	}

}

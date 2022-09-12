package Stack_and_queue;

import java.util.*;
public class Valid_parenthesis {
	
	public static boolean valid_paren (String str)
	{
		Stack <Character> s = new Stack<>();
		for(int i=0; i<str.length(); i++)
		{
			char a = str.charAt(i);
			
			if(a == '(' || a == '[' || a == '{')
			{
				s.push(a);
			}
			
			else if(s.isEmpty())
			{
				return false;
			}
			
			
			else if(a == ')' && s.pop() != '(')
			{
				return false;
			}
				
			else if(a == '}' && s.pop() != '{')
			{
				return false;
			}
				
				
			else if(a == ']' && s.pop() != '[')
			{
				return false;
			}
			
						
			
		}
		
		return s.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "({[]})";
		
		String str2 = "({)}";
		
		String str3 = "()[]{}";
		
		String str4 = "()))";
		
		String str5 = "(])";
		
		
		System.out.println(valid_paren(str));
		System.out.println(valid_paren(str2));
		System.out.println(valid_paren(str3));
		System.out.println(valid_paren(str4));
		System.out.println(valid_paren(str5));


	}

}

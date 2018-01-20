import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<Integer>();
        Stack<Integer> maxstack=new Stack<Integer>();
        
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int type=sc.nextInt();
            switch (type) {
			case 1:
				int x=sc.nextInt();
                stack.add(x);
                if(maxstack.isEmpty() || maxstack.peek()<= x)
                {
                	maxstack.push(x);
                }
				break;
			case 2:
				int data=stack.pop();
                if(maxstack.peek()==data)
                {
                	maxstack.pop();
                }
                break;
			case 3:
				System.out.println(maxstack.peek());
				break;
			default:
				break;
			}
        }
        
    }
}
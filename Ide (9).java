/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// Program to find largest between three numbers

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
	int b = scn.nextInt();
	int c = scn.nextInt();
	
    int  max = a;
    
    if(b > max){
        max = b;
    }
    if( c > max){
        max  = c;
    }
	 System.out.println(max);
	}
}

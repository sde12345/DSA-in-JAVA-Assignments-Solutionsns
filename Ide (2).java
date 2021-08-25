/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// Counting occurances of a particular digit in a given number
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 455536; 
		
		int count = 0;
		while(n > 0){
		    int rem = n % 10;
		    if(rem == 5){
		        count++;
		    }
		    n = n / 10;
		}
		System.out.println(count);
	}
}

package com.sow.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String str2="";  
        int length = str1.length() -1;
        for(int i=length; i>=0; i--)
        {   
            str2+=str1.charAt(i);
        }
        
        if(str1.equals(str2))
            System.out.println("Yes");
        else
            System.out.println("No"); 
	}
}

package assignment;

import java.util.*;

public class RomanToInteger {
	static int convertRomanToInteger(String s)  
	{  
		Map<Character, Integer> m=new HashMap<Character, Integer>();  
		m.put('I',1);  
		m.put('V',5);  
		m.put('X',10);  
		m.put('L',50);  
		m.put('C',100);  
		m.put('D',500);  
		m.put('M',1000);    
		s = s.replace("IV","IIII");  
		s = s.replace("IX","VIIII");  
		s = s.replace("XL","XXXX");  
		s = s.replace("XC","LXXXX");  
		s = s.replace("CD","CCCC");  
		s = s.replace("CM","DCCCC");  
		int number = 0;  
		for (int i = 0; i < s.length(); i++)  
		{  
			number = number + (m.get(s.charAt(i)));  
		}  
		return number;  
	} 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Roman Number:");
		String s = scan.next(); 
		int num = convertRomanToInteger(s.toUpperCase());
		System.out.println("The Corresponding Integer value of " + s + " is : " + num);
		scan.close();
		
	}
}

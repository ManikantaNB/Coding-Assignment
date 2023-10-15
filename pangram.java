package assignment;

import java.util.Scanner;

public class pangram {
	static boolean isPanagram(String s) {
		if(s.length()<26)
			return false;
		s=s.toLowerCase();
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.nextLine();
		boolean res = isPanagram(s);
		if(res == true)
			System.out.println(s + " is a panagram");
		else
			System.out.println(s + " is not a panagram");
		sc.close();
	}

}

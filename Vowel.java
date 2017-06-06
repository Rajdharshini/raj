import java.util.*;

class Vowel {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
		char x;
		x=s.next().charAt(0);
		if(x =='a' || x =='e' ||  x =='i' ||  x =='o' ||  x =='u')
		{
		    System.out.println("vowel");
		}
		else{
		    System.out.println("consonant");
		}
	}
}

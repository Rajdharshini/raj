import java.util.*;

class Typeint {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
		int x;
		x=s.nextInt();
		if(x>0)
		{
		    System.out.println("positive");
		}
		else	if(x<0)
		{
		    System.out.println("negative");
		}
		else
		{
		    System.out.println("zero");
		}
	}
}

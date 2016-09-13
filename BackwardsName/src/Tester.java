import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {

		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is your name?");
		String n = kbReader.nextLine();
		String reversed = "";
		
		for(int l = 0 ; l < n.length(); l++){
			String r = n.substring(n.length()-1-l,n.length()-l);
			reversed += r;
			
		}
		
		System.out.println(reversed.toLowerCase());
		
	}
}
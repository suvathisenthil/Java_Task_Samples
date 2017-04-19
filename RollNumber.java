import java.util.Scanner;
public class RollNumber {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		String str ;
		System.out.println("Enter the RollNo :");
		str = in.next();
		String dept = "";
		String classs = "";
		char ch[];
		ch = str.toCharArray();
		String year;
		String rno;
		rno = str.substring(4,6);
		char cla;
		cla = str.charAt(3);
		switch (cla) {
			case '1' : 
				classs = "A";
				break;
			case '2' : 
				classs = "B";
				break;
			case '3' : 
				classs = "C";
				break;
			case '4' : 
				classs = "A";
				break;
			case '5' : 
				classs = "B";
				break;
			case '6' : 
				classs = "C";
				break;
		}
		char choice,cho;
		cho =str.charAt(2);
		choice = Character.toUpperCase(cho);
		switch(choice) {
			case 'A' : 
				dept = "AUTO";
				break;
			case 'C' : 
				dept = "CIVIL";
				break;
			case 'P' : 
				dept = "CSE";
				break;
			case 'E' : 
				dept = "EEE";
				break;
			case 'L' : 
				dept = "ECE";
				break;
			case 'N' : 
				dept = "EIE";
				break;
			case 'T' : 
				dept = "ETE";
				break;
			case 'F' : 
				dept = "IT";
				break;
			case 'M' : 
				dept = "MECH";
				break;

		} 

		year = str.substring(0,2);
		System.out.println("YEAR OF PASSING :20"+year);
		System.out.println("DEPARTMENT	:"+dept);
		System.out.println("SECTION		:"+classs);
		System.out.println("ROLLNO 		:"+rno);
			}

		}

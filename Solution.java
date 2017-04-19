import java.util.Scanner;
public class Solution {
	public static void main(String args[]) {
		Time t = null;
		Scanner in = new Scanner(System.in);
		int a,b;
		a=in.nextInt();
		switch(a) {
			case 1: 
				t = new Time();
				break;

			case 2: 
				t = new Time(in.nextInt());
				break;

			case 3: 
				t = new Time(in.nextInt(), in.nextInt());
				break;

			case 4: 
				t = new Time(in.nextInt(), in.nextInt(), in.nextInt());
				break;
			}
		b = in.nextInt();
		switch(b) {
			case 1: 
				t.nextSecond();
				break;
			case 2: 
				t.nextMinute();
				break;
			case 3: 
				t.nextHour();
				break;
			case 4: 
				t.previousSecond();
				break;
			case 5: 
				t.previousMinute();
				break;
			case 6: 
				t.previousHour();
				break;
		}
		t.print();
	}
}


import java.util.Scanner;
public class AverageOfDays {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int [30][24];
		System.out.println("Enter the array :");
		for(int i =0; i < arr.length; i++) {
			for(int j=0;j < arr[i].length; j++) {
					arr[i][j] = in.nextInt();  
			}
			
		}
		for(int i =0; i < arr.length; i++) {
			for(int j=0;j < arr[i].length; j++) {
					System.out.println("arr["+i+"]["+j+"]  :"+arr[i][j]);
			}
			
		}
		int start,end;
		System.out.println("Enter the start day :");
		start = in.nextInt();
		System.out.println("Enter the end day :");
		end = in.nextInt();
		for(int i = start-1; i < end; i++) {
			int sum =0 ,avg = 0;
		for(int j = 0; j < arr[i].length; j++) {
			sum = sum+arr[i][j];
		}
		avg = sum/(arr[i].length);
		System.out.println("Average of the day "+(i+1)+":"+avg);
	}

	}
}
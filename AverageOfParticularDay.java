import java.util.Scanner;
public class AverageOfParticularDay {
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
		int user ,sum =0,avg =0;
		System.out.println("Enter the day :");
		user = in.nextInt();
		for(int j = 0; j < arr[user-1].length; j++) {
			sum = sum+arr[user-1][j];
		}
		avg = sum/(arr[user-1].length);
		System.out.println("Average is :"+avg);

	}
}
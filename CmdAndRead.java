import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CmdAndRead {
	public static void main (String args[]) throws IOException {
		int arr[];
		boolean b = Boolean.valueOf(args[0]);
		if(b) {
			arr = new int [] {1,2,3,4,5};
			for(int i =0; i < arr.length; i++) {
				System.out.println(arr[i]);
		}
	}
	else {
		arr = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		for(int i =0; i < arr.length; i++) {
			System.out.println("value "+(i+1)+" : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i =0; i < arr.length; i++) {
			System.out.println("Readed value "+(i+1)+" : "+arr[i]);
		}
	}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ReadBuff {
	public static void main (String args[]) throws IOException {
		int arr[];
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
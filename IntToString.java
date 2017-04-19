public class IntToString {
	public static void main (String args[]) {
		int arr[] = {11,12,13,14,15};
		String str ="";
		for(int i =0; i < arr.length; i++) {
			str=str+arr[i];
		}
			System.out.println(str);
	}
}
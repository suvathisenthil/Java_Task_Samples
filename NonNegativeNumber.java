public class NonNegativeNumber{
	public static void main (String args[]) {
		System.out.println("The positive values are ");
		int arr[] = new int[args.length];
		for(int i = 0; i < args.length; i++) {
			arr[i] = Integer.valueOf(args[i]);		
			if(arr[i] >= 0) {
				System.out.println(args[i]);
		}
	}

	}
}
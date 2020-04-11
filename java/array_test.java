import java.util.Arrays;

class array_test {
	public static void main(String[] args) {
		int[] ns = {1, 2, 3};
		// length (not size)
		System.out.println(ns.length);

		// Print
		System.out.println(Arrays.toString(ns));

		for(int it:ns){
			System.out.print(it + " ");
		}
		System.out.print("\n");

		for(int i=0; i<ns.length; i++){
			System.out.print(ns[i] + " ");
		}
		System.out.print("\n");
	}
}

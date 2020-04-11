import java.util.Arrays;
import java.util.Comparator;

public class cmp_test {
	public static void main(String[] args) {
		Integer[] ns = {1, 3, 2};
		System.out.println(Arrays.toString(ns));
		Comparator cmp = new MyCMP();
		Arrays.sort(ns, cmp);
		System.out.println(Arrays.toString(ns));
	}
}

class MyCMP implements Comparator<Integer> {
	@Override
	public int compare(Integer n1, Integer n2) {
		if(n1<n2){
			return 1;
		}else if(n1>n2){
			return -1;
		}else{
			return 0;
		}
		return 0;
	}
}

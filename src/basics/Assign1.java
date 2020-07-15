package basics;
public class Assign1 {
		public static int sum(int[] numbers) {
	    int sum=0;
	    for (int i = 0; i < numbers.length; i++) {
	        sum=sum+numbers[i];
	        System.out.printlin(sum);
	    }
	    return sum;
	}
}

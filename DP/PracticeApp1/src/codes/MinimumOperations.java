package codes;

public class MinimumOperations {
	public static int minimumOperations(int a) {
		
		if (a <= 3) {
			System.out.println(a);
		}
		
		int count = 0;
		
		while (a > 0) {
			if (a % 2 == 0) {
				a = a / 2;
				count++;
			} else {
				a = a - 1;
				count++;
			}
		}
		
		return count;
	}
}

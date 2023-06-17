import java.util.Scanner;

//change class to Main
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < 4; i++) {
				int x = fs.nextInt();
				max = Math.max(max, x);
			}
			System.out.println(max);
		}
		fs.close();
	}
}

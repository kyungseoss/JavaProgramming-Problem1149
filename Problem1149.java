package problem1149;
import java.util.Scanner;

/*
 * 백준 1149번 문제
 */

public class Problem1149 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[][] = new int[num][3];
		
		for(int i=0; i<num; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
			arr[i][2] = scan.nextInt();
		}
		
		for(int i=1; i<num; i++) {
			arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
			arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
			arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
		}
		System.out.println(Math.min(arr[num-1][0], Math.min(arr[num-1][1], arr[num-1][2])));
	}
}

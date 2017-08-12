package prob11057;

import java.util.Scanner;

public class Main {
	static int mod = 10007;
	public static int d[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		d = new int[input + 1][10];
		solve(input);
	}
	public static void solve(int n) {
		for(int i=0; i<=9; i++) {
			d[1][i] = 1;
		}

		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=j; k<=9; k++) {
					d[i][j] += d[i-1][k];
				}
			}
		}
		int solve = 0;
		for(int i=0; i<=9; i++) {
			solve += d[n][i];
		}
		solve %= mod;
		System.out.println(solve);
	}
}

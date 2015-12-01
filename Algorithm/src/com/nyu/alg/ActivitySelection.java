package com.nyu.alg;

/*
 * Sort by finishing time
 * Select the first activity
 * print the activity whose start time is greater than the activity selected previously
*/
public class ActivitySelection {

	public static void main(String[] args) {
		int s[] = { 1, 3, 0, 5, 8, 5 };
		int f[] = { 2, 4, 6, 7, 9, 9 };

		ActivitySelection as = new ActivitySelection();
		as.getMaxAct(s, f);
	}

	public void getMaxAct(int[] s, int[] f) {
		int finish = 0;
		System.out.print("f[" + finish + "] ");
		for (int i = 0; i < s.length; i++) {
			if (s[i] > f[finish]) {
				System.out.print("f[" + i + "] ");
				finish = i;
			}
		}

	}
}

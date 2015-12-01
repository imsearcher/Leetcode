package com.nyu.alg;

import java.util.Arrays;

public class LCS {
	private String lcsStr = "";

	public static void main(String[] args) {
		LCS lcs = new LCS();
		String str1 = "GOBBLEDYGOOK";
		String str2 = "ALGORITHM";

		System.out.println("LCS:" + lcs.getLCS(str1, str2) + "," + lcs.getLcsStr());
	}

	public int getLCS(String x, String y) {
		setLcsStr("");
		int[][] result = new int[x.length() + 1][y.length() + 1];
		for (int i = 0; i < x.length(); i++) {
			for (int j = 0; j < y.length(); j++) {
				if (x.charAt(i) == y.charAt(j)) {
					result[i + 1][j + 1] = result[i][j] + 1;
				} else {
					result[i + 1][j + 1] = Math.max(result[i + 1][j], result[i][j + 1]);
				}
			}

		}

		int i = x.length() - 1, j = y.length() - 1;
		while (i >= 0 && j >= 0) {

			if (x.charAt(i) == y.charAt(j)) {
				lcsStr=x.charAt(i)+lcsStr;
				i--;
				j--;
			} else if (result[i + 1][j] >= result[i][j + 1])
				j--;
			else
				i--;
		}
		for (int[] row : result) 
	        System.out.println(Arrays.toString(row));      
		return result[x.length()][y.length()];

	}

	public String getLcsStr() {
		return lcsStr;
	}

	public void setLcsStr(String lcsStr) {
		this.lcsStr = lcsStr;
	}
}

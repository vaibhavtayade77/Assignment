package com.yash.TDDprograms;

public class Q1_HCF {

	public static int getHCF(int num1, int num2) {

		if (num1 == 0)
			return num2;

		if (num2 == 0)
			return num1;

		if (num1 == num2)
			return num1;

		if (num1 > num2)

			return getHCF(num1 - num2, num2);

		return getHCF(num1, num2 - num1);

	}

}

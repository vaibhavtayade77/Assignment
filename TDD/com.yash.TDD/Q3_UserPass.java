package com.yash.TDDprograms;

import java.util.ArrayList;
import java.util.List;

public class Q3_UserPass {

	public static boolean CheckEmailandPassword(String email, String password) {

		List<User> a = new ArrayList<>();

		a.add(new User("vaibhav@gmail.com", "vaibhav123"));
		a.add(new User("swapnil@gmail.com", "swapnil123"));
		a.add(new User("sujit@gmail.com", "sujit123"));

		for (int i = 0; i <= a.size() - 1; i++) {
			if (a.get(i).email.contains(email) && a.get(i).password.contains(password)) {
				return true;
			}
			break;
		}
		return false;
	}
}

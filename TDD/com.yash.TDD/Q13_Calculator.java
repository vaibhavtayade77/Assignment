package com.yash.TDDprograms;

public class Q13_Calculator {

	public static int getsum(int a, int b) {

		int c = a + b;
		
		return c;

	}

	public static int getsubstraction(int j, int k) {

		int g = j - k;
		
		return g;

	}

	public static int getmultiplication(int v, int k) {
		int e = v * k;
		
		return e;

	}

	public static float getdivision(int q, int u) {
		int w = q / u;
		
		return w;

	}

	public static double sqrt(double X) {
		//int X = 9;
		double R = Math.sqrt(X);
		System.out.println("The square root of " + X + " is " + R);
		return R;
	}
	
	public static double cuberoot(double v) {
		double CR=Math.cbrt(v);
		System.out.println();
		return CR;
		
	}
	
//	public static int power(int N, int P)
//    {
//        int pow = 1;
//        for (int i = 1; i <= P; i++)
//            pow *= N;
//        return pow;
//    }
	
	public static double power(int N, int P)
    {
        return Math.pow(N, P);
    }
	
	 public static double modulus(int a,int b)
	    {
	       
	        
			 
			int divided = a / b;
			int result = a - (divided * b);
			System.out.println(result);
			return result; 
		}
	 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


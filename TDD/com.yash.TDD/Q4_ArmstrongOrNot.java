package com.yash.TDDprograms;

public class Q4_ArmstrongOrNot {
	
		
		 public static boolean armstrongnumber(int n)
	        {
	            int rem=0,sum=0;
	            int original=n;

	            while(n>0)
	            {
	                rem=n%10;
	                sum=(rem*rem*rem)+sum;
	                n=n/10;

	            }

	        if(sum==original)
	        {
	          return true;    
	        }
	        else
	        {
	            return false;
	        }
	        }
}
	    
		
//		int c=0,a,temp;
//		//int n=372;
//		temp=n;
//		
//		while(n>0) {
//			a=n%10;
//			c=c+(a*a*a);
//			n=n/10;
//			
//		}
//		if(temp==c) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
//		return false;
//	}
//		
//	
//    public static void main(String[] args) {
//        
//    	Armstrong(370);
//	
//	
//		
//	}


		
	


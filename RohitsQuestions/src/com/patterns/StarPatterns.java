package com.patterns;

public class StarPatterns {
	public static void PyramidPatern(int n){
	/*	    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * *    */
		
	
	}
	public static void createSquare(int n) {
		/*
		 
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 
		 */
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void createHoleSquare(int n) {
		/*
		 
		 ********
		 *      *
		 *      *
		 *      *
		 ********
		 
		 */
		System.out.println("hollow pattern");
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(i==0||i==n-1||j==0||j==n-1) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	/*
	 *  for (i = 0; i < n; i++) {
            //  inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                // otherwise print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
	 * 
	 */
	public static void createSquare() {
		
	}

	public static void main(String[] args) {
//		PyramidPatern(5);
//		createSquare(5);
		createHoleSquare(6);
	}

}
	
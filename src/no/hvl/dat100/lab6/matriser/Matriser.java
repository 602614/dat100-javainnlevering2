package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUtv1(int[][] matrise) {
	    for(int i = 0; i < matrise.length; i++) {
	        for(int j = 0; j < matrise.length; j++) {
	            if (i == 0 || j == 0 || i == 2 || j == 2) {
	                matrise[i][j] = 1;
	            }
	            else { 
	                matrise[i][j] = 0;
	            }
	        }
	    }

	    for(int i = 0; i < matrise.length; i++) {
	        for(int j = 0; j < matrise.length; j++) {
	            System.out.print(matrise[i][j] + " ");
	        }
	        System.out.println(" ");
	    }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String stringen1 = " ";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				
				if (i != matrise[i].length) {
					
					stringen1 += matrise[i][j];
				}
				
			}
		}
		return stringen1;
	}
	
	// C
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise.length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				
				nyMatrise[i][j] = matrise[i][j] * tall;			
			
			
			}	
			
		}
		
		return nyMatrise;

	}

	
	// D
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		boolean like = true;
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
								
				if (mat1[i][j] == mat2[i][j]) { 
				like = true;
				
			} else {
				
				like = false;
			}
			
		}
			
		}
		return like;
	}
	
}

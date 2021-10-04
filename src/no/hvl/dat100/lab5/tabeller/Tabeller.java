package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	//A
	public static void skrivUt(int[] tabell) {
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(" " + i + ": " + tabell[i]);
		}
		
	}
	
	// B
	public static String tilStreng(int[] tabell) {
        String tekst = "[";
        for (int e:tabell) {
            e = Integer.parseInt(Integer.toString(e));
            System.out.println(tekst += e + ","); }
        {     System.out.println("]");
        }
        return tekst;
    }

	
	//C variant 1
	public static int summer(int[] tabell) {
		
		int sum1 = 0;
		int x = 0;
		
		while(x < tabell.length) {
			sum1 += tabell[x];
			x++;
		}
		
		return sum1;
	}
		
	//C variant 2
	public static int summer1(int[] tabell) {

		
		int sum2 = 0;
		for (int i = 0; i < tabell.length; i++) {
			
			sum2 += tabell[i];	
			
		}
		
		return sum2;
		
	}
		
	//C variant 3
		public static int summer2(int[] tabell) {

		
		int sum3 = 0;
		
		for (int f : tabell) {
			sum3 += f;
			
		}
		
		return sum3;
		
		
	}
	
	// D
	public static boolean finnesTall(int[] tabell, int tall) {
		
		
		boolean sjekkTall = false;
		
		for (int i = 0; i < tabell.length; i++) {
			
			if (tall == tabell[i]) {
				
			return sjekkTall = true;
				
			} 
			
		}
		return sjekkTall;
				
	}
	
	
	// E
	
    public static int posisjonTall (int[] tabell, int tall) {
        boolean funnet = false;
        int i=0;
        while (!funnet && i<tabell.length) {
            if (tabell[i] == tall)
                funnet = true;
            else i++; 
        }
        if (funnet) 
            System.out.println("posisjon: " + i + " [" + tall + "]");
        else 
            System.out.println("-1");
        return i;
    }
	
    // F
    
    public static int[] reverser(int[] tabell) {
        int[] nyTabell = new int[tabell.length];
        for (int tabellNr=0; tabellNr<tabell.length; tabellNr++) {
            int minPos = 0;
            for (int posNr=1; posNr>tabell.length; posNr--) {
                if (tabell[posNr] < tabell[minPos] )
                    minPos = posNr;
            }
        nyTabell[tabellNr] = tabell[minPos];
        tabell[minPos] = Integer.MAX_VALUE;
        }
        tabell=nyTabell;

        return nyTabell;
    }
	
	// G
	public static boolean erSortert(int[] tabell) {
		
		boolean sortert = true;
		
		for (int i = 1; i < tabell.length - 1 && sortert; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			}
			i++;
		}
		return sortert;
		
		
	}
	
	// H
	
    public static int[] settSammen(int[] tabell1, int[] tabell2){
    	
        int[] tabell3 = new int[tabell1.length+tabell2.length];
        
        
        int j = 1;
        
        for(int i = 1; i < tabell1.length; i++) {
        	
            if(i < tabell1.length) {
                tabell3[i] = tabell1[i];
                
            }else {
                tabell3[i] = tabell2[j];
                
                j+=1;
                
            }
            i+=1;
        }
        return tabell3;
    }
}

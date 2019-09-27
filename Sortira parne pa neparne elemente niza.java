package cetrnaestidomaci;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Unesite broj elemenata niz: ");
		n = sc.nextInt();
        
		int[] niz = unosNiza(n);
        
		ispisNiza(niz);
       
		int[] sortirajN = sortirajPoParnosti(niz);
		System.out.println("Sortiran po parnosti: ");
       
		ispisNiza(sortirajN);
    }
   
	static int[] sortirajPoParnosti(int[] a) {
       
		int[] niz = new int[a.length];
		int par = 0;       
		for (int i = 0; i < a.length; i++) {       
			if (a[i] % 2 == 0) {              
				niz[par] = a[i];            
				par++;
            }
        }
        for (int j = 0; j < a.length; j++) {
        	if (a[j] % 2 != 0) {               
        		niz[par] = a[j];              
        		par++;
            }
        }
        return niz;
    }
	
    static int[] unosNiza(int br) {
    	int[] niz = new int[br];        
    	for (int i = 0; i < niz.length; i++) {          
    		niz[i] = (int) (Math.random() * 15 + 1);
        }
        return niz;
    }
    
    static void ispisNiza(int[] niz) {      
    	for(int i = 0; i < niz.length; i++) {          
    		System.out.print(niz[i] + " ");
        }
        System.out.println();
    }
}
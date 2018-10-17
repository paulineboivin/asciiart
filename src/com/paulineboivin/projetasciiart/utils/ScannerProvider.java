package com.paulineboivin.projetasciiart.utils;

public class ScannerProvider {


    private ScannerProvider()
    {
    	this.scanner = new Scanner(System.in);
    }

     
    private static ScannerProvider INSTANCE = null;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static ScannerProvider getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new ScannerProvider(); 
        }
        return INSTANCE;
    }
}
	private Scanner scanner;
		public Scanner getScanner(){
			return scanner;
		}
	
}

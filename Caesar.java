package caesar_chiffre;

public class Caesar {
	
	public Caesar() {
		
	}
	
	public static String verschluesseln(String Klartext, int key){
		char[] klartextarray = Klartext.toCharArray();
		 char[] chiffrat = new char[klartextarray.length];
		 

        for(int i = 0; i < Klartext.length(); i++){
        	char c = klartextarray[i]; 
        	if (c >= 48 && c <= 122) {
        		int verschiebung = c - 48;
        		verschiebung = (verschiebung + key) % 75; 
        		if (verschiebung < 0) {
        			verschiebung += 75;
        			
        		}
        		chiffrat[i] = (char) (verschiebung + 48);
        	
        }
        }
        return new String(chiffrat);
	}
        	
        	
        	
        	public static String entchluesseln(String chiffrat, int key){
        		char[] chiffrattextarray = chiffrat.toCharArray();
        		 char[] klartext = new char[chiffrattextarray.length];
        		 
                for(int i = 0; i < chiffrat.length(); i++){
                	char c = chiffrattextarray[i]; 
                	if (c >= 48 && c <= 122) {
                		int verschiebung = c - 48;
                		verschiebung = (verschiebung - key) % 75; 
                		if (verschiebung < 0) 
                			verschiebung += 75;
                		klartext[i] = (char) (verschiebung + 48);
                	}
        	

       
       
       }
        return new String(klartext);
	}	
        		

}

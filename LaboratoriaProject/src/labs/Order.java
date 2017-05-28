package labs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
	  public static String order(String words) {
	    String salida="";
	    String[] aPalabras=words.split("\\s");
	    String[] salidaArreglo=new String[aPalabras.length]; 
	   
	   
	   if(!words.equals("") && !words.matches("\\d")) {
	    for(int i=0; i<aPalabras.length;i++){
	    	Pattern numero=Pattern.compile("\\d");
	    	Matcher buscar=numero.matcher(aPalabras[i]);
	    	
	    	while (buscar.find()){
	    		int posicion=buscar.start();	    		
	    		int numeroReal=Integer.parseInt(aPalabras[i].substring(posicion,posicion+1));	    		
    		salidaArreglo[numeroReal-1]=aPalabras[i];
	    	
	    }
	    	

	    }
	    
	    for(int j=0; j<salidaArreglo.length;j++){
	    	if(j<salidaArreglo.length-1){
	    		salida+=salidaArreglo[j]+" ";
	    	}
	    	else{
	    		salida+=salidaArreglo[j];
	    	}
	    }
	    
	   }
	    
	    return salida;
	  }
	}
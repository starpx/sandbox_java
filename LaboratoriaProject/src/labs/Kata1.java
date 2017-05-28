package labs;

public class Kata1 {
	
	
	  public static String replaceNth(String text, int n, char oldValue, char newValue)
	  {
		 
		  String salida="";
		  int coincidencia=0;
		 if(n>=1){ 
		 for(int i=0;i<text.length();i++){
			
			 if(oldValue==text.charAt(i)){
				coincidencia++; 
				 if(coincidencia%n==0){
					  
					   salida+=newValue;
					 }else{
						
						 salida+=text.charAt(i);
					 }
			 }else{salida+=text.charAt(i);}
			
		 }}else{ salida=text;}
		 
		 
		  
	    return salida;
	  }
	
	

}

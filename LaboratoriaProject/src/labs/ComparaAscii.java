package labs;

public class ComparaAscii {
	
	 public static Boolean compare(String s1, String s2)
	  {  
		 Boolean igual=false;
		 int valorS1=0, valorS2=0;
		 
		 if(s1!=null){
		 s1=s1.toUpperCase();
		 for(int i=0; i<s1.length();i++){
		    	if(s1.codePointAt(i)<=90 && s1.codePointAt(i)>=65){
		    		valorS1+=s1.codePointAt(i);
		    		System.out.println(s1.charAt(i) + " = " + s1.codePointAt(i));
		    	}else{
		    		valorS1=0;
		    		break;
		    	}	    		    	
		    	
		    }
		 
		 }
		 if(s2!=null){
		 s2=s2.toUpperCase();
		 for(int j=0; j<s2.length();j++){
		    	if(s2.codePointAt(j)<=90 && s2.codePointAt(j)>=65){
		    		valorS2+=s2.codePointAt(j);
		    		System.out.println(s2.charAt(j) + " = " + s2.codePointAt(j));
		    	}else{
		    		valorS2=0;
		    		break;
		    	}	
		    }
		 }	    
		 
		 
	    if(valorS1==valorS2){
	    	igual=true;
	    }else{
	    	igual=false;
	    }
	    	
	    return igual;
	  }

}

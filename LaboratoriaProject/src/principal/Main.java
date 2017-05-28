/**
 * 
 */
package principal;
import labs.Kata1;
import labs.ComparaAscii;

/**
 * @author Hera
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kata1 k1=new Kata1();
		//System.out.println("Salida: "+k1.replaceNth("Vader said: No, I am your father!", 2, 'a', 'o'));
		String sCadena="AD";
		String sCadena2="DD";
		
		System.out.println("Salida: "+ ComparaAscii.compare(sCadena, sCadena2));
	}

}

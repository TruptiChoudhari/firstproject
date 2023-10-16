/**
 * 
 */
package Assignment;
import java.util.Scanner;


/**
 * @author LENOVO
 *
 */
public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SN= new Scanner(System.in);
		char gender;
		
		System.out.printf("Enter Gender");
		gender = SN.next().charAt(0);
		
		switch(gender) {
		case 'M':
		System.out.printf("Male");
		break;
		
		case 'F':
		System.out.printf("Female");
		break;
		
		default:
			System.out.printf("Unspecified");
		}

	    }

	}

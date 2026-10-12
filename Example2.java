package HelloWorld;

public class Example2 {
	public static void main(String[] args) {
		char grade = 'f';
		switch(grade) {
		case 'a' :
			System.out.println("Excellent");
		break;
		case 'b' :
		     System.out.println("very good");
		break;
		case 'c' :
		case 'd' :
		case 'f' :
		      System.out.println("Low");
		break;
		default :
			System.out.println("invalid grade");
		break;
		}
		System.out.println("out of switch");
	}
     
    		  
	
	
}

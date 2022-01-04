import java.util.HashSet;

public class TestHashSetEmptyOrNot {
	  public static void main(String[] args) {
	        
	        HashSet < String > HashSet = new HashSet < String > ();
 
	        HashSet.add("WELCOME");
		     HashSet.add("TO");
		     HashSet.add("SangamOne");

	      
	        System.out.println("HashSet: " + HashSet);

	       
	        boolean status = HashSet.isEmpty();

	      
	        System.out.println("HashSet.isEmpty(): " + status);
	    }


}

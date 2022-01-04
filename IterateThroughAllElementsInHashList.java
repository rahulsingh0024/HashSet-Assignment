import java.util.HashSet;
import java.util.Iterator;

public class IterateThroughAllElementsInHashList 
{
	  public static void main(String[] args) {
	        
	     HashSet<String> HashSet = new HashSet<String>();
	  
	     HashSet.add("WELCOME");
	     HashSet.add("TO");
	     HashSet.add("SangamOne");
         
	    Iterator<String> p =HashSet.iterator();
	    
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }
	   }
	}


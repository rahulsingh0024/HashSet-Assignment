import java.util.HashSet;

public class CompareTwoHashSet {
	
	public static void main(String args[]) {
		
	      // create hash set 1
		HashSet<String> HashSet1 = new HashSet<String>();
	      HashSet1.add("WELCOME");
	      HashSet1.add("TO");
	      HashSet1.add("SANGAMONE");
	      System.out.println("Elements in set 1 = "+HashSet1);
	      
	      // create hash set 2
	      HashSet<String> HashSet2 = new HashSet<String>();
	      HashSet2.add("WELCOME");
	      HashSet2.add("TO");
	      HashSet2.add("JAVA");
	 
	      System.out.println("Elements in set 2 = "+HashSet2);
	      System.out.println("Are both the HashSet equal? "+HashSet1.equals(HashSet2));

}
}
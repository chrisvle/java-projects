import java.util.HashMap;
import java.util.Set;    
public class Anonymous {
      public int howMany(String[] headlines, String[] messages) {
    	  	int count = 0;
        HashMap<Character, Integer> headHash = new HashMap<Character, Integer>();
        for (String h : headlines) {
	        for (char letter : h.trim().toLowerCase().toCharArray()) {
		        	if (headHash.containsKey(letter)) {
		    			headHash.put(letter, headHash.get(letter) + 1);
		    		}
		    		else {
		    			headHash.put(letter,  1);
		    		}
	        }
        }
        
        for (String s : messages) {
        		if (s.trim().equals("")) {
        			count++;
        			continue;
        		}
        		HashMap<Character, Integer> messHash = new HashMap<Character, Integer>();
            for (char letter : s.trim().toLowerCase().toCharArray()) {
		        	if (messHash.containsKey(letter)) {
		    			messHash.put(letter, messHash.get(letter) + 1);
		    		} 
		    		else {
		    			messHash.put(letter,  1);
		    		}
            }
            
            Set<Character> keys = messHash.keySet();
            boolean creatable = true;
            for (char k : keys) {
            		if (!headHash.containsKey(k) || messHash.get(k) > headHash.get(k)) {
            			creatable = false;
            		}
            }
            	if (creatable) {
            		count++;
            }
        }
        return count;
      }


public static void main(String[] args) {
	check();
}

private static void check() {
    System.out.println("Checking ...");
    String[] h = {"foobie"};
    String[] m = {"foo", "boo"};
    Anonymous p1 = new Anonymous();
    	System.out.println(p1.howMany(h, m));
}


}
//import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar
   {
      public int whichOrder(String[] available, String[] orders){
//    	   HashSet<String> better = new HashSet<String>(Arrays.asList(available));
    	  	HashSet<String> ingreds = new HashSet<String>(); 
    	  	for (int a = 0; a < available.length; a++) {
    	  		ingreds.add(available[a]);
	  	}
    	  	
    	  	int index = -1;
    	  	for (int i = 0; i < orders.length; i++) {
    	  		String[] currOrder = orders[i].split(" ");
    	  		int count = 0;
    	  		for (String s: currOrder) {
    	  			if (ingreds.contains(s)) {
    	  				count++;
    	  			}
    	  		}
    	  		
    	  		// check if all available
    	  		if (count == currOrder.length) {
    	  			index = i;
    	  			break;
    	  		}
    	  	}
    	  	return index;
      }
   }
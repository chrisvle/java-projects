import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class ClassScores {
      public int[] findMode(int[] scores) {
    	  	HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
    	  	ArrayList<Integer> modes = new ArrayList<Integer>();
        for (int i = 0; i < scores.length; i++) {
        		int num = scores[i];
        		if (counts.containsKey(num)) {
        			counts.put(num, counts.get(num) + 1);
        		}
        		else {
        			counts.put(num,  1);
        		}
        }
        int max = Collections.max(counts.values());
        for (Integer k : counts.keySet()) {
        		if (counts.get(k) == max) {
        			modes.add(k);
        		}
        }
        Collections.sort(modes);
        int[] toReturn = new int[modes.size()];
        for (int j = 0; j < modes.size(); j++) {
        		toReturn[j] = modes.get(j);
        }
        return toReturn;
      }
   }
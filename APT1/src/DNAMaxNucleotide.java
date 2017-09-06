public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) { 
    	  	int longestStrandCount = 0; 
    	  	int mostNucCount = 0;
    	  	int mostNucIndex = 0;
    	  	
    	  	for (int i = 0; i < strands.length; i++) {
    	  		int count = 0;
    	  		String word = strands[i];
    	  		int len = word.length();
    	  		for (int j = 0; j < len; j++) {
    	  			if (word.substring(j,j+1).equals(nuc)) {
    	  				count++;
    	  			}
    	  		}
    	  		if (count == mostNucCount && len < longestStrandCount) {
    	  			continue;
    	  		}
    	  		if (count >= mostNucCount && count != 0) {
    	  			mostNucCount = count; 
    	  			mostNucIndex = i;
  				longestStrandCount = len;
    	  		}
    	  		
    	  	}
    	  	
    	  	if (longestStrandCount == 0) {
    	  		return "";
    	  	}
    	  	else {
    	  		return strands[mostNucIndex];
    	  	}
      }
   }
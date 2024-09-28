package smatches;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

	 /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
      
        Map<Integer, Integer> sockCount = new HashMap<>();
        
        
        for (int sock : ar) {
            sockCount.put(sock, sockCount.getOrDefault(sock, 0) + 1);
        }
        
        int pairs = 0;
        
       
        for (int count : sockCount.values()) {
            pairs += count / 2; 
        }
        
        return pairs;
    }

}

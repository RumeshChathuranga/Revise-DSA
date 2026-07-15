package Q763;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccurrence = new  int[26];
        for(int i = 0; i<s.length();i++) lastOccurrence[s.charAt(i) -'a'] = i;

        //Iterate through the string to determine partitions
        List<Integer> results = new ArrayList<>();
        int partitionEnd = 0;
        int partitionStart = 0;

        for(int i = 0; i < s.length(); i++){
            partitionEnd = Math.max(partitionEnd, lastOccurrence[s.charAt(i) -'a']);

            //when we reach the end of the current partition
            if(i == partitionEnd){
                results.add(partitionEnd-partitionStart+1);
                partitionStart = i+1;
            }
        }
        return results;
    }
}

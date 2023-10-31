import java.util.Map;

import javax.xml.transform.Source;

import java.util.Collections;
import java.util.HashMap;
class Solution {
    public static char mostFrequentChar(String s) {
      Map <Character, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            wordCount.put(s.charAt(i), wordCount.getOrDefault(s.charAt(i), 0) + 1);
        }
    int num = 0;
    char max = 0;
    for (Map.Entry<Character, Integer> set : wordCount.entrySet()) {
      if(set.getValue() >= num) {
        num = set.getValue();
        max = set.getKey();
      }

}
            return max;

    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
      System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'


    }

  }

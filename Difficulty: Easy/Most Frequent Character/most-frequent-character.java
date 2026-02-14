import java.util.HashMap;

class Solution {
    public char getMaxOccuringChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count frequency
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        char result = 'z';
        int maxFreq = 0;
        
        // Find max frequency character
        for(char ch : map.keySet()) {
            int freq = map.get(ch);
            
            if(freq > maxFreq) {
                maxFreq = freq;
                result = ch;
            }
            else if(freq == maxFreq && ch < result) {
                result = ch;   // lexicographically smaller
            }
        }
        
        return result;
    }
}

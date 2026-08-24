class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        int[] numString1 = new int[200];
        int[] numString2 = new int[200];
        
        for(int i = 0; i < s.length(); i++){
            numString1[s.charAt(i)]++; 
        }
        for(int i = 0; i < t.length(); i++){
            numString2[t.charAt(i)]++; 
        }

        for(int i = 0; i < numString1.length; i++){
            if(numString1[i] != numString2[i]){
                return false;
            }
        }
        return true;
    }
}

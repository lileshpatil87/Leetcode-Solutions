class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hm.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (!isValid(words[i], words[i + 1], hm)) {
                return false;
            }
        }
        return true;
    }

    public boolean isValid(String w1, String w2, HashMap<Character,Integer> order){
        int minLen = Math.min(w1.length(),w2.length());
        for(int j=0;j<minLen;j++){
            char c1 = w1.charAt(j);
            char c2 = w2.charAt(j);
            if(c1 != c2){
                if(order.get(c1) < order.get(c2)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return w1.length() <= w2.length();
    }
}
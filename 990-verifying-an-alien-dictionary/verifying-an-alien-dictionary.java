class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hm.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            int minLen = Math.min(words[i].length(), words[i + 1].length());
            boolean foundDiff = false;
            for (int j = 0; j < minLen; j++) {
                char c1 = words[i].charAt(j);
                char c2 = words[i + 1].charAt(j);
                if (c1 != c2) {
                    if (hm.get(c1) > hm.get(c2)) {
                        return false;
                    }
                    foundDiff = true;
                    break;
                }
            }
            if (!foundDiff && words[i].length() > words[i + 1].length()) {
                return false;
            }
        }
        return true;
    }
}
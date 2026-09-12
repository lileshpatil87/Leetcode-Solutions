class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean isCommon = true;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()) {
                    if (c != strs[j].charAt(i)) {
                        isCommon = false;
                        break;
                    }
                } else {
                    isCommon = false;
                    break;
                }
            }
            if (!isCommon) {
                return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
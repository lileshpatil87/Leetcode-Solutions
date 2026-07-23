class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ls = new ArrayList<>();
        Map<String,List<String>> al = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] crr = strs[i].toCharArray();
            Arrays.sort(crr);
            String cr = new String(crr);
            if(al.containsKey(cr)){
                List<String> temp = al.get(cr);
                temp.add(strs[i]);
                al.put(cr,temp);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                al.put(cr,temp);
            }
        }

        for(String mp : al.keySet()){
            ls.add(new ArrayList(al.get(mp)));
        }

        return ls;
    }
}
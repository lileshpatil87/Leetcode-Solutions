class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> sc = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char c = sb.charAt(i);
            if(Character.isLetter(c)){
                continue;
            }
            if(s.charAt(i) == '('){
                sc.push(i);
            }else{
                if(!sc.isEmpty()){
                    sc.pop();
                }else{
                    sb.setCharAt(i,' ');
                }
            }
        }
        while(!sc.isEmpty()){
            sb.setCharAt(sc.pop(),' ');
        }
        return sb.toString().replace(" ","");
    }
}
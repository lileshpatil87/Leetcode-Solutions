class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> sc = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                if(s.charAt(i) == '('){
                    sc.push(i);
                }else{
                    if(sc.isEmpty()){
                        sb.setCharAt(i,' ');
                    }else{
                        sc.pop();
                    }
                }
            }
        }
        while(!sc.isEmpty()){
            sb.setCharAt(sc.pop(),' ');
        }
        return sb.toString().replace(" ","");
    }
}
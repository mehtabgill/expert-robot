class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int count=0;
        
        while(sb.length() < b.length()){
            count++;
            sb.append(a);
        }
        
        if(sb.toString().contains(b)) return count;
        if(sb.append(a).toString().contains(b)) return ++count;
        return -1;
    }
}
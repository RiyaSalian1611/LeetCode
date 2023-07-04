class Solution {
    public int reverse(int x) {
        String s = "";
        int sign = 1;
        int start = 0;
        String s1 = String.valueOf(x);
        
        if (s1.charAt(0)=='-'){
            start=1; sign= -1;}
        
        for (int i=start; i<s1.length(); i++){
            char ch = s1.charAt(i);
            s = ch+ s;
        }
        
        if (Long.parseLong(s)> Integer.MAX_VALUE)
            return 0;
        else
            return Integer.parseInt(s)*sign;
    }
}
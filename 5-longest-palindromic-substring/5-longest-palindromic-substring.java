class Solution {
    String longestPalindrome = "";
    public String longestPalindrome(String s) {
       
        int start = 0 ; int end = s.length()-1;
        for(int i=0; i< s.length(); i++){
            isPalindrome(i, i, s);
            isPalindrome(i, i+1, s);
        }
        return longestPalindrome;
    }
    
    private void isPalindrome(int start, int end, String s){
        while(start>=0 && end<=s.length()-1 && Character.compare(s.charAt(start),s.charAt(end))==0){
                longestPalindrome = s.substring(start, end+1).length() > longestPalindrome.length() ? s.substring(start, end+1) : longestPalindrome;
                start--;
                end++;
            }
    }
}
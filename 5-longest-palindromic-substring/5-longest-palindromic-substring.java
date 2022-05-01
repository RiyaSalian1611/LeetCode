class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        int mid = s.length()/2;
        int start = 0 ; int end = s.length()-1;
        for(int i=0; i< s.length(); i++){
            //odd length
            start =i;  end = i;
            while(start>=0 && end<=s.length()-1 && Character.compare(s.charAt(start),s.charAt(end))==0){
                longestPalindrome = s.substring(start, end+1).length() > longestPalindrome.length() ? s.substring(start, end+1) : longestPalindrome;
                start--;
                end++;
            }
            //even length
            start =i;  end = i+1;
            while(start>=0 && end<=s.length()-1 && Character.compare(s.charAt(start),s.charAt(end))==0){
                longestPalindrome = s.substring(start, end+1).length() > longestPalindrome.length() ? s.substring(start, end+1) : longestPalindrome;
                start--;
                end++;
            }
        }
        return longestPalindrome;
    }
}
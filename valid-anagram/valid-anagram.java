class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        if(s.equals(t))
            return true;
        
        for(int i=0; i<s.length(); i++){
            if( t.indexOf(String.valueOf(s.charAt(i)))==-1)
                return false;
            else{
                t = t.replaceFirst(String.valueOf(s.charAt(i)), "");
                // System.out.println(t);
            }
        }
        return (t.length()==0) ? true : false;
    }
}
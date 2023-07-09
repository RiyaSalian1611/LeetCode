class Solution {
    public int firstUniqChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for(char c='a'; c<='z'; c++){
            map.put(c, -1);
            }
        for(char c='A'; c<='Z'; c++){
            map.put(c, -1);
            }
        for(int i=0; i< s.length(); i++){
            if(map.get(s.charAt(i)) >= 0)
                map.put(s.charAt(i), -2);
            else if (map.get(s.charAt(i)) == -1)
                map.put(s.charAt(i), i);    
        }
        for(int value: map.values()){
            if (value>=0 && value<minIndex)
                minIndex = value;
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
   }
}
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b)-> (a[0]==b[0])? Integer.compare(b[1], a[1]): Integer.compare(a[0], b[0]));
        
        int maxDefense = properties[properties.length-1][1];
        int weakPairCount = 0;
        
        for(int i=properties.length-2; i>=0; i--){            
                if(properties[i][1] < maxDefense)
                    weakPairCount++;
                else
                    maxDefense = properties[i][1];
        }
        return weakPairCount;
    }
}
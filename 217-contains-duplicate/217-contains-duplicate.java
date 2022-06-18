import java.io.*;
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(!ht.containsKey(nums[i]))
                ht.put(nums[i], nums[i]);
            else
                return true;
        }
        return false;
    }
}
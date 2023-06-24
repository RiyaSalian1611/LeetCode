class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        List<Integer> list = new ArrayList<Integer>();
        int lenCount = digits.length;
        while(lenCount!=0){
            int dig  = digits[lenCount-1];
            if(carry!=0)
                dig += carry;
            list.add(dig%10);
            carry = dig/10;
            lenCount--;
        }
        if(carry!=0)
            list.add(carry);
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
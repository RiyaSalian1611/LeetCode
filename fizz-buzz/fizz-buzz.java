class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i=1; i<=n; i++){
            String i_res = "";
            if(i%3==0 && i%5==0)
                i_res = "FizzBuzz";
            else if(i%3==0)
                i_res = "Fizz";
            else if(i%5==0)
                i_res = "Buzz";
            else
                i_res = String.valueOf(i);
            res.add(i_res);
        }
        return res;
    }
}
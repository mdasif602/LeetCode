Intuition
We can easily do this ques in a line using inbuilt function like in java we can usereturn s.toLowerCase(); but I want to do this using ascii value whose 
time complexity will not that good but we surely learn to work with ascii value.

Approach
Here We can first check if the character is capital or not using ascii value and if it will then we can add 32 to the ascii number to that capital 
character that will give us lower case ascii value of that character then we can simply that.

Complexity
Time complexity:
O(n)

Space complexity:
Code

class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase();
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            if ((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90){
                int res = (int)s.charAt(i) + 32;
                ans += (char)res;
            }
            else{
                ans += s.charAt(i);
            }
        }

        return ans;
    }
}

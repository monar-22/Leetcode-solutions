class Solution {
    public boolean isPalindrome(String s) {
    
        s = s.toLowerCase();
        String res = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder reversed = new StringBuilder(res);
        reversed.reverse();
        return res.equals(reversed.toString());
    }
}

class Solution {
    public boolean checkIfPangram(String sentence) {
        int l=sentence.length();
        if(l<26)
            return false;
        HashSet<Character> check = new HashSet<Character>();
        for(char c:sentence.toCharArray()){
            check.add(c);
        }
        return check.size() == 26;
    }
}
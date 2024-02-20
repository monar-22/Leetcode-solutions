class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        StringBuilder reversed = new StringBuilder();
        for(String word : words){
            for(int i=word.length()-1;i>=0;i--){
                reversed.append(word.charAt(i));
            }
            reversed.append(" ");
        }
        reversed.deleteCharAt(reversed.length()-1);
        return reversed.toString();
    }
}
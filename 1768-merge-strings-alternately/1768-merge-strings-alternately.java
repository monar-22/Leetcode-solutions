class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int min=Math.min(len1,len2);
        String lstr=" ";
        if(min==len1)
            lstr=word2;
        if(min==len2)
            lstr=word1;
        char chars1[]=word1.toCharArray();
        char chars2[]= word2.toCharArray();
        StringBuilder newstr = new StringBuilder();
        for(int i=0;i<min;i++){
            newstr.append(chars1[i]);
            newstr.append(chars2[i]);
        }
        newstr.append(lstr.substring(min));
        return newstr.toString();
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        int l=candyType.length;
        int able=l/2;
        int max=0;
        HashSet hs = new HashSet();
        for(int i=0;i<l;i++){
            hs.add(candyType[i]);
        }
        if(hs.size()>=able){
            max=able;
        }
        else
            max=hs.size();
        return max;
    }
}
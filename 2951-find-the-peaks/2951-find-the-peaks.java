class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int len=mountain.length;
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<len-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
                arr.add(i);
        }
        return arr;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int arr[]= new int[nums1.length+nums2.length];
        
        double median;
        int l=arr.length;
        int j=0;
        for(int i=0;i<l;i++){
            if(i<=nums1.length-1)
            arr[i]=nums1[i];
            else{
                arr[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            int n1=arr[(l/2)-1];
            int n2=arr[l/2];
            median=(double)(n1+n2)/2;
        }
        else{
            int n1=arr[l/2];
            median=(double)(n1);
        }
        return median;
    }
}
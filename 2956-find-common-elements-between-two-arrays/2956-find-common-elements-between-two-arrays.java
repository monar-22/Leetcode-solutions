class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int arr[]= new int[2];
        int c1=0,c2=0;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(nums1[i]==nums2[j]){
                    c1++;
                    break;
                }
            }
        }
        for(int i=0;i<l2;i++){
            for(int j=0;j<l1;j++){
                if(nums2[i]==nums1[j]){
                    c2++;
                    break;
                }
            }
        }
        arr[0]=c1;
        arr[1]=c2;
        return arr;
        
    }
}
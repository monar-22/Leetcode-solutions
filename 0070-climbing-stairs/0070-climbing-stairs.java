class Solution {
    public int climbStairs(int n) {
    int prev1=1;
    int prev=1;
    for(int i=2;i<=n;i++){
        int curr=prev1+prev;
        prev1=prev;
        prev=curr;
    }
        return prev;
    }
}
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int len = operations.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                res -= 1;
            }
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                res += 1;
            }
        }
        return res;
    }
}

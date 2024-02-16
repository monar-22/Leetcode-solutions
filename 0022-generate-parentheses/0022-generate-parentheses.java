class Solution {
    public void solver(int open, int close,List<String> res, String str){
        if(open == 0 && close == 0){
            res.add(str);
            return;
        }

        if(open > 0){
            solver(open-1, close, res,str + "(");
        }
        if(close > open){
            solver(open,close-1,res, str+ ")");
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        solver(n,n,res,"");
        return res;
        
    }
}
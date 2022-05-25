//TC : O(n)
//SC : O(H) H=hieght of tree
class Solution {
   private List<Integer> list;
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<>();
        dfs(root,0);
        return list;
    }
    private void dfs(TreeNode root, int level){
        
        if(root==null) return;
        
        if(level==list.size()) list.add(root.val);
        
        if(root.right!=null) dfs(root.right,level+1);
        if(root.left!=null) dfs(root.left,level+1);
    }
}

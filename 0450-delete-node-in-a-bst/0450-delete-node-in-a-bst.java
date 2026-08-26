
class Solution {
    public TreeNode iop(TreeNode root){
        TreeNode temp=root.left;
        while(temp.right!=null) temp=temp.right;
        return temp;
    }
    public TreeNode parent(TreeNode root,TreeNode pred){
        if(root.left==pred || root.right==pred) return root;
        TreeNode temp=root.left;
        while(temp.right!=pred) temp=temp.right;
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val == key){
        //Case 1: zero child
        if(root.left==null && root.right==null) return null;
        //Case 2: one child
        else if(root.left==null || root.right==null){
            if(root.right==null) return root.left;
            else return root.right;
        }
         // case 3: two child
            else{
           TreeNode pred=iop(root);
           TreeNode predparent=parent(root,pred);
           if(root==predparent){
            pred.right=root.right;
            return pred;
           }
           predparent.right=pred.left;
           pred.left=root.left;pred.right=root.right;
           return pred; 
            }
        }
        else if(root.val>key){
            root.left= deleteNode(root.left,key);
        }
        else{
            root.right= deleteNode(root.right,key);
        }
     return root;
    }
}
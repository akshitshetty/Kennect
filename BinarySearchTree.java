//Below demonstrates BST insertion ,search and to find smallest value using recursion
public class BinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    TreeNode root;
    BinarySearchTree(){
        root=null;
    }
    BinarySearchTree(int val){
        root=new TreeNode(val);
    }
    public void insert(int val){                        //method to insert node value
        root=insertNode(root,val);                      //calls the recursive method to add the node
    }
    public TreeNode insertNode(TreeNode root, int val){ //recursive method to traverse 
        
        if(root == null ){
            root=new TreeNode(val);
            return root;
        }
        if(root.val==val)
            return null;                                //since duplicate values cannot be added
        else if (root.val > val)
            root.left=insertNode(root.left, val);
        else if (root.val < val)
            root.right=insertNode(root.right, val);
        
        return root;
    }

    public boolean search(int key)  {                   //search method returns boolean value if the tree contains a particular value
        root = searchNode(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
    public TreeNode searchNode(TreeNode root,int val){  
        if(root==null || root.val==val){
            return root;
        }
        if(root.val < val){
            return searchNode(root.right , val);
        }
        else{
            return searchNode(root.left , val);
        }
    }
    public int minValue(TreeNode root)  {           //method to find the smallest value in the tree
        //initially minval = root
        int minval = root.val; 
        //find minval
        while (root.left != null)  { 
            minval = root.left.val; 
            root = root.left; 
        } 
        return minval; 
    }
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(100);
        tree.insert(200);
        tree.insert(300);
        tree.insert(400);
        tree.insert(500);
        tree.insert(600);
        tree.insert(700);

        System.out.println(tree.minValue(tree.root));
    }
}

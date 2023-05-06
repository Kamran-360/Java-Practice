//Print and insert in binary tree
class BinaryTree{
    private TreeNode root;

    private static class TreeNode{
        private int data;
        private TreeNode left,right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode insertNode(int data,TreeNode current){
        //current is the root reference
        if(current==null){
            current = new TreeNode(data);
            return current;
        }

        if(data < current.data){
            current.left = insertNode(data,current.left);
        }
        else if (data > current.data){
            current.right = insertNode(data,current.right);
        }
        else {
            System.out.println("Node already exists!");
            return null;
        }
        return current;
    }

    public static void inorderTraversal(TreeNode current){
        if(current == null){
            return;
        }
            //Recursively traversing inorderly and printing
            printTree(current.left);
            System.out.println(current.data + " ");
            printTree(current.right);
    }
    
    public static void preorderTraversal(TreeNode current){
        if(current == null){
            return;
        }
            //Recursively traversing preorderly and printing
            System.out.println(current.data + " ");
            printTree(current.left);
            printTree(current.right);
    }
    
    public static void postorderTraversal(TreeNode current){
        if(current == null){
            return;
        }
            //Recursively traversing postorderly and printing
            printTree(current.left);
            printTree(current.right);
            System.out.println(current.data + " ");
    }
    //level by level
     public static void levelorderTraversal(TreeNode current){
          if (current == null){
             return;
          }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(current);

       while (!queue.isEmpty()){
         Node running = queue.remove();
         System.out.print(running.value + " ");
         if (current.left != null) { queue.add(running.left);}
         if (current.right != null) {queue.add(running.right);}
       }
    }
    

    public static void main(String[] args) {
        //creating the binary tree
        TreeNode root = new TreeNode(1);
        BinaryTree tree = new BinaryTree(root);
        tree.insertNode(0, tree.root);
        tree.insertNode(2, tree.root);
        tree.insertNode(3, tree.root);
        tree.insertNode(6, tree.root);
        tree.insertNode(9, tree.root);
        inorderTraversal(tree.root);   //left root right
        preorderTraversal(tree.root);  //root left right
        postorderTraversal(tree.root); //left right root
        levelorderTraversal(tree.root);//all nodes at level one then all nodes at level 2 ... till null
    }

}



// In computer science, there are four common ways to traverse a binary tree, which are:

// Inorder traversal: In this traversal, the nodes of the binary tree are visited in the order of left child, root, and right child. In other words, we first visit the
// left subtree of a node, then the node itself, and finally the right subtree. Inorder traversal of a binary search tree will give us nodes in non-decreasing order.

// Preorder traversal: In this traversal, the nodes of the binary tree are visited in the order of root, left child, and right child. In other words, we first visit
// the node itself, then its left subtree, and finally its right subtree.

// Postorder traversal: In this traversal, the nodes of the binary tree are visited in the order of left child, right child, and root. In other words, we first visit
// the left subtree, then the right subtree, and finally the node itself.

// Level order traversal: In this traversal, the nodes of the binary tree are visited level by level, from top to bottom and from left to right. In other words, we first visit the root, then its left and right children, then the children of its left child (if any), then the children of its right child (if any), and so on, until we have visited all the nodes.

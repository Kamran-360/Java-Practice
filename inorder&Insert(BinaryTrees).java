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

    public static void printTree(TreeNode current){
        if(current == null){
            return;
        }
            System.out.println(current.data + " ");
            //Recursively traversing and printing
            printTree(current.left);
            printTree(current.right);

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
        printTree(tree.root);

    }

}

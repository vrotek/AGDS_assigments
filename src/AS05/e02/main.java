package AS05.e02;

import AS05.TreeLib.IBinaryTree;
import AS05.TreeLib.LinkedBinaryTree;
import AS05.TreeLib.LinkedTreeNode;

public class main {

    public static LinkedTreeNode<Integer> prev;

    public static boolean isBinarySearchTree(LinkedTreeNode<Integer> root){
        return checkBST(root);
    }

    public static boolean checkBST(LinkedTreeNode<Integer> root){
        if(root != null){
            if(!checkBST(root.left())){
                return false;
            }

            if(prev != null && root.getValue() <= prev.getValue()){
                return false;
            }

            prev = root;

            return checkBST(root.right());
        }
        return true;


    }

    public static void main(String[] args) {
        IBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        LinkedTreeNode<Integer> root = (LinkedTreeNode<Integer>) tree.addRoot(5);
        tree.addLeft(root,2);
        tree.addRight(root,7);
        tree.addLeft(root.left(),1);
        tree.addRight(root.left(),4);
        tree.addLeft(root.right(),6);
        tree.addRight(root.right(),10);

        if(isBinarySearchTree((LinkedTreeNode<Integer>) tree.root())){
            System.out.println("This is a Binary Search Tree");
        }else {
            System.out.println("This is not a Binary Search Tree");
        }
    }
}

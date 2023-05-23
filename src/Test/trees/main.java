package Test.trees;

import java.util.ArrayList;
import java.util.Random;

public class main {

    public static ITree<Integer> createTree(){
        Random r = new Random();
        ITree<Integer> tree = new Tree<Integer>(r.nextInt(0,100));
        tree.addChild(tree.root(),r.nextInt(0,100));
        ITreeNode<Integer> node = tree.addChild(tree.root(),r.nextInt(0,100));
        tree.addChild(tree.root(),r.nextInt(0,100));
        tree.addChild(tree.root(),r.nextInt(0,100));
        tree.addChild(node,r.nextInt(0,100));
        tree.addChild(node,r.nextInt(0,100));


        return tree;
    }

    public static int height(ITree<Integer> tree,ITreeNode<Integer> node){

        int height = 0;
        for (ITreeNode<Integer> n: tree.children(node)) {
            height = Math.max(height,1 + height(tree,n));
        };

        return height;
    }

    public static int depth(ITree<Integer> tree, ITreeNode<Integer> node){
        if(tree.isRoot(node)){
            return 0;
        }else {
            return 1 + depth(tree,node.parent());
        }
    }

    public static void main(String[] args) {
        ITree<Integer> tree = createTree();
        System.out.println("height of tree: " + height(tree,tree.root()));
        System.out.println("depth of tree: " + depth(tree,tree.getChildren(tree.root()).get(1).getChildren().get(0)));
    }
}

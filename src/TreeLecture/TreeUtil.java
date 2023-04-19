package TreeLecture;

public class TreeUtil {

    public static int depth(ITree tree,Node v){
        if(tree.isRoot(v)){
            return 0;
        }else {
            return 1 + depth(tree, tree.parent(v));
        }
    }

    public static int height(ITree tree){
        return 0;
    }

}

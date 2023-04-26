package AS05.e03;

import AS05.TreeLib.IBinaryTree;
import AS05.TreeLib.LinkedBinaryTree;
import AS05.TreeLib.LinkedTreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ExpressionEvaluator {

    public IBinaryTree<String> tree(String e){
        List<String> exp = parseExpString(e);
        IBinaryTree<String> tree = new LinkedBinaryTree<>();

        tree.addRoot(treeHelper(exp,null));

        return tree;
    }

    public double eval(IBinaryTree<String> t){
        return evalHelper((LinkedTreeNode<String>) t.root());
    }

    public double evalHelper(LinkedTreeNode<String> node) throws NumberFormatException{

            if(node == null){
                return 0.0;
            }
            String value = node.getValue();
            switch (value){
                case "+": {
                    return evalHelper(node.left()) + evalHelper(node.right());
                }
                case "-": {
                    return evalHelper(node.left()) - evalHelper(node.right());
                }
                case "*": {
                    return evalHelper(node.left()) * evalHelper(node.right());
                }
                case "/": {
                    return evalHelper(node.left()) / evalHelper(node.right());
                }
                default: {

                    return Double.parseDouble(node.getValue());
                }
            }

    }

    public String infix(IBinaryTree<String> t){
        return infixHelper((LinkedTreeNode<String>) t.root());
    }

    public String infixHelper(LinkedTreeNode<String> node){
        if(node == null){
            return "";
        }

        if(node.left() == null && node.right() == null){
            return node.getValue();
        }
        String leftStr = infixHelper(node.left());
        String rightStr = infixHelper(node.right());

        return "(" + leftStr + " " + node.getValue() + " " + rightStr + ")";
    }

    private List<String> parseExpString(String expString){
        return new ArrayList<>(Arrays.asList(expString.split(" ")));
    }

    private LinkedTreeNode<String> treeHelper(List<String> exp,LinkedTreeNode<String> prev){
        if(exp.size() == 0){
            return prev;
        }
        String element = exp.get(0).replace(",",".");
        exp.remove(0);
        LinkedTreeNode<String> leaf = new LinkedTreeNode<String>(element);
        if(isNumeric(element)){

            if(prev != null){
                leaf.setParent(prev);
            }
            return leaf;
        }

        LinkedTreeNode<String> node = new LinkedTreeNode<>(element);

        LinkedTreeNode<String> left = treeHelper(exp,node);
        LinkedTreeNode<String> right = treeHelper(exp,node);


        node.setLeft(left);
        node.setRight(right);
        return node;
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}

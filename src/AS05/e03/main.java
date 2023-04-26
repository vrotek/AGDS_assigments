package AS05.e03;

import AS05.TreeLib.IBinaryTree;

public class main {

    public static String[] testExpressions = {
            "+ 2 3",
            "* 9 - 7 5",
            "- + * 5 4 3 2",
            "+ + / 1 2 / 1 3 / 1 4",
            "+ - * / 1.1 2.2 3.3 4.4 5.5",
            "+ - + - + - + - 10 9 8 7 6 5 4 3 2 1",
            "- + - + - + - + - 10,0 9 8 7 6 5 4 3 2 1"
    };
    public static void main(String[] args) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();

        for (String exp:testExpressions) {
            IBinaryTree<String> tree = evaluator.tree(exp);
            System.out.println(evaluator.infix(tree) + " = " + evaluator.eval(tree));
        }
    }
}

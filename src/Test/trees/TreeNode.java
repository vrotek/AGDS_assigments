package Test.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<E> implements ITreeNode<E> {

    private E value;
    private ITreeNode<E> parent = null;
    private List<ITreeNode<E>> children;

    public TreeNode(E value){
        this.value = value;
        this.children = new ArrayList<>();
    }


    @Override
    public E getValue() {
        return this.value;
    }

    @Override
    public ITreeNode<E> parent() {
        return this.parent;
    }

    public void setParent(ITreeNode<E> parent) {
        this.parent = parent;
    }

    @Override
    public Iterable<ITreeNode<E>> children() {
        return this.children;
    }

    public List<ITreeNode<E>> getChildren(){
        return this.children;
    }

    public void addChild(ITreeNode<E> child) {
        this.children.add(child);
    }

    @Override
    public int numChildren() {
        return this.children.size();
    }
}

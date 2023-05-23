package Test.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Tree<E> implements ITree<E> {

    protected ITreeNode<E> root;
    protected int size;

    public Tree(E e){
        this.root = new TreeNode<E>(e);
        this.size = 1;
    }

    @Override
    public ITreeNode<E> root() {
        return this.root;
    }

    @Override
    public ITreeNode<E> parent(ITreeNode<E> node) {

        return node.parent();
    }

    @Override
    public Iterable<ITreeNode<E>> children(ITreeNode<E> node) {
        return node.children();
    }

    public List<ITreeNode<E>> getChildren(ITreeNode<E> node){
        return node.getChildren();
    }

    @Override
    public int numChildren(ITreeNode<E> node) {
        return node.numChildren();
    }

    @Override
    public boolean isExternal(ITreeNode<E> p) {
        return p.numChildren() == 0;
    }

    @Override
    public boolean isInternal(ITreeNode<E> p) {
        return p.numChildren() != 0;
    }

    @Override
    public boolean isRoot(ITreeNode<E> p) {
        return p == this.root;
    }

    @Override
    public ITreeNode<E> addChild(ITreeNode<E> node, E value) {
        ITreeNode<E> newNode = new TreeNode<E>(value);
        newNode.setParent(node);
        node.addChild(newNode);
        return newNode;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<ITreeNode<E>> positions() {
        return null;
    }


}

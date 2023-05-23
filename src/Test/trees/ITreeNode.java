package Test.trees;

import java.util.List;

public interface ITreeNode<E> extends INode<E> {

    public ITreeNode<E> parent();
    public Iterable<ITreeNode<E>> children();

    public List<ITreeNode<E>> getChildren();

    public int numChildren();

    public void setParent(ITreeNode<E> p);

    public void addChild(ITreeNode<E> child);

}

package Test.trees;

import java.util.Iterator;
import java.util.List;

public interface ITree<E> extends Iterable<E>  {

    //Access Methods
    public ITreeNode<E> root();

    public ITreeNode<E> parent(ITreeNode<E> node);
    public Iterable<ITreeNode<E>> children(ITreeNode<E> node);
    public int numChildren(ITreeNode<E> node);

    //Query methods
    boolean isExternal(ITreeNode<E> p);
    boolean isInternal(ITreeNode<E> p);
    boolean isRoot(ITreeNode<E> p);

    //Set Methods

    public ITreeNode<E> addChild(ITreeNode<E> node, E value);

    public List<ITreeNode<E>> getChildren(ITreeNode<E> node);


    int size();
    boolean isEmpty();
    Iterator<E> iterator();

    Iterable<ITreeNode<E>> positions();

}

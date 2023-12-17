public interface Collection<E>{
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(E element);
    boolean remove(Object element);
    void clear();
//    Iterator<E> iterator();
//    boolean containsAll(Collection<?> c);
//    boolean addAll(Collection<? extends E> c);
//    boolean removeAll(Collection<?> c);
//    boolean retainAll(Collection<?> c);
}

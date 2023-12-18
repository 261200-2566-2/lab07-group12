public interface SetI<E> extends Collection<E>{
    boolean containsAll(Set<?> c);
    boolean addAll(Set<? extends E> c);
    boolean removeAll(Set<?> c);
    boolean retainAll(Set<?> c);
}

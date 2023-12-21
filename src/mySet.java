//Interfaces
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
//Class
import java.util.HashMap;
public class mySet<E> implements Set<E>{
    HashMap<E,Boolean> hashMap = new HashMap<>();
    public Iterator<E> iterator() {
        return hashMap.keySet().iterator();
    }
    public int size() {
        return hashMap.size();
    }
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }
    public boolean contains(Object o) {
        return hashMap.containsKey(o);
    }
    public Object[] toArray() {
        return new Object[0];
    }
    public <T> T[] toArray(T[] a) {
        return null;
    }
    public boolean add(E e) {
        return hashMap.put(e,true) != null;
    }
    public boolean remove(Object o) {
        return hashMap.remove(o);
    }
    public boolean containsAll(Collection<?> c) {
        for(Object e:c){
            if(!hashMap.containsKey(e)) return false;
        }
        return true;
    }
    public boolean addAll(Collection<? extends E> c) {
        boolean isAdd = false;
        for (E e:c){
            isAdd = true;
            add(e);
        }
        return isAdd;
    }
    public boolean retainAll(Collection<?> c) {
        boolean isChange = false;
        Iterator<E> hashMapIterator = iterator();
        while (hashMapIterator.hasNext()){
            E e = iterator().next();
            if (!c.contains(e)){
                hashMapIterator.remove();
                isChange = true;
            }
        }
        return isChange;
    }
    public boolean removeAll(Collection<?> c) {
        boolean isChange = false;
        Iterator<E> hashMapIterator = iterator();
        while(hashMapIterator.hasNext()){
            E e = hashMapIterator.next();
            if(c.contains(e)){
                hashMapIterator.remove();
                isChange = true;
            }
        }
        return isChange;
    }
    public void clear() {
        hashMap.clear();
    }
    //Legacy Code
    /*
    private HashMap<E,Boolean> hashMap = new HashMap<E,Boolean>();
    public int size() {
        return hashMap.size();
    }
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }
    public boolean contains(Object element) {
        return hashMap.containsKey(element);
    }
    public boolean add(E element) {
        return hashMap.put(element,true) != null;
    }

    public boolean remove(Object element) {
        return hashMap.remove(element) != null;
    }
    public void clear() {
        hashMap.clear();
    }

    public boolean containsAll(Set<?> subSet) {
        for(Object elementInSubSet:subSet.hashMap.keySet()){
            if(!hashMap.containsKey(elementInSubSet))
                return false;
        }
        return true;
    }
    public boolean addAll(Set<? extends E> set) {
        boolean isAdd = false;
        for(E elementInSet:set.hashMap.keySet()){
            if(!hashMap.containsKey(elementInSet)) {
                add(elementInSet);
                isAdd = true;
            }
        }
        return isAdd;
    }
    public boolean removeAll(Set<?> subSet) {
        boolean isRemove = false;
        for(Object elementInSubSet:subSet.hashMap.keySet()){
            if(hashMap.containsKey(elementInSubSet)){
                hashMap.remove(elementInSubSet);
                isRemove = true;
            }
        }
        return isRemove;
    }
    public boolean retainAll(Set<?> subSet) {
        boolean intersect = false;
        HashMap<E,Boolean> newHashMap = new HashMap<>(hashMap);
        for (E element : newHashMap.keySet()){
            if(!subSet.contains(element)){
                hashMap.remove(element);
                intersect = true;
            }
        }
        return intersect;
    }*/
}

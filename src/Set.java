import java.util.HashMap;
public class Set<E>implements SetI<E>{
    private final HashMap<E,Boolean> hashMap = new HashMap<E,Boolean>();
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
    }
}

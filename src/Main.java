import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        mySet<String> a = new mySet<>();
//        mySet<String> b = new mySet<>();
        a.add("aa");
        a.add("bb");
//        a.add("cc");
//        b.add("bb");
//        b.add("cc");
//        b.add("aa");
////        b.add("gg");
////        System.out.println(a.containsAll(b)?"Yes":"No");
////        System.out.println(a.removeAll(b)?"Yes":"No");
////        System.out.println(a.size());
////        System.out.println(a.removeAll(b)?"Yes":"No");
////        System.out.println(a.addAll(b)?"Yes":"No");
//        System.out.println(a.retainAll(b)?"Yes":"No");
//        System.out.println(a.size());
//        a.clear();
//        System.out.println(a.size());
        System.out.println(a.iterator().hasNext()?"has next":"no");
    }
}
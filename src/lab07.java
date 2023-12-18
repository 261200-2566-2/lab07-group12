// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class lab07 {
    public static void main(String[] args) {
        Set<String> a = new Set<String>();
            System.out.println("Is set a Empty : " + a.isEmpty());
        a.add("aa");
        a.add("bb");
            System.out.println("Set a size : " + a.size());
        Set< Integer > b = new Set< Integer >();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(3);
            System.out.println("Is b contain ( 1 ) : " + b.contains(1));
            System.out.println("Set b size : " +b.size());
            System.out.println("Remove 1 from b : " +b.remove(1));
            System.out.println("Remove 1 from b : " +b.remove(1));        //no more 1 for remove
            System.out.println("Set b size : " +b.size());
        b.clear();                      //size clear = Empty
            System.out.println("Set b Cleared size : " +b.size());
        Set< Integer > c = new Set< Integer >();
        c.add(2);
        c.add(3);
        System.out.println("b is subset c : " + ( c.containsAll(b)?"Yes":"No"));     //empty set is subset for everything
        b.add(4);
        System.out.println("b is subset c : " + ( c.containsAll(b)?"Yes":"No"));
        b.remove(4);
        b.add(2);
        System.out.println("b is subset c : " + ( c.containsAll(b)?"Yes":"No"));

        System.out.println("Set b size : " +b.size());  //b={2}
        System.out.println("Set c size : " +c.size());  //c={2,3}
        b.add(5);
        b.add(6);    //b={2,3,5,6}
        System.out.println("b union c :  "+ (b.addAll(c) ? "Yes" : "No")+"    Set b size : "+b.size());    //b={2,3,5,6}
        b.clear();
        System.out.println("b union c : "+ (b.addAll(c) ? "Yes" : "No")+"    Set b size : "+b.size());   //b={2,3}

        b.add(1);  //b={1,2,3}   , c={2,3}
        System.out.println("b - c : "+(b.removeAll(c)? "Yes" : "No")+"    Set b size : "+b.size());

        Set< Integer > d = new Set< Integer >();   //Emptyset
        System.out.println("b intersect d : "+(b.retainAll(d)? "Yes" : "No")+"    Set b size : "+b.size());
        b.add(1);
        b.add(2);
        d.add(1);

        System.out.println("b intersect d : "+(b.retainAll(d)? "Yes" : "No")+"    Set b size : "+b.size());

    }
}
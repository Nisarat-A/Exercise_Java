import java.util.*;

public class Lazy_ColArrList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Black");
        color.add("White");
        color.add("Pink");
        System.out.println("List Before swap :" );
        for (String i : color) {
            System.out.println(i);
        }
        Collections.swap(color, 0, 2);
        System.out.println("List After swap :" );
        for (String i : color) {
            System.out.println(i);
        }
        System.out.println("List Before shuffle :"+color);
        Collections.shuffle(color);
        System.out.println("List After shuffle :"+color);
        //clone
        ArrayList<String> c2 =  (ArrayList<String>)color.clone();
        System.out.println("List After clone :"+c2);
        //empty
        color.removeAll(color);
        System.out.println("List After empty :"+color);
        //check is empty?
        System.out.println("is color empty ? : " + color.isEmpty());
        System.out.println("is c2 empty ? : " + c2.isEmpty());
        //Trim Size
        ArrayList<String> c3 = new ArrayList<String>();
        c3.add("Red");
        c3.add("Green");
        c3.add("Black");
        c3.add("White");
        c3.add("Pink");
        System.out.println("List Before trim :"+c3);
        c3.trimToSize();
        System.out.println("List After trim :"+c3);
        ArrayList<String> n = new ArrayList<String>(3);
        n.add("1");
        n.add("2");
        n.add("3");
        System.out.println("List n :"+ n );
        n.ensureCapacity(6);
        n.add("4");
        n.add("5");
        n.add("6");
        System.out.println("List n :"+ n );
        System.out.println("List n size :"+ n.size() );
        System.out.println("list [2] : "+ n.get(2) );
        String nn = "7";
        n.set(2, nn);
        System.out.println("list [2] : "+ n.get(2) );
        int num = n.size();
        for (int i = 0; i < num; i++) {
            System.out.println("list ["+i+"] : "+ n.get(i) );
        }
        
}}

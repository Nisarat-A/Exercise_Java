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


    }
}

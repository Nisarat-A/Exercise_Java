import java.util.*;
public class ColArrList_compare {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Black");
        color.add("White");
        color.add("Pink");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("White");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List1 :" + color);
        System.out.println("List2 :" + c2);
        // Compare list1 and list2
        ArrayList<String> color3 = new ArrayList<String>();
        for (String i :color)
            color3.add(c2.contains(i) ? "Yes" : "No");
        System.out.println(color3);
    }
}

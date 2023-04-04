import java.util.*;
public class ColArrList_reverse {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        System.out.println("before reverse : \n" +color);
        Collections.reverse(color);
        System.out.println("after reverse : \n" +color);
    }
}

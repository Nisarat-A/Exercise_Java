import java.util.*;
public class ColArrList_Sort {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        System.out.println("before sort " +color);
        Collections.sort(color);
        System.out.println("after sort " +color);

    }
}

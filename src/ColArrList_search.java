import java.util.ArrayList;
public class ColArrList_search {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        System.out.println("List :" + color);

        if (color.contains("Red")) {
            System.out.println("Red is in the list");
        } else {
            System.out.println("Red is not in the list");
        }
    }
}

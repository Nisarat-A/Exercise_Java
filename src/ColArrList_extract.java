import java.util.*;
public class ColArrList_extract {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        System.out.println("Original_List :" + numbers);
        List<String> sub_list = numbers.subList(0,2);
        System.out.println("Sub_List :" + sub_list);
    }
}

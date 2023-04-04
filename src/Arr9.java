import java.util.Arrays;

public class Arr9 {


    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index_position  = 2;
        int new_value = 5;
        System.out.println("origin : "+Arrays.toString(my_array));
        for (int i = my_array.length -1 ; i > index_position ; i--)
        {my_array[i] = my_array[i-1];}
        my_array[index_position] = new_value;
        System.out.println("add new : " + Arrays.toString(my_array));
    }
}

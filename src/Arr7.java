import java.util.Arrays;

public class Arr7 {
    public static void main(String[] args) {
        int[] myarr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(myarr);

        System.out.println("original = " + Arrays.toString(myarr));
        int removeIndex = 1 ;
        for (int i=removeIndex; i < myarr.length -1 ;i++)
        {myarr[i] = myarr[i+1];}
        //after remove
        Arrays.sort(myarr);
        System.out.println("original = " + Arrays.toString(myarr));

    }
}

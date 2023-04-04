import java.util.Arrays;
public class Arr8 {
    public static void main(String[] args) {
        int[] myarr = {1,2,3,4,5};
        int [] new_arr = new int[5];
        Arrays.sort(myarr);
        System.out.println(Arrays.toString(myarr));
    for (int i = 0 ; i<myarr.length;i++) {
        new_arr[i] = myarr[i];}
        System.out.println(Arrays.toString(new_arr));
    }

}

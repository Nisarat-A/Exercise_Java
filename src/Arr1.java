import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        int myArr[] = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String myArr_2[] = {"Java","Python","PHP","Ruby","R","HTML","CSS","mySQL"};
        System.out.println("original numeric " + Arrays.toString(myArr));
        Arrays.sort(myArr);
        System.out.println("original numeric " + Arrays.toString(myArr));

        System.out.println("original String " + Arrays.toString(myArr_2));
        Arrays.sort(myArr_2);
        System.out.println("original String " + Arrays.toString(myArr_2));


    }
}

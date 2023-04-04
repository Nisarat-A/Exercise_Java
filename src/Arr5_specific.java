public class Arr5_specific {
    public static boolean containers(int[] arr , int item){
        for (int n: arr){
            if (n == item) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] myarr_1 = { 1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(containers(myarr_1,6549));
        System.out.println(containers(myarr_1,2456));

    }
}

public class Arr6 {
    public static int findmyIndex(int[] myarr , int num){
        if (myarr == null) return -1;
        int len = myarr.length;
        int i =0 ;
        while (i<len){
            if (myarr[i] == num)  return i; else i++;
        } return -1;
    }

    public static void main(String[] args) {
        int[] myarr = {24,15,67,99,27,88,40};
        System.out.println("index of 99 is "+findmyIndex(myarr,99));
    }
}

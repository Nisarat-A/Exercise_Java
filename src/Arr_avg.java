public class Arr_avg {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,45,60,34,28,92,57,83,29,-15,-16,-50} ;
        int sum = 0;
        for (int i = 0 ; i < numbers.length ; i++){
            sum = sum + numbers[i] ;
        }
        double average = sum/ numbers.length;
        System.out.println(average);
    }
}

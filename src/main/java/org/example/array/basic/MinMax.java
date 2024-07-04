package array.basic;



public class MinMax {
    public static void main(String[] args) {

        int[] arr = {1,4,6,8,3,9};
        System.out.println(findMin(arr));

    }


    public  static  int findMin(int[] arr){

        if(arr.length == 0 || arr == null){
            throw  new ArithmeticException("Array must not be null");
        }

        int min = arr[0];

        for(int i=0 ; i < arr.length ; i ++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return  min;
    }
}

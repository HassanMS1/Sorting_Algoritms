import java.util.Arrays;

public class BubbleSort {

    public static void bubblesort(int [] arr){

        for (int i=0; i<arr.length-1;i++)
        {
            // i will make j run again until all numbers are sorted
            //if array size is 5, j will compare run 4 which is one less than array becaus
               for (int j=0;j<arr.length-1;j++ ) //
               {
                   if(arr[j]>arr[j+1])
                   {
                    swap(arr,j,j+1);
                   }

               }

        }



    }


    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;

    }



    public static void main(String[] args) {
        int [] arr = {5,8,3,2,9};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }


}

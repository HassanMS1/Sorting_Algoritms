import java.util.Arrays;

public class QuicksortAraber {

    static void quicksortArab (int [] arr, int low, int high) {
        if (low>high){
            return;
        }

        int mid = low +(high-low)/2;
        int pivot = arr[mid];

        int left = low;
        int right = high;

        while (left<=right && left<4 && right>=0){
            while (arr[left]<pivot) left++;
            while (arr[right]<pivot) right--;

            if(left<=right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right++;

            }

        }
        // out of the while loop;
        if(low<right){
            quicksortArab(arr,low,right);
        }
        if(high>left){
            quicksortArab(arr,left,high);
        }
    }


    public static void main(String[] args) {
        int [] a = {5,9,3,5,6};
        quicksortArab(a,0, a.length-1);
        System.out.println("Ferdig " + Arrays.toString(a));
    }
}

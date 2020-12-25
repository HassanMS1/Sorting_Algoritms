import java.util.Arrays;


// Well explained quicksort
public class quickSortStackExchange {
    public static void myCode3 (int arr [], int start , int end)
    {
        if (start<end){

            // vi vant hvem som er sorted og sender inn derfor venstre og høyre siden til rekursjon
            int pivotIndex = partition (arr, start, end);


            //dSystem.out.println("Sorting for the list from " + arr[start] + " to " + arr[pivotIndex-1] );
            System.out.println(" ");
            myCode3(arr, start, pivotIndex-1);
            //System.out.println(Arrays.toString(arr) + " sorted left side now ");
           // System.out.println("Sorting for the list from " + arr[pivotIndex+1] + " to " + arr[end] );
            System.out.println(" ");
            myCode3(arr, pivotIndex+1, end);
            //System.out.println(Arrays.toString(arr) + " sorted left right now ");

        }

    }
    public static int partition(int[] items, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex - 1;
        int pivot = items[endIndex];

        System.out.println("Sorting for " + items[endIndex] +" now. " + Arrays.toString(items));

        while (left < right) {


            while (left <=right && items[left] <= pivot) {
                ++left;
            }


            // right job is find an item that smaller than pivot while skipping the bigger ones or equal ones
            System.out.println("Right while will now ask if " +items[right] +" is bigger than " + pivot);
            while (right >left && items[right] >= pivot) {
                int myright = right-1;
                System.out.println("Before gets decrees "+ right + " and right will be decreased to " + right);
                --right;

            }

            // if left is less right and right is has not been allowed to move
            if (left < right) {
                System.out.println("Left is less than right and we are doing changes. And right is " + right);
                int temp_item = items[left];
                items[left] = items[right];
                items[right] = temp_item;
                left++;
                right--;
            }
        }

        //swap pivot to the new position
        // pivot will be changed to left index after it passed because if it pass right, left value is now bigger than pivot
        // there pivot should be there
        // on change pivot to to left if left has not reached


        // change pivot to wherever left has stopped
        // if left has passed
        if(left !=endIndex){
            System.out.println("We are doing changes now between value "+ items[left]  +" and value "  +pivot);
        int temp_item = items[left];
        items[left] = pivot;
        items[endIndex] = temp_item;
        System.out.println("The list has been sorted for : " + pivot + " " + Arrays.toString(items));
        System.out.println(" ");
        }

        return left;
    }

    public static void main(String[] args) {

        int [] arr = {6,1,2,3,4,7};

        // sortQuick(arr);
        myCode3(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");

    }

}

import java.util.Arrays;

public class quicksortEvenAndOdd {
    public static void partialSorting(int[]a){
        int venstre=0;
        int høyre=a.length-1;
        while (venstre<høyre){

            while(a[venstre]%2==0)
            {
                venstre++;
            }
            while(a[høyre]%2==1)
            {
                høyre--;
            }

            if(venstre<høyre)
            {
                int temp=a[venstre];
                a[venstre]=a[høyre];
                a[høyre]=temp;
            }
        }

        findTheLastPartall(a);
    }
    public static void quickSort3(int arr [], int start , int end)
    {
        if (start<end){

            // vi vant hvem som er sorted og sender inn derfor venstre og høyre siden til rekursjon
            int pivotIndex = partition (arr, start, end);


            //dSystem.out.println("Sorting for the list from " + arr[start] + " to " + arr[pivotIndex-1] );
            //System.out.println(" ");
            quickSort3(arr, start, pivotIndex-1);
            //System.out.println(Arrays.toString(arr) + " sorted left side now ");
            // System.out.println("Sorting for the list from " + arr[pivotIndex+1] + " to " + arr[end] );
          //  System.out.println(" ");
            quickSort3(arr, pivotIndex+1, end);
            //System.out.println(Arrays.toString(arr) + " sorted left right now ");

        }

    }
    public static int partition(int[] items, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex - 1;
        int pivot = items[endIndex];

        //System.out.println("Sorting for " + items[endIndex] +" now. " + Arrays.toString(items));

        while (left <= right) {
            while (left <= right && items[left] <= pivot) {
                ++left;
            }
            while (left <= right && items[right] >= pivot) {
                --right;
            }
            if (left < right) {
                int temp_item = items[left];
                items[left] = items[right];
                items[right] = temp_item;
            }
        }

        //swap pivot to the new position

        int temp_item = items[left];
        items[left] = pivot;
        items[endIndex] = temp_item;
        //System.out.println("The list has been sorted for : " + pivot + " " + Arrays.toString(items));
        //System.out.println(" ");

        return left;
    }


    public static int findTheLastPartall (int [] arr){
        int pivotIndex=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==1){
                pivotIndex = i-1;
               // System.out.println("inside the method : " + pivotIndex);
                quickSort3(arr,0, pivotIndex);
                quickSort3(arr, pivotIndex+1, arr.length-1);
                return pivotIndex;



            }

        }
        return pivotIndex;

    }


    public static void main(String[] args) {
        int [] partall = {3,4,9,6};
        partialSorting(partall);
        System.out.println(Arrays.toString(partall));
        //int pivotIndex = findTheLastPartall(partall);

        //System.out.println("The pivot index is : " + pivotIndex + " and the value is "  + partall[pivotIndex]);



        // System.out.println(findTheLastPartall(partall));
    }
}

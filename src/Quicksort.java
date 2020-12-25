import java.util.Arrays;

public class Quicksort {



    /*


    public static void quicksortLerer (int [ ] a, int begin, int end){
        // beging er null, end er a.lengt, pivot er index til pivot
        // begin and end forteller hvor det skal jobbes med
        // når venster og høyre møtes er det ingen tall å bytte
        int pivot= byttPivotBakerest(a, begin, end);
        partioner (a, pivot, begin, end);
        byttpivotTilbake(a );
    }*/





    public static void sortQuick (int[] arr){

        int pivot = arr[arr.length-1];

        int last=arr.length-2;
        for (int i=0;i<arr.length;i++){

            for (int j=last; j>i;j-- ){
                if (arr[i]>pivot & arr[j]<pivot){

                    int temptLeft = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temptLeft;
                    last = last -1;
                    break;
                }
            }
        }
    }


    public static void myCode (int arr [], int start , int end)
    {
        if (start<end){

            // vi vant hvem som er sorted og sender inn derfor venstre og høyre siden til rekursjon
            int pivotIndex = partition (arr, start, end);


            System.out.println("Partioned list: "+ Arrays.toString(arr) + " pivot is " + pivotIndex);

            myCode(arr, start, pivotIndex-1);
            System.out.println(Arrays.toString(arr) + " sorted left side now ");
            myCode(arr, pivotIndex+1, end);
            System.out.println(Arrays.toString(arr) + " sorted left right now ");

        }

    }

    public static int partition (int []arr, int begin, int end){

        int pivot = arr[end];
        int i = begin-1; // starting behind to moved infront if found element bigger than pivot

        for (int j = begin; j < end; j++) {
            // sjekking om den nåverdig verdi j(begynner fra 0 index) vanglig, er mindre <= pivot
            // hvis ja , inkrement i ++ og bytt plass mellomg i og j

            if (arr[j] <= pivot) {
                i++; // i has to be incremented  at least one time, inorder not be out of the array to
                System.out.println(" Beacuse of:  " + arr[j] + " <= " + pivot);
                System.out.println("Changing: " + arr[i] + " with " + arr[j]);
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;


            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
      //  System.out.println("The pivot is : " + arr[i+1] + " position " + i+7 );
        //System.out.println("Going out: "+ Arrays.toString(arr));
        return i+1;


    }



    // Using while loop
    public static void myCode2 (int arr [], int start , int end)
    {
        if (start<end){



            int pivotIndex = partitions (arr, start, end);


           // System.out.println("Partioned list: "+ Arrays.toString(arr) + " pivot is " + pivotIndex);

            // vi vant hvem som er sorted og sender inn derfor venstre og høyre siden til rekursjon
            System.out.println("Listen ble partionert for : " +count + " gangn. Listen er som følge nå" + Arrays.toString(arr) );
            System.out.println(" ");
            myCode2(arr, start, pivotIndex-1);
            //System.out.println(Arrays.toString(arr) + " sorted left side now ");
            myCode2(arr, pivotIndex+1, end);
           // System.out.println(Arrays.toString(arr) + " sorted left right now ");

        }

    }

    public static void swap(int[] values, int from, int to) {
        int tmp = values[from];
        values[from] = values[to];
        values[to] = tmp;
    }

    static int count = 0;
    public static int partitions(int[] items, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex - 1;
        int pivot_index = startIndex+(endIndex-startIndex)/2;
        System.out.println("The index of the pivot is " + pivot_index);
        count++;
        System.out.println("Partioning nr: " + count + ". The pivot is now " + items[pivot_index]);
        swap(items, pivot_index,endIndex);
        System.out.println("Pivot was moved now: " + Arrays.toString(items));
        int pivot = items[endIndex];

        int whileRound= 0;
        while (left <= right) {
            // stop if left item is bigger or else go to next
            whileRound++;
            System.out.println(" Outer while round is: " + whileRound + " left is : "+ left + " right is :" + right);
            while (left <= right && items[left] <= pivot) {
                ++left;
                System.out.println( "Left has been increased it now: "+ left+" its at value:  " + items[left] );
            }
            System.out.println("Left stopped at value : " +items [left]);
            while (left <= right && items[right] >= pivot) {
                --right;
                System.out.println( "Right has been decreased it now: "+ right+" its at value:  " + items[right] );
            }
            System.out.println("Right stopped at value : " +items [right]);
            if (left < right) {
                int temp_item = items[left];
                items[left] = items[right];
                items[right] = temp_item;
                left++;
                right--;
            }
        }

        //swap pivot to the new position
        System.out.println("Left and right have met each other left is: " + left +" left value is " + items[left]
                +" and right is " +right +" with value: " +items[right]);
        int temp_item = items[left];
        items[left] = pivot;
        items[endIndex] = temp_item;
        System.out.println("The list after partion nr: " + count+" " + Arrays.toString(items) +" the new pivot is " + temp_item);
        return left;
    }









    public static void main(String[] args) {

        int [] arr = {4,6,6,7,5,4,3,1};

      // sortQuick(arr);
       myCode2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}

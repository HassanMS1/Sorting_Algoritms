import java.util.Arrays;

public class insertionSort {



    static void insertSort ( int array []){


        for (int i= 1; i<array.length; i++){
         int current = array [i];
         System.out.println(current);

         var j = i-1; // variable for while loop to go backwards, cant go lower than i-1 / or 0
            // when you  check two or more truths in order traversing a list use while loop with variable
            // is current less than number to left which is j if yes swap , and repeat the question
            while (j>=0 && current<array[j] ) {
                System.out.println("Moving "+ array[j] + " to the right side/ index to where " +  array[j+1] + " was at ");
                System.out.println("And " +current + " is moved to left ");

                array[j+1] = array [j]; // j was behind it will be it value to right now / make space for i value in the forloop


                j--;
            }
            array [j] = current;

            System.out.println("Out of the while loop array is now " + Arrays.toString(array));
            System.out.println(" ");
        }


    }


    static void insertionSortGeeks(int arr[])
    {
        int i, key, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
            while (j >= 0 && arr[j] > key) {
                System.out.println( "J is looking at index "+ j+ " value "+arr[j] + " is bigger than " + key + ". So we are moving " + arr[j] + " to right at ..");
                System.out.println("To where  value : " + arr[j + 1] + " is at ");
                        arr[j + 1] = arr[j];
                j--;
                System.out.println(" After moving to right j was decreased to " + j + " and the arrrays is " + Arrays.toString(arr));


            }
            System.out.println("Out of the while loop now. The key " +key + " will be placed at where " + arr[j + 1] +" is at "+ Arrays.toString(arr) );
            arr[j + 1] = key;
            System.out.println(key + " was now placed at position " + arr[j+1]+" "+Arrays.toString(arr));
            System.out.println(" ");
        }
    }




    public static void main(String[] args) {
        int k[] = {3,1,18,98,23,8,4};
        //insertSort(k);
        insertionSortGeeks(k);


        System.out.println(Arrays.toString(k));






    }
}

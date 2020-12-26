import java.util.Arrays;

public class insertionSort {



    static void insertSort ( int array []){


        for (int i= 1; i<array.length; i++)
        {
         int current = array [i];
         System.out.println(current);

         var j = i-1; // variable for while loop to go backwards, cant go lower than i-1 / or 0
            // when you  check two or more truths in order traversing a list use while loop with variable
            // is current less than number to left which is j if yes swap , and repeat the question
            while (j>=0 && array[j]>current ) {



                System.out.println("Moving "+ array[j] + " to the right side/ index to where " +  array[j+1] + " was at ");
                System.out.println("And " +current + " is moved to left ");

                array[j+1] = array [j]; // j was behind it will be it value to right now / make space for i value in the forloop

                if(j==0)break;
                else  j--;


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
            while (j >=0 && arr[j] > key) {

                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = key;

        }
    }




    public static void main(String[] args) {
        int k[] = {1,3,8,7,4};
       // insertSort(k);
      insertionSortGeeks(k);


        System.out.println(Arrays.toString(k));






    }
}

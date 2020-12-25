import java.util.Arrays;

public class QuickSortLærer {
    public static void swap(int[] values, int from, int to) {
        int tmp = values[from];
        values[from] = values[to];
        values[to] = tmp;
    }

    /**
     * Partitions an array.
     * @param values
     * @param begin
     * @param end
     * @param pivot_index
     * @return
     */
    public static int partition(int[] values, int begin, int end, int pivot_index) {
        // First, move our pivot to the end of the array.
        swap(values, pivot_index, end-1);

        int l = begin;
        int r = end-2;

        // Loop over the array and swap until l meets r
        while (l < r) {
            //Find first element from the left larger than pivot
            while (l <= r && values[l] < values[end-1]) {
                ++l;
            }

            //Find first element from the right smaller than pivot
            while (l <= r && values[r] > values[end-1]) {
                --r;
            }

            //If l and r have not met, swap l and r
            if (l < r) {
                swap(values, l, r);
                ++l;
                --r;
            }
        }

        //Swap pivot element back
        swap(values, l, end-1);

        //Return new index of pivot element
        return l;
    }


    /**
     * Implements quicksort using recursion
     * @param values
     * @param left
     * @param right
     */
    public static void quickSort(int[] values, int left, int right) {
        if (left >= right) {

            return;
        }

        // Velg en pivot
        int pivot_index = (left + right) / 2;
        int pivot = values[pivot_index];

        // Partisjonering
        // Sørg for at alle til høyre blir større enn eller lik pivot
        // og at alle til venstre er mindre enn pivot
        int new_pivot_index = partition(values, left, right, pivot_index);

        // Gjenta for høyre subliste og venstre subliste
        quickSort(values, left, new_pivot_index-1);
        quickSort(values, new_pivot_index+1, right);
    }




    public static void main(String[] args) {
        int [] a = {5,9,3,5};
        quickSort(a,0, a.length-1);
        System.out.println("Ferdig " +Arrays.toString(a));



    }
}

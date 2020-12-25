import java.util.Arrays;

public class Algo {



    public static int antallUlikeUsorterte(int[] a) {

        if (a.length < 2) return a.length;
        int antallUlike = 1;
        for (int i = 1; i < a.length; i++)
        {
            int j = 0;
            for (; j < i; j++)
            {
                int verdi = a[i];
                if (a[j] == verdi) break;  // samme verdi to steder
            }
            if (j == i) antallUlike++;   // verdi er ny
        }

        return antallUlike;
    }






    public static String merge(String s, String t) {
//throw new UnsupportedOperationException();

        int sLength=s.length();
        int tLength=t.length();

        if(sLength==0){
            return t;
        }
        else if(tLength==0)
        {
            return s;
        }
        else{
            String res="";
            int first=0,second=0;
            while(first<sLength || second<tLength)
            {
                if(first<sLength)
                {
                    res+=s.charAt(first);
                    first++;
                }
                if(second<tLength)
                {
                    res+=t.charAt(second);
                    second++;
                }
            }
            return res;
        }
    }

    public static String merge(String... s) {

//throw new UnsupportedOperationException();
        int first=0;
        String res="";
        int biggest=0;
        for(String i:s)
        {
            if (i.length()>biggest)
            {
                biggest=i.length();
            }
        }

        while(first<biggest)
        {
            for (String i :s)
            {
                if(first<i.length())
                {
                    res+=i.charAt(first);
                }
            }
            first++;
        }
        return res;
    }

    public static void rotation (char[] a) {
//throw new UnsupportedOperationException();
        int n=a.length;
        char last=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=last;

    }


    // oppgave 2'


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
    }


    public static int findTheLastPartall (int [] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==1){
                return arr[i-1];
            }

        }
        return 0;
    }

    public static void delsortering(int[] a) {

        for(int i=0;i<a.length;i++){
            if (a[i]%2==0){
                System.out.println(a[i]);

            }

        }



    }







    public static int sumOfDifferentValuesSorted(int[] a) {
//If array is not sorted in ascending order
        for(int i=1;i<a.length;i++)
        {
// Unsorted pair found
            if (a[i - 1] > a[i])
            { throw new IllegalStateException("Not sorted");
            }
        }
        for(int i=0;i<a.length;i++)
        { if(a[i]==0)
                return 0;
        }
        int n=a.length;
        int counter=0;
        for (int i = 0; i < n; i++)
        {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
                if (a[i] == a[j])
                    break;
            // If not printed earlier,
            // then print it
            if (i == j)
                counter++; }
        return counter; }

    public static void main(String[] args) throws Exception {




        int [] nums = {1,1,1};
        int [] partall = {3,5,4,2,4,8,9,10};
        partialSorting(partall);
        System.out.println(Arrays.toString(partall));
        System.out.println(findTheLastPartall(partall));


       // System.out.println(sumOfDifferentValuesSorted(nums));
    }

}

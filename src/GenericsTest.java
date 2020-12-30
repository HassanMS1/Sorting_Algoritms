import java.util.Arrays;

public class GenericsTest {

// vi lover at T [] listen som kommer inn implenterer comparerable
    // returnerer maks vakdri
    public static <T extends Comparable<? super T>> int maks(T[] a, int begin, int end) {
        int m = begin;                     // indeks til største verdi
        T maksverdi = a[begin];            // største verdi

        for (int i = begin+ 1; i < end; i++) {
            // the objects are getting compared via the compareTo method
            if (a[i].compareTo(maksverdi) < 0)
            {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        }
        return m;
    }


    static <T extends Comparable<? super T>> void sort (T [] values){
        // looper over all untatt siste element
        for(int i=0; i<values.length-1; i++){
            // finn største elemeten i intervallet [i, a.length]
            int max_index = maks(values, i,values.length);

           // bytt største element til først posistion / i
            T temp = values[i];
            values[i]= values[max_index];
            values[max_index]= temp;
        }
    }








    static <T extends Comparable<? super  T>> int maksgenric (T [] values ){
        T current_max = values[0];
        int current_index = 0;
        for (int i=1; i<values.length;i++){
            //if (values[i]>current_max)
            if (values[i].compareTo(current_max )> 0)
            {
                current_max=values[i];
                current_index=i;
            }

        }

        return  current_index;
    }


    static int charMax (char [] values ){
        char current_max = values[0];
        int current_index = 0;
        for (int i=1; i<values.length;i++){
            if (values[i]>current_max){
                current_max=values[i];
                current_index=i;
            }

        }

        return  current_index;
    }


    public static <T extends Comparable<? super T>> void innsettingssortering(T[] a)
    {
        for (int i = 1; i < a.length; i++)  // starter med i = 1
        {
            T verdi = a[i];        // verdi er et tabellelemnet
            int  j = i - 1;        // j er en indeks
            // sammenligner og forskyver:
            for (; j >= 0 && verdi.compareTo(a[j]) < 0 ; j--)
                a[j+1] = a[j];

            a[j + 1] = verdi;      // j + 1 er rett sortert plass
        }
    }




    public static class Person implements Comparable <Person> {
        String fname;
        String lName;
        int age;

        public Person(String fname, String lName, int age) {
            this.fname = fname;
            this.lName = lName;
            this.age = age;
        }


        // the person class must have compareTo. so that when maks method goes through every object has the method compare to
        @Override
        public int compareTo(Person other) {
            // if this.lastname < other.lastname -1 or negative number
            // if this.last == other.last  0
            // if this.last> other.last 1

            // for age you can return (this .age - other.age)
            int last_compare = this.lName.compareTo(other.lName);

            if (last_compare==0){
                return this.fname.compareTo(other.fname);

            }else {return  last_compare;}


        }

        @Override
        public String toString() {
            return fname + " "+ lName + " "+ age;
        }
    }




    public static void main(String[] args) {

        Person [] d= {new Person("Hassan", "Ma", 35), new Person("Furqan", "Aa", 34),
                      new Person("Ahmed", "Z", 39)  };

        int siste= d.length;



        //System.out.println(maks(d,0,siste));
        System.out.println(Arrays.toString(d));
        sort(d);
        System.out.println(Arrays.toString(d));

        Integer[] a = {23,423,1,3,43,1};
        innsettingssortering(a);
        System.out.println(Arrays.toString(a));




        /*Character [] b = {'9','1'};
        Integer [] a = {1,8,9,4,1,1,87,9};
        System.out.println(maks(d));
        System.out.println(maks(a));*/






    }

}


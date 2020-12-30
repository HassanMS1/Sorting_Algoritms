import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class GenericSort {



    // using bubble sort to sort a string increasing matter



    public static  <T extends Comparable<T>> void genericSorting(T [] s)
    {
        // copying the string array to primitive char[] array for easier replacement

      //char [] c = s.toCharArray();


      for(int i = 0; i<s.length;i++)
      {
          for(int j=0;j<s.length-1;j++)
          {
              if(s[j].compareTo(s[j+1])>0)
              {
                  T temp= s[j];
                  s[j]=s[j+1];
                  s[j+1]=temp;

              }
          }
      }


        System.out.println(Arrays.toString(s));

    }


    public static void main(String[] args) {
        String name = "HASSAN";
        List <String> n = new ArrayList<>();
        ArrayList <String> n2 = new ArrayList<>();
        // Converting the string to character because character implements comparable
        Character[] Char = ArrayUtils.toObject(name.toCharArray());
        Integer [] nums = {4,2,1,4,21,443,34,2};

        genericSorting(Char);
         genericSorting(nums);




    // String immutability prove
    // String name2 = name;
    //System.out.println(name.hashCode() + " " + name2.hashCode());
    //name2= name.replace("H", "S");
    //System.out.println(name.hashCode() + " " + name2.hashCode());






    }

}



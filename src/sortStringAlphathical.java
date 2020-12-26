import java.util.Arrays;

public class sortStringAlphathical {



    // using bubble sort to sort a string increasing matter
    static void alphaticalString (String s)
    {
        // copying the string array to primitive char[] array for easier replacement

      char [] c = s.toCharArray();

      for(int i = 0; i<c.length;i++)
      {
          for(int j=0;j<c.length-1;j++)
          {
              if(c[j]>c[j+1])
              {
                  char temp= c[j];
                  c[j]=c[j+1];
                  c[j+1]=temp;

              }
          }
      }


        System.out.println(String.valueOf(c));

    }


    public static void main(String[] args) {
    String name = "HASSAN";
    alphaticalString(name);
   // String immutability prove
    // String name2 = name;
    //System.out.println(name.hashCode() + " " + name2.hashCode());
    //name2= name.replace("H", "S");
    //System.out.println(name.hashCode() + " " + name2.hashCode());






    }

}



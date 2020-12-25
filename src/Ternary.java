public class Ternary {


    public static int myTernaryIfTest(int value){
      /*  if (value<5){return 0;

        }else {
            return 98;
        }*/

        return (value <5) ? 0 : 98;



    }




    public static void main(String[] args) {

        for (int i =0; i<10;i++){
            int a= i;
            int b = myTernaryIfTest(i);
            System.out.println(b);
        }


    }
}

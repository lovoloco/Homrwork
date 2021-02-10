package ru.geekbrains.kom.homework1;

public class homework1 {
        //1
    public static void main(String[] args) {



        example8();

        //2


        int a = 3;
        float b = 2.2f;
        double c = 2.34;
        byte d = 0;
        short e = 0;
        long f = 2479374;
        boolean g = true;
        char h = 'h';

    }

        //3

         public static float example3 (float answer) {
            float a=1, b=1, c=1, d=1;
            return answer = (float) (a* (b + (c / d)));

         }

         //4

        private static boolean example4 () {
             int a=1, b=1, answer2;
             answer2 = a+b;
            if ( answer2 >=10 && answer2<=20) {
                return (true);
            }
            else {
                return (false);
            }


        }

        //5
        public static void example5 () {
         int a=4 ;
         if(a>=0){
             System.out.println("число положительно");
         }
         else {
             System.out.println("число отрицательно");
         }

        }

        //6

         public static boolean example6(){
          int a= 0;
          if (a>=0){
              return (true);
          }
          else{
              return (false);
          }
         }

         //7
    public static void example7(){
        String name = "Имя";

        System.out.println("Привет " + name);

    }

    //8

    private static void example8()
    {
        float year = 300;
        float a = year % 4;
        float b = year % 100;
        float c = year % 400;

        if (b==0 && c==0)
        {
            System.out.println("Год високосный");
        }
        else if (b==0)
        {
            System.out.println("Год обычный");
        }
        else if(a==0)
        {
            System.out.println("Год високосный");
        }
        else
        {
            System.out.println("Год обычный");
        }

    }







}

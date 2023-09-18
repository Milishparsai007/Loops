public class Patterns_03 {
    public static void main(String[] args) {

        //Pattern 08
        //* * * * *
        //  * * * *
        //    * * *
        //      * *
        //        *

//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=5;j++)
//            {
//                if(j>=i)
//                {
//                    System.out.print("* ");
//                }
//                else
//                    System.out.print("  ");
//
//            }
//            System.out.println("");
//
//        }

        //Pattern 09
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *

//        for (int i=5;i>=1 ;i--)
//        {
//            for (int j=1;j<=5;j++)
//            {
//                if (j>=i)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println("");
//        }

        // hello world
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if(i+j>5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int k=0;k<4;k++)
            {
                if(k>=i)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

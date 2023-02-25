public class Patterns_01 {
    public static void main(String[] args) {
        //Pattern 1
//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=5;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }

        //Pattern 2
//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=5;j++)
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println("");
//        }

        //Pattern 3
//        for (int i=1;i<=5;i++)
//        {
//            //2 3 4 5 6
//            //3 4 5 6 7
//            //4 5 6 7 8
//            //.........
//            //.........
//
//            for (int j=1;j<=5;j++)
//            {
//                System.out.print(i+j+" ");
//            }
//            System.out.println("");
//        }

        //Pattern 4
        // 1 to 25
        int count=0;
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                count++;
//                System.out.print(count+" ");
                //This will print the required pattern but it will not look balanced for doing so we can use : -
//                System.out.printf("%2d ",count);
                //OR
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }
}

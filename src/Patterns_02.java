import javax.swing.plaf.IconUIResource;

public class Patterns_02 {
    public static void main(String[] args) {
        //Pattern 05
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }

        //Pattern 06
        //01
        //02 03
        //04 05 06
        //07 08 09 10
        //11 12 13 14 15

//        int count=0;
//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=i;j++)
//            {
//                count++;
//                System.out.format("%02d ",count);
//            }
//            System.out.println("");
//        }

        //Using these methods instead of taking numbers you can take any symbol.

//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1;j<=i;j++)
//            {
//
//                System.out.format("* ");
//            }
//            System.out.println("");
//        }

        //Pattern 07
        //1 2 3 4 5
        //1 2 3 4
//        and so on
        for (int i=5;i>=0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        for (int i=5;i>=0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

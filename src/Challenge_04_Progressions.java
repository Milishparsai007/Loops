//1.Display AP series.
//2.Display GP series
//3.Display fibonacci series.

import java.util.Scanner;
public class Challenge_04_Progressions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte choice;
        int n,an,a1,a2,d,r,c;
        float g1;
        do {
            System.out.println("\nSelect the type of progression : ");
            System.out.println("1.Arithmetic Progression AP\n2.Geometric Progression GP\n3.Fibonacci Series");
            choice = sc.nextByte();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the number of terms : ");
                    n=sc.nextInt();
                    System.out.println("Enter the common difference : ");
                    d=sc.nextInt();
                    System.out.println("Enter the first term : ");
                    a1=sc.nextInt();
                    System.out.println("Arithmetic Progression is : ");
                    for (int i=1;i<=n;i++)
                    {
                        an=a1+(i-1)*d;
                        System.out.print(an+" ");
                    }
                    break;

                case 2:
                    System.out.println("Enter number of terms : ");
                    n=sc.nextInt();
                    System.out.println("Enter the first term : ");
                    g1=sc.nextFloat();
                    System.out.println("Enter the common ratio : ");
                    r=sc.nextInt();
                    System.out.println("Geometric Progression is : ");
                    System.out.print(g1+"\t");
                    for (int i=1;i<n;i++)
                    {
                        g1=(float)g1*r;
                        System.out.print(g1+"\t");

                    }
                    break;

                case 3:
                    System.out.println("Enter the number of terms : ");
                    n=sc.nextInt();
                    System.out.println("Enter the first term : ");
                    a1=sc.nextInt();
                    System.out.println("Enter second term : ");
                    a2=sc.nextInt();
                    System.out.println("Fibonacci Series is : ");
                    System.out.print(a1+" "+a2+" ");
                    for (int i=1;i<=n-2;i++)
                    {
                        c=a1+a2;
                        a1=a2;
                        a2=c;
                        System.out.print(c+" ");
                    }
            }
        }while (choice!=4);
    }
}

//1. display multiplication table
//2. sum of n numbers
//3. factorial

import java.util.Scanner;
public class Challenge_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice,n,sum=0,fact=1;
        do {
            System.out.println("Select problem number : ");
            System.out.println("1. mult\n2. sum\n3. fact");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter a number for which you want the multiplication table : ");
                    n=sc.nextInt();
                    for(int i=1;i<=10;i++)
                    {
                        System.out.println(n+"*"+(i)+" = "+(n*i) );
                    }
                    break;

                case 2:
                    System.out.println("Enter the number up to which you want the sum : ");
                    n=sc.nextInt();
                    for (int i=1;i<=n;i++)
                    {
                        sum=sum+i;
                        System.out.println(sum);

                    }
                    break;

                case 3:
                    System.out.println("Enter number : ");
                    n=sc.nextInt();
                    for (int i=n;i>0;i--)
                    {
                        fact=fact*i;
                    }
                    System.out.println(fact);
                    break;
            }
        }while (choice!=4);
    }
}

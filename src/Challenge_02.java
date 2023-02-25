//1. display digits of a given number
//2. count digits of a number
//3. finding a number is armstrong or not
//4. reverse a number
//5. check a number is palindrome or not


import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;
public class Challenge_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,n,i=1,digit,sum=0,rev=0;
        do {
            System.out.println("Select problem number : ");
            System.out.println("1. display digits\n2. count digits\n3. armstrong\n4. reverse number\n5. palindrome\n6. Exit");
            choice=sc.nextInt();
            System.out.println("Enter a number : ");
            n=sc.nextInt();
            switch (choice)
            {
                case 1:
                    while (n>0)
                    {
                        digit=n%10;
                        System.out.println("digit at "+i+"th place is : "+digit);
                        i*=10;
                        n/=10;
                    }
                    break;

                case 2:
                    String str=Integer.toString(n);
                    System.out.println("Number of digits in "+n+" are : "+str.length());

                    break;

                case 3:
                    String str1=Integer.toString(n);
                    int l=str1.length();
                    int temp=n;
                    while(n>0)
                    {
                        digit=n%10;
                        int mult=1;
                        for(i=1;i<=l;i++)
                        {
                            mult=mult*digit;
                        }
//                        System.out.println(mult);
                        sum=sum+mult;
//                        System.out.println(sum);
//                        System.out.println(l);
                        n=n/10;
                    }
                    System.out.println(temp);
                    if(temp==sum)
                    {
                        System.out.println("The number "+temp+" is an Armstrong number");
                    }
                    else
                        System.out.println("Number "+temp+" is not an Armstrong number");

                    break;

                case 4:

                    while (n>0)
                    {
                        digit=n%10;
                        rev=rev*10+digit;
                        n=n/10;
                    }
                    System.out.println(rev);
                    break;

                case 5:
                    temp=n;
                    while (n>0)
                    {
                        digit=n%10;
                        rev=rev*10+digit;
                        n=n/10;
                    }
                    if (rev==temp)
                    {
                        System.out.println("Number "+temp+" is palindrome");
                    }
                    else
                        System.out.println("Number is not palindrome");
                    break;

                case 6:
                    break;



            }
        }while (choice!=6);
    }
}

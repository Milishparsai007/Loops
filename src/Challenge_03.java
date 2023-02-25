//display number in words
//eg:- 237 should be displayed as "two three seven"

import java.util.Scanner;
public class Challenge_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        String str = Integer.toString(a);
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            switch (ch)
            {
                case '1' :
                    System.out.print("One ");
                    break;

                case '2':
                    System.out.print("two ");
                    break;

                case '3':
                    System.out.print("three ");
                    break;

                case '4':
                    System.out.print("four ");
                    break;

                case '5':
                    System.out.print("five ");
                    break;

                case '6':
                    System.out.print("six ");
                    break;

                case '7':
                    System.out.print("seven ");
                    break;

                case '8':
                    System.out.print("eight ");
                    break;

                case '9':
                    System.out.print("nine ");
                    break;

                case '0':
                    System.out.print("zero ");
                    break;
            }
        }
    }
}

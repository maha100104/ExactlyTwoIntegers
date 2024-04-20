import java.util.HashSet;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String S=sc.next();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<S.length();i++)
        {
            set.add(S.charAt(i));
        }
        if(set.size()==2)
        {
            System.out.println("This Number is formed with exactly two integers");
        }
        else
        {
            System.out.println("This number is not formed with excatly two integers");
        }
    }

}

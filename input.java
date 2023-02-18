import java.util.Scanner;
class Input {

    
  public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = s.nextInt();

        if (input >= 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
        
    }
}

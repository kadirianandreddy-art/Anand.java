mport java.util.Scanner;
public class Handling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=s.nextInt();
        System.out.println("Enter the second number");
        int b=s.nextInt();
        try{
int div=a/b;
System.out.println(div);
        }
        catch(ArithmeticException e)
        {
e.printStackTrace();
        }
        
    }
    
}

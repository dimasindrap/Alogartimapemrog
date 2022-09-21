import java.util.Scanner;  
public class pattern  
{  
    private static Scanner sc;
    public static void main(String[] args)  { 
    Scanner sc = new Scanner(System.in);
    System.out.print("x= ");
    int rows = sc.nextInt();

    int k = rows;

    for(int i = 0; i < k; i++)
    {
        for(int j = 0; j <k; j++)
        {
            if(j == i || i + j ==k - 1){

                System.out.print("*");
            }
            else 
            System.out.print(" ");
        }
        System.out.println();
    }
    } 
}

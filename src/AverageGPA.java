import java.util.*;
import java.util.Arrays; // import util.* cannot handle toString class objective 

public class AverageGPA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String[] names = new String [3];
        double[] gpa = new double [3];
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter name:");
            names[i] = input.nextLine();
            System.out.println("Enter gpa:");
            gpa[i] = input.nextDouble();
            
            input.nextLine();
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(gpa));
    }
}
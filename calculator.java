import java.util.Scanner;

class operation{
    int result;
     int add(int a, int b)
    {
        result=a+b;
        return result;
    }

    int sub(int a, int b)
    {
        result=a-b;
        return result;
    }

    int mult(int a, int b)
    {
        result=a*b;
        return result;
    }

    int div(int a, int b)
    {
        result=a/b;
        return result;
    }
}

public class calculator{
    public static void main(String args[])
    {   int ans;
        System.out.println("Enter the operation to be performed:\n 1. Addition\n 2. Subtraction \n 3. Multiplication\n 4. Division\n");
        Scanner s = new Scanner(System.in);
        System.out.print("Operation is: ");
        int op=s.nextInt();
        System.out.println("Enter the two operands: \n");
        int op1 =s.nextInt();
        int op2 =s.nextInt();

        operation ops = new operation();
        switch(op)
        { 
            case 1:
            ans=ops.add(op1,op2);
            System.out.println("The addition of "+op1+" and "+op2+" is:"+ans);
            break;

            case 2:
            ans=ops.sub(op1,op2);
            System.out.println("The subtraction of "+op1+" and "+op2+" is:"+ans);
            break;

            case 3:
            ans=ops.mult(op1,op2);
            System.out.println("The multiplication of "+op1+" and "+op2+" is:"+ans);
            break;

            case 4:
            ans=ops.div(op1,op2);
            System.out.println("The division of "+op1+" and "+op2+" is:"+ans);
            break;

            default:
            System.out.println("Invalid Choice");

        }

    }
}
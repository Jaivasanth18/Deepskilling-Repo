import java.util.*;

public class forecast{

    public static double CalculateFutureValue(int presentValue, double interestRate, int years){
        if (years == 0) {
            return presentValue;
        }
        return CalculateFutureValue((int)(presentValue * (1 + interestRate)), interestRate, years - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the present value: ");
        int presentValue = sc.nextInt();

        System.out.print("Enter the interest rate (as percentage): ");
        double interestRate = sc.nextDouble() / 100.0;

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        System.out.println("The future value is: " + CalculateFutureValue(presentValue, interestRate, years));

    }
}
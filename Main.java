import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Reads user input

        System.out.println("Enter year:");//prompts user to enter years of work.
        int year = scanner.nextInt();//Reads the integer input
        System.out.println("Enter salary:");//Prompts user to enter salary
        double salary = scanner.nextDouble();//Reads the double input entered by the user



        if(year>10){
        double bonus=salary*0.12;//it calculates the bonus and store in the variable called bonus
        System.out.println("Your Bonus: "+bonus);//it prints out the computed bonus
        double netSalary=salary+bonus;//it computes the net salary of the user
        System.out.println("Your Net Salary: "+netSalary);//prints out the net salary

    }

        else if((year >= 6) && (year < 10)) {
            double bonus=salary*0.1;
            System.out.println("Your Bonus: "+bonus);
            double netSalary=salary+bonus;
            System.out.println("Your Net Salary: "+netSalary);
        }


    else if(year<6){
        double bonus=salary*0.08;
        System.out.println("Your Bonus: "+bonus);
        double netSalary=salary+bonus;
        System.out.println("Your Net Salary: "+netSalary);
        }


    }
}
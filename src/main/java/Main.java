import java.util.Scanner;

public class Main {
    public void start() {
        Account ac;
        ac = new Account();
        Scanner in = new Scanner(System.in);
        while(true){
            if(true){
                System.out.print("Enter 1 = Income , Enter 2 = Expenses , Enter 0 = Exit " + " ");
                int number = in.nextInt();
                if(number == 1){
                    System.out.print("Enter your income : ");
                    double income = in.nextDouble();
                    System.out.print("Enter your Details : ");
                    in.useDelimiter("\n");
                    String details = in.next();
                    ac.income(income,details);
                }
                else if(number == 2){
                    System.out.print("Enter your expenses: ");
                    double expenses = in.nextDouble();
                    System.out.print("Enter your Details : ");
                    in.useDelimiter("\n");
                    String details = in.next();

                }
                else if(number == 0){
                    break;
                }
            }
        }
        System.out.println("\n" + ac.getTotal());
        System.out.println(ac.getBalance());
    }

    }


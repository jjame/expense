import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<AccountNormal> list = new ArrayList<>();

    public Account(){
        balance = 0;
    }
    public Account(double initialMoney){
        this.balance = initialMoney;
    }
    public void income(double money,String details){
        balance += money;
        list.add(new AccountNormal(money,details,"+"));
    }
    public void expenses(double money,String details) throws Exception {
        balance -= money;
        list.add(new AccountNormal(money,details,"-"));
        if(balance < 0) {
                throw new Exception("Caution your expenses more than balance\n");
        }
    }

    public String getTotal(){
        String temp = "";
        for(int i=0;i<list.size();i++){
            temp +=  "|" + list.get(i).type + "" + list.get(i).money + " : " + list.get(i).detail + "|" + "\n";

        }
        return temp;
    }

    public double getBalance() {
        return balance;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
}

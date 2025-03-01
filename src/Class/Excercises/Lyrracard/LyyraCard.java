package Class.Excercises.Lyrracard;

public class LyyraCard {

    private double balance;
    private double econimical;
    private double Gourmet;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The hard has" + this.balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.5) {
            balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (balance >= 4) {
            balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if (balance + amount > 150) {
                balance = 150;
            } else {
                balance += amount;
            }
        }
    }
}

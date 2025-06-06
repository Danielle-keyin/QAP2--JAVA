public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = new Money(limit); // copy to avoid reference sharing
        balance = new Money(0); // initial balance
    }

    public Money getBalance() {
        return new Money(balance); // return a copy
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // return a copy
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money potentialBalance = balance.add(amount);
        if (potentialBalance.compareTo(creditLimit) <= 0) {
            balance = potentialBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

public class Money {
    private long dollars;
    private long cents;

    // Constructor from double
    public Money(double amount) {
        dollars = (long) amount;
        cents = Math.round((amount - dollars) * 100);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return fromCents(totalCents);
    }

    public Money subtract(Money other) {
        long resultCents = this.toCents() - other.toCents();
        return fromCents(resultCents);
    }

    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }

    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    private long toCents() {
        return dollars * 100 + cents;
    }

    private Money fromCents(long totalCents) {
        Money result = new Money(0);
        result.dollars = totalCents / 100;
        result.cents = totalCents % 100;
        return result;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}

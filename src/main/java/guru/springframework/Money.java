package guru.springframework;

public class Money {

    private int amount;

    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency() {
        return this.currency;
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public static Money dollar(int multiplier) {
        return new Money(multiplier, "USD");
    }

    public static Money franc(int multiplier) {
        return new Money(multiplier, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && this.currency.equals(money.currency());
    }

}

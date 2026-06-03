package java8features.top20StreamsQnA;

public class Transaction {

    private String category;
    private Integer amount;

    public Transaction(String category, Integer amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public Integer getAmount() {
        return amount;
    }
}

package training.algorithms;

import java.time.LocalDate;

public class Transaction implements Comparable<Transaction>{

    Integer id;
    String reference;
    LocalDate date;

    @Override
    public int compareTo(Transaction transaction) {
        return reference.compareTo(transaction.reference);
    }
}

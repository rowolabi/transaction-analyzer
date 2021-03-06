package com.owodigi.transaction.endpoint;

import com.owodigi.transaction.model.Transaction;
import java.util.Collections;
import java.util.List;

/**
 * TransactionEndpoint that only returns empty Collections as results.
 */
public class EmptyResponseTransactionEndpoint implements TransactionEndpoint {

    @Override
    public List<Transaction> getAllTransactions() {
        return Collections.<Transaction>emptyList();
    }

    @Override
    public List<Transaction> getProjectedTransactionsForMonth() {
        return Collections.<Transaction>emptyList();
    }
}

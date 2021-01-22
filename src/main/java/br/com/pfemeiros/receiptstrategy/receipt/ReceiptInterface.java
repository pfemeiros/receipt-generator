package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;

public interface ReceiptInterface {

    void createTemplate();
    Receipt getReceiptInfo(ReceiptRepository receiptRepository);

}

package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;

public class CollectReceipt implements ReceiptInterface {

    @Override
    public void createTemplate() {

    }

    @Override
    public Receipt getReceiptInfo(ReceiptRepository receiptRepository) {
        return receiptRepository.findById(1L).orElse(null);
    }

}

package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;

public class TranshipmentReceipt implements ReceiptInterface {

    @Override
    public void createTemplate() {

    }

    @Override
    public Receipt getReceiptInfo(ReceiptRepository receiptRepository) {
        return receiptRepository.findById(3L).orElse(null);
    }

}

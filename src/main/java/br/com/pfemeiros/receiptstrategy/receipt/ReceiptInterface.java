package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.ReceiptInfo;

public interface ReceiptInterface {

    void createTemplate();
    ReceiptInfo getReceiptInfo();

}

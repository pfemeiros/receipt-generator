package br.com.pfemeiros.receiptstrategy.service;

import br.com.pfemeiros.receiptstrategy.receipt.ReceiptInterface;

public interface ReceiptService {

    byte[] getReceipt(ReceiptInterface receiptInterface);

}

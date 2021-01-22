package br.com.pfemeiros.receiptstrategy.service;

import br.com.pfemeiros.receiptstrategy.receipt.ReceiptInterface;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;
import org.springframework.stereotype.Service;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    private final ReceiptRepository receiptRepository;

    public ReceiptServiceImpl(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    @Override
    public void getReceipt(ReceiptInterface receiptInterface) {
        receiptInterface.getReceiptInfo(receiptRepository);
    }

}

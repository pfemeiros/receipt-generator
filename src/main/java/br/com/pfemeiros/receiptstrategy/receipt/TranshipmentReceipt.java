package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;
import org.thymeleaf.TemplateEngine;

public class TranshipmentReceipt implements ReceiptInterface {

    @Override
    public void createTemplate(Receipt receiptInfo, TemplateEngine templateEngine) {

    }

    @Override
    public Receipt getReceiptInfo(ReceiptRepository receiptRepository) {
        return receiptRepository.findById(3L).orElse(null);
    }

}

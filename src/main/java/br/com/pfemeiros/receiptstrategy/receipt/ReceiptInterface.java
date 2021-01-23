package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;
import org.thymeleaf.TemplateEngine;

public interface ReceiptInterface {

    void createTemplate(Receipt receiptInfo, TemplateEngine templateEngine);
    Receipt getReceiptInfo(ReceiptRepository receiptRepository);

}

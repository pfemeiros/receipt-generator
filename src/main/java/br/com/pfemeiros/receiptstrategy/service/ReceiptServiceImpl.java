package br.com.pfemeiros.receiptstrategy.service;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.receipt.ReceiptInterface;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

@Service
public class ReceiptServiceImpl implements ReceiptService {

    private final ReceiptRepository receiptRepository;
    private final TemplateEngine templateEngine;

    public ReceiptServiceImpl(ReceiptRepository receiptRepository, TemplateEngine templateEngine) {
        this.receiptRepository = receiptRepository;
        this.templateEngine = templateEngine;
    }

    @Override
    public void getReceipt(ReceiptInterface receiptInterface) {
        Receipt receiptInfo = receiptInterface.getReceiptInfo(receiptRepository);
        receiptInterface.createTemplate(receiptInfo, templateEngine);
    }

}

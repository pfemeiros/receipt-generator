package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.Map;

import static br.com.pfemeiros.receiptstrategy.util.PDFUtils.generateFile;

public class CollectReceipt implements ReceiptInterface {

    private Map<String, Object> receiptInfoMap = new HashMap<>();
    private String templateName = "collect.html";

    @Override
    public void createTemplate(Receipt receiptInfo, TemplateEngine templateEngine) {
        receiptInfoMap.put("id", receiptInfo.getId());
        receiptInfoMap.put("description", receiptInfo.getDescription());
        receiptInfoMap.put("total", receiptInfo.getTotal());
        Context context = new Context();
        for (Map.Entry<String, Object> entry : receiptInfoMap.entrySet()) {
            context.setVariable(((Map.Entry) entry)
                            .getKey()
                            .toString(),
                    entry.getValue());
        }
        String html = templateEngine.process(templateName, context);
        generateFile(html, receiptInfo.getId());
    }

    @Override
    public Receipt getReceiptInfo(ReceiptRepository receiptRepository) {
        return receiptRepository.findById(1L).orElse(null);
    }

}

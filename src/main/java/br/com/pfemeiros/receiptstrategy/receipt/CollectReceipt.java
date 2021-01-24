package br.com.pfemeiros.receiptstrategy.receipt;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import br.com.pfemeiros.receiptstrategy.repository.ReceiptRepository;
import org.thymeleaf.TemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static br.com.pfemeiros.receiptstrategy.util.PDFUtils.generateFile;
import static br.com.pfemeiros.receiptstrategy.util.ThymeleafUtils.generateHtmlFromMap;

public class CollectReceipt implements ReceiptInterface {

    private Map<String, Object> receiptInfoMap = new HashMap<>();
    private final String templateName = "collect.html";

    @Override
    public byte[] createTemplate(Receipt receiptInfo, TemplateEngine templateEngine) {
        receiptInfoMap.put("id", receiptInfo.getId());
        receiptInfoMap.put("description", receiptInfo.getDescription());
        receiptInfoMap.put("total", receiptInfo.getTotal());
        String html = generateHtmlFromMap(templateEngine, receiptInfoMap, templateName);
        return generateFile(html);
    }

    @Override
    public Receipt getReceiptInfo(ReceiptRepository receiptRepository) {
        return receiptRepository.findById(1L).orElse(null);
    }

}

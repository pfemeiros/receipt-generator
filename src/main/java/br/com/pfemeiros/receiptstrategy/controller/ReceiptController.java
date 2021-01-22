package br.com.pfemeiros.receiptstrategy.controller;

import br.com.pfemeiros.receiptstrategy.receipt.CollectReceipt;
import br.com.pfemeiros.receiptstrategy.service.ReceiptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("receipts")
public class ReceiptController {

    private final ReceiptService receiptService;

    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @GetMapping
    public String get() {
        receiptService.getReceipt(new CollectReceipt());
        return "Teste";
    }
    
}

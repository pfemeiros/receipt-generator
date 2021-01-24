package br.com.pfemeiros.receiptstrategy.controller;

import br.com.pfemeiros.receiptstrategy.receipt.CollectReceipt;
import br.com.pfemeiros.receiptstrategy.receipt.DistributionReceipt;
import br.com.pfemeiros.receiptstrategy.receipt.TranshipmentReceipt;
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

    @GetMapping("collections")
    public String getCollections() {
        receiptService.getReceipt(new CollectReceipt());
        return "Collections";
    }

    @GetMapping("distributions")
    public String getDistributions() {
        receiptService.getReceipt(new DistributionReceipt());
        return "Distributions";
    }

    @GetMapping("overflows")
    public String getOverflows() {
        receiptService.getReceipt(new TranshipmentReceipt());
        return "Overflows";
    }
    
}

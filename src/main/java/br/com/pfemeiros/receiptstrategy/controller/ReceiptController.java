package br.com.pfemeiros.receiptstrategy.controller;

import br.com.pfemeiros.receiptstrategy.receipt.CollectReceipt;
import br.com.pfemeiros.receiptstrategy.receipt.DistributionReceipt;
import br.com.pfemeiros.receiptstrategy.receipt.TranshipmentReceipt;
import br.com.pfemeiros.receiptstrategy.service.ReceiptService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<byte[]> getCollections() {
        return ResponseEntity.ok()
                .header("Content-disposition", "attachment; filename=receipt.pdf")
                .body(receiptService.getReceipt(new CollectReceipt()));
    }

    @GetMapping("distributions")
    public ResponseEntity<byte[]> getDistributions() {
        return ResponseEntity.ok()
                .header("Content-disposition", "attachment; filename=receipt.pdf")
                .body(receiptService.getReceipt(new DistributionReceipt()));
    }

    @GetMapping("overflows")
    public ResponseEntity<byte[]> getOverflows() {
        return ResponseEntity.ok()
                .header("Content-disposition", "attachment; filename=receipt.pdf")
                .body(receiptService.getReceipt(new TranshipmentReceipt()));
    }

}

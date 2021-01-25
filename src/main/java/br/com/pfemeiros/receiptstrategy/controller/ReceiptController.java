package br.com.pfemeiros.receiptstrategy.controller;

import br.com.pfemeiros.receiptstrategy.receipt.CollectReceipt;
import br.com.pfemeiros.receiptstrategy.receipt.DistributionReceipt;
import br.com.pfemeiros.receiptstrategy.receipt.TranshipmentReceipt;
import br.com.pfemeiros.receiptstrategy.service.ReceiptService;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation("Generates collection receipt")
    @GetMapping(value = "collections", produces = "application/pdf")
    public ResponseEntity<byte[]> getCollections() {
        return createResponseBytes(receiptService.getReceipt(new CollectReceipt()));
    }

    @ApiOperation("Generates distribution receipt")
    @GetMapping(value = "distributions", produces = "application/pdf")
    public ResponseEntity<byte[]> getDistributions() {
        return createResponseBytes(receiptService.getReceipt(new DistributionReceipt()));
    }

    @ApiOperation("Generates transhipment receipt")
    @GetMapping(value = "overflows", produces = "application/pdf")
    public ResponseEntity<byte[]> getOverflows() {
        return createResponseBytes(receiptService.getReceipt(new TranshipmentReceipt()));
    }

    private ResponseEntity<byte[]> createResponseBytes(byte[] bytes) {
        return ResponseEntity.ok()
                .header("Content-disposition", "attachment; filename=receipt.pdf")
                .body(bytes);
    }

}

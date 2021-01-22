package br.com.pfemeiros.receiptstrategy.model;

import lombok.Data;

@Data
public class ReceiptInfo {

    private Long id;
    private String description;
    private Double total;

}

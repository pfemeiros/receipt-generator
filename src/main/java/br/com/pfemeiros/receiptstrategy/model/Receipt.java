package br.com.pfemeiros.receiptstrategy.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double total;
    private Integer quantity;

    @Column(name = "receipt_date")
    private LocalDate date;

}

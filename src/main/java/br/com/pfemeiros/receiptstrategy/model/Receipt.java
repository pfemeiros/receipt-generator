package br.com.pfemeiros.receiptstrategy.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double total;

}

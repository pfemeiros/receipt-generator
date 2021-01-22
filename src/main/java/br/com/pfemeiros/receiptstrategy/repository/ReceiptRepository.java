package br.com.pfemeiros.receiptstrategy.repository;

import br.com.pfemeiros.receiptstrategy.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}

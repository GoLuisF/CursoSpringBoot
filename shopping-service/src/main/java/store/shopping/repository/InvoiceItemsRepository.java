package store.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import store.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
	
}

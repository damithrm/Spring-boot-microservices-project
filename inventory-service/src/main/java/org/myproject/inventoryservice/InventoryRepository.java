package org.myproject.inventoryservice;

import org.myproject.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode(String productCode);

    List<Inventory> findBySkuCodeIn(List<String> skuCode);

//    Optional<Inventory> findbySkuCode(String productCode);
}

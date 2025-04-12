package org.myproject.inventoryservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.myproject.inventoryservice.dto.InventoryResponse;
import org.myproject.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@Slf4j
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        log.info("Checking stock for SKU codes: {}", skuCode);
        List<InventoryResponse> responses = inventoryService.isInStock(skuCode);
        log.info("Stock check completed. Responses: {}", responses);
        return responses;
    }
}

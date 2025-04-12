package org.myproject.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.myproject.orderservice.model.OrderLineItem;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<orderLineItemsDto> orderLineItemsDtoList;
}

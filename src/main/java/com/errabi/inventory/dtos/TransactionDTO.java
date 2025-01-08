package com.errabi.inventory.dtos;

import com.errabi.inventory.enums.TransactionStatus;
import com.errabi.inventory.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {
    private Long id;
    private Integer totalProducts;
    private BigDecimal totalPrice;
    private TransactionType transactionType;
    private TransactionStatus status;
    private String description;
    private String note;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private ProductDTO product;
    private UserDTO user;
    private SupplierDTO supplier;
}
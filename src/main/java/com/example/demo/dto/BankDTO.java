package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDTO {
    @Id
    private String bankId;
    private String bankCode;
    private String bankCbc;
    private String bankFiid;
    private String bankDesc;
}

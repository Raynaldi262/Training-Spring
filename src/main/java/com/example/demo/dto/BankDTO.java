package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDTO {
    private String bank_id;
    private String bank_code;
    private String bank_cbc;
    private String bank_desc;
}

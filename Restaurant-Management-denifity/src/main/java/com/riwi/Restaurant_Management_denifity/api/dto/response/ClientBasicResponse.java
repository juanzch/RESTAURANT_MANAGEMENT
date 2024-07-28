package com.riwi.Restaurant_Management_denifity.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ClientBasicResponse {

    private String cc;
    private String full_name;
    
}

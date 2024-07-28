package com.riwi.Restaurant_Management_denifity.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {

    @NotBlank(message = "Document is required")
    private String cc;
    @NotBlank(message = "full name is required")
    private String full_name;

}

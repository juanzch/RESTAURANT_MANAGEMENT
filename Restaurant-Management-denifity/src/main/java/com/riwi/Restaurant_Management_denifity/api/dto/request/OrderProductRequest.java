package com.riwi.Restaurant_Management_denifity.api.dto.request;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductRequest {

    @NotNull( message = "quantity is required")
    private int quantity;
    @NotNull(message = "Id is required")
    private Long orderId;
    @NotNull(message = "Id is required")
    private Long productId;
}

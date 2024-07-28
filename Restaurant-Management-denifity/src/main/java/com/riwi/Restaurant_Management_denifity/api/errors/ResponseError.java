package com.riwi.Restaurant_Management_denifity.api.errors;

import lombok.*;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseError implements Serializable {
    private String status;
    private Integer code;
    private Map<String,String> error;
}

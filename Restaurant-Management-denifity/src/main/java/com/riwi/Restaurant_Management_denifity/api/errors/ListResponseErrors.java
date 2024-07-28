package com.riwi.Restaurant_Management_denifity.api.errors;

import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListResponseErrors implements Serializable {
    private String status;
    private Integer code;
    private List<Map<String,String>> errors;
}

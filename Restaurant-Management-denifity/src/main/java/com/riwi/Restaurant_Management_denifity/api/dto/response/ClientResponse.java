package com.riwi.Restaurant_Management_denifity.api.dto.response;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse extends ClientBasicResponse{

    private List<OrderBasicResponse> orderBasicResponse;

}

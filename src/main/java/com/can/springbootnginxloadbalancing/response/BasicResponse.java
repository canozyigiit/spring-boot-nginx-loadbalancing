package com.can.springbootnginxloadbalancing.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BasicResponse {
    private String response;
    private String dateTime;

}

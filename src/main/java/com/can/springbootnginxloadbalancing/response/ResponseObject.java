package com.can.springbootnginxloadbalancing.response;


import lombok.Data;

@Data
public class ResponseObject {

    private String serverName;
    private String ipInfo;
    private String dateTime;
}

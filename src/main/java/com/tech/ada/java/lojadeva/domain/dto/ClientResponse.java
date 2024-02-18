package com.tech.ada.java.lojadeva.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientResponse {

    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String address;
    private String postalCode;
    private String phoneNumber;
    private String password;
}

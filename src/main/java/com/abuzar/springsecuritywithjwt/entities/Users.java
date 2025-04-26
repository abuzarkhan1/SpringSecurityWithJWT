package com.abuzar.springsecuritywithjwt.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {

    private String userId;
    private String name;
    private String email;
}

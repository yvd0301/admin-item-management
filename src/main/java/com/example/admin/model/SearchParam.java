package com.example.admin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SearchParam {

    // {"account": "", "email": "", "page" : 0 }

    private String account;
    private String email;
    private int page;

}

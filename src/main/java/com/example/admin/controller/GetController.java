package com.example.admin.controller;

import com.example.admin.model.SearchParam;
import com.example.admin.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")  // localhost:8080/api/getMethod
    public String getRequest() {

        return "Hi geMethod";
    }


    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam String password) {

        String pwd = "bbbb";

        System.out.println("id : " + id);
        System.out.println("password : " + password);


        return id + password;
    }

    //localhost:8080/api/multiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {

        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // {"account": "", "email": "", "page" : 0 }

        return searchParam;
    }

    @GetMapping("/header")
    public Header getHeader(){

        // {"resultCode: "OK", "description": "OK"}
        return Header.builder().resultCode("OK").description("OK").build();
    }
}

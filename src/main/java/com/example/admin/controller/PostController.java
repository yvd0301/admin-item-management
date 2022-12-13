package com.example.admin.controller;

import com.example.admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색 파라미터가 많은 경우

    // http post body - > data
    // json, xml, multipart-form / text-plain



//    @RequestMapping(method = RequestMethod.POST, path = "/postMethod")
//    @PostMapping("/postMethod", produces = {"application-json"})
    @PostMapping("/postMethod")
//    public String postMethod(@RequestBody SearchParam searchParam){
    public SearchParam postMethod(@RequestBody SearchParam searchParam){



//        return "OK";
        return searchParam;
    }

//    @PutMapping("/putMethod")
//    public
//
//
//    @PatchMapping("/patchMethod")

}

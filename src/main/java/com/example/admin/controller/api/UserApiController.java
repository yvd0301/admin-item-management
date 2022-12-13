package com.example.admin.controller.api;

import com.example.admin.ifs.CrudInterface;
import com.example.admin.model.network.Header;
import com.example.admin.model.network.request.UserApiRequest;
import com.example.admin.model.network.response.UserApiResponse;
import com.example.admin.model.network.response.UserOrderInfoApiResponse;
import com.example.admin.service.UserApiLogicService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface <UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;

    @GetMapping("/{id}/orderInfo")
    public Header<UserOrderInfoApiResponse> orderInfo(@PathVariable Long id){
        return userApiLogicService.orderInfo(id);
    }


    @GetMapping("")
    public Header<List<UserApiResponse>> search(@PageableDefault(sort="id",direction = Sort.Direction.ASC, size=15) Pageable pageable){
    //public Header<List<UserApiResponse>> search(@PageableDefault(sort="id",direction = Sort.Direction.DESC, size=10) Pageable pageable){
        System.out.println("pageable : " + pageable);

        return userApiLogicService.search(pageable);
    }

    @Override
    @PostMapping("") // /api/user
//    public Header create(@RequestBody) {
//    public Header create() {
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request){
//        Log.info("{} , {}", request, "ABC"); // request.toString, ABC
        System.out.println("ABC : " + request);
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")  //   /api/user/{id}
    public Header<UserApiResponse> read(@PathVariable(name="id") Long id) {
        System.out.println("read id : " + id);
        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping("") //   /api/user
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        System.out.println("delete id : " + id);
        return userApiLogicService.delete(id);
    }
}

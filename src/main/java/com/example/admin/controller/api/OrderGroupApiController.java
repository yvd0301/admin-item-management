package com.example.admin.controller.api;

import com.example.admin.controller.CrudController;
import com.example.admin.ifs.CrudInterface;
import com.example.admin.model.entity.OrderGroup;
import com.example.admin.model.network.Header;
import com.example.admin.model.network.request.ItemApiRequest;
import com.example.admin.model.network.request.OrderGroupApiRequest;
import com.example.admin.model.network.response.ItemApiResponse;
import com.example.admin.model.network.response.OrderGroupApiResponse;
import com.example.admin.service.OrderGroupApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/orderGroup")
//public class OrderGroupApiController implements CrudInterface<OrderGroupApiRequest, OrderGroupApiResponse> {
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse, OrderGroup> {

    /*
    @Autowired
    private OrderGroupApiLogicService orderGroupApiLogicService;

    @PostConstruct
    public void init() {
        this.baseService = orderGroupApiLogicService;
    }
    */

    /*
    @Override
    @PostMapping("")    // /api/orderGroup
    public Header<OrderGroupApiResponse> create(@RequestBody Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<OrderGroupApiResponse> read(@PathVariable Long id) {
        return orderGroupApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<OrderGroupApiResponse> update(@RequestBody Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return orderGroupApiLogicService.delete(id);
    }
    */
}

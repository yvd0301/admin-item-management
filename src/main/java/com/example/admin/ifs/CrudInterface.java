package com.example.admin.ifs;

import com.example.admin.model.network.Header;
import com.example.admin.model.network.request.UserApiRequest;
import com.example.admin.model.network.response.UserApiResponse;

public interface CrudInterface<Req, Res> {

//    Header create();    // TODO: request object 추가
//    Header<UserApiResponse> create(UserApiRequest request);  // -> 상품 API 이나 다른 API에 공통적으로 적용이 어려움
    Header<Res> create(Header<Req> request);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header delete(Long id);
}

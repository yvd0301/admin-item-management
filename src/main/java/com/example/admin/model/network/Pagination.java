package com.example.admin.model.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class Pagination {
    private Integer totalPages; // 총 페이지수
    private Long totalElements; // 총 몇명인지
    private Integer currentPage;      // 현재 몇페이지인지
    private Integer currentElements;  // 얼마만큼 내려줬는지
}

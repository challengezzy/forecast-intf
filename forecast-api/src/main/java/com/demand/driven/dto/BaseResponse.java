package com.demand.driven.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T> {
    private String status;
    private String errorCode;
    private String errorMessage;
    private T data;
}

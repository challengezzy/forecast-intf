package com.demand.driven.controller;

import com.alibaba.fastjson.JSON;
import com.demand.driven.dto.BaseRequest;
import com.demand.driven.dto.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.demand.driven.dto.ResultType.SUCCESS;

@RestController
@Validated
@Slf4j
public class ForecastDataImportController {

    @PostMapping("/dataImport/hisBizDataSingle")
    public BaseResponse<String> dataImport(@RequestBody @Validated BaseRequest<String> request) {
        log.info("REQ data import request={}", JSON.toJSONString(request));
        BaseResponse response = buildResponse();
        log.info("REQ data import response={}", JSON.toJSONString(response));
        return response;
    }

    private BaseResponse buildResponse() {
      return   new BaseResponse().builder().status(SUCCESS.getCode()).data("").build();
    }

}

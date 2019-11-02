package com.demand.driven.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demand.driven.dto.BaseRequest;
import com.demand.driven.dto.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;

import static com.demand.driven.dto.ResultType.SUCCESS;

@RestController
@Validated
@Slf4j
public class ForecastDataImportController {

    @PostMapping("/dataImport/hisBizDataSingle")
    public BaseResponse<String> dataImport(@RequestBody @Validated BaseRequest<JSONObject> dataReqeust) {
        log.info("预测业务数据导入，request={}", JSON.toJSONString(dataReqeust));


        BaseResponse response = buildResponse();
        log.info("预测业务数据导入，response={}", JSON.toJSONString(response));
        return response;
    }

    @RequestMapping( value="/dataImport/test", method = RequestMethod.GET)
    public BaseResponse<String> dataImport(@RequestParam String appId) {
        log.info("test request={}", appId);
        BaseResponse response = buildResponse();
        log.info("test response={}", JSON.toJSONString(response));
        return response;
    }

    private BaseResponse buildResponse() {
      return   new BaseResponse().builder().status(SUCCESS.getCode()).data("").build();
    }

}

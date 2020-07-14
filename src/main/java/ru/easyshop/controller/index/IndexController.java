package ru.easyshop.controller.index;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.easyshop.controller.response.BaseResponse;
import ru.easyshop.service.StartService;

@Slf4j
@RequiredArgsConstructor
@RestController
public class IndexController {

    private final StartService service;

    @RequestMapping(method = RequestMethod.POST, value = "/v1/index")
    @Operation(summary = "Метод по умолчаию", tags = "sample")
    public BaseResponse start(IndexRequest request) {
        return new IndexResponse(service.getProductsPaged(request), 0);
    }
}

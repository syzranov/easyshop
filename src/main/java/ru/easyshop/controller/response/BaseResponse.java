package ru.easyshop.controller.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Schema(description = "Базовый response")
public class BaseResponse implements Serializable {

    @Schema(description = "Успешность операции")
    private boolean success;

    @Schema(description = "Объект ошибки, если произошла ошибка")
    private BaseResponseError error;

    public BaseResponse() {
        this.success = true;
    }

    public BaseResponse(String errorMessage) {
        this.error = new BaseResponseError(errorMessage);
        this.success = false;
    }

    public BaseResponse(String errorMessage, String errorCode, String stack) {
        this.error = new BaseResponseError(errorMessage, errorCode, stack);
        this.success = false;
    }

}

package ru.easyshop.controller.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Schema(description = "Базовый response с данными")
public class BaseResponseWithData<T> extends BaseResponse implements Serializable {

    @Schema(description = "Данные, если операция выполнена успешно")
    private T data;

    public BaseResponseWithData(T data) {
        super();
        this.data = data;
    }

}

package ru.easyshop.controller.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Schema(description = "Объект ошибки")
public class BaseResponseError implements Serializable {

    @Schema(description = "Текст сообщения об ошибке")
    private String message;

    @Schema(description = "Код ошибки")
    private String code;

    @Schema(description = "Стек")
    private String stack;

    public BaseResponseError(String message) {
        this.message = message;
    }

    public BaseResponseError(String message, String code, String stack) {
        this.message = message;
        this.code = code;
        this.stack = stack;
    }
}

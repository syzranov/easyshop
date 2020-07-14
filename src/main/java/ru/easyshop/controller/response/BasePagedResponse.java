package ru.easyshop.controller.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Schema(description = "Результат постраничной выборки")
public class BasePagedResponse<T extends Serializable> extends BaseResponseWithData<T> {

    public BasePagedResponse(T data, int pageCount) {
        super(data);
        this.pageCount = pageCount;
    }

    @Schema(description = "Количество страниц")
    private int pageCount;

}

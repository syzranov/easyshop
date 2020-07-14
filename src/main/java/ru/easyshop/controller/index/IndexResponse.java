package ru.easyshop.controller.index;

import ru.easyshop.controller.response.BasePagedResponse;
import ru.easyshop.service.dto.ProductPageDto;

public class IndexResponse extends BasePagedResponse<ProductPageDto> {
    public IndexResponse(ProductPageDto data, int pageCount) {
        super(data, pageCount);
    }
}
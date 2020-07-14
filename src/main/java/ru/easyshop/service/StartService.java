package ru.easyshop.service;

import ru.easyshop.controller.index.IndexRequest;
import ru.easyshop.service.dto.ProductPageDto;

public interface StartService {

    ProductPageDto getProductsPaged(IndexRequest request);
}

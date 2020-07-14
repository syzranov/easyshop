package ru.easyshop.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.easyshop.controller.index.IndexRequest;
import ru.easyshop.service.dto.ProductPageDto;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StartServiceImpl implements StartService {

    @Override
    public ProductPageDto getProductsPaged(IndexRequest request) {
        return ProductPageDto.builder()
                .products(Collections.emptyList())
                .build();
    }
}

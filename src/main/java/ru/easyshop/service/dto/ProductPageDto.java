package ru.easyshop.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
public class ProductPageDto implements Serializable {

    @Schema(description = "Список продуктов")
    private List<ProductPageDto.Product> products;

    @Schema(description = "Информация по продукту")
    @Getter
    @Setter
    public static class Product {

        private int id;

        @Schema(description = "Наименвоание товарной позиции", required = true)
        private String name;

        @Schema(description = "Описание товарной позиции", required = true)
        private String description;
    }
}
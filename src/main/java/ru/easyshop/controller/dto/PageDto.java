package ru.easyshop.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Страница")
public class PageDto<T> implements Serializable {

    @Schema(description = "Данные страница")
    private List<T> data;

    @Schema(description = "Размер строк на странице")
    private Integer pageSize;

    @Schema(description = "Номер строк на странице")
    private Integer pageNumber;

    @Schema(description = "Всего страниц")
    private Integer pageCount;
}
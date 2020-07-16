package ru.easyshop.database.entity.base;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class BaseObjectIdNameDescription extends BaseObjectIdName {

    @Schema(description = "description")
    @Column(name = "description")
    private String description;

}
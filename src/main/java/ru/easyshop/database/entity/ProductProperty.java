package ru.easyshop.database.entity;

import lombok.Getter;
import lombok.Setter;
import ru.easyshop.database.entity.base.BaseObjectId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductProperty extends BaseObjectId {

    @Column(name = "price")
    private float price;

    @Column(name = "short_description")
    private String shortDescription;
}

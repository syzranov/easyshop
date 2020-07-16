package ru.easyshop.database.entity;

import lombok.Getter;
import lombok.Setter;
import ru.easyshop.database.entity.base.BaseObjectIdNameDescription;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product extends BaseObjectIdNameDescription {

    @Column(name = "price")
    private float price;

    @Column(name = "short_description")
    private String shortDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id")
    private Property property;
}

package ru.easyshop.database.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.easyshop.database.entity.base.BaseObjectIdName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "property_type")
public class PropertyType extends BaseObjectIdName {

    @Column(name = "data")
    private String data;
}

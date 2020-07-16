package ru.easyshop.database.entity.landing;

import lombok.Getter;
import lombok.Setter;
import ru.easyshop.database.entity.base.BaseObjectId;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "landing")
public class Landing extends BaseObjectId {

}

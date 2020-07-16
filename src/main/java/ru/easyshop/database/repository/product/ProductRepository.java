package ru.easyshop.database.repository.product;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.easyshop.database.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
}

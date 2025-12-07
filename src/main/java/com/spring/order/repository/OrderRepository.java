package com.spring.order.repository;

import com.spring.order.model.OrderEntity;
import org.jspecify.annotations.NonNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<@NonNull OrderEntity,@NonNull Long> {
}

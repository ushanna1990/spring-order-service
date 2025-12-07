package com.spring.order.repository;

import com.spring.order.model.OrderEntity;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<@NonNull OrderEntity,@NonNull Long> {
}

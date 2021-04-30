package com.lambdasys.insurance.payment.repository;

import com.lambdasys.insurance.payment.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}

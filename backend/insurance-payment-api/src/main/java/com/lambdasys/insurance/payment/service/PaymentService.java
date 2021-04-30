package com.lambdasys.insurance.payment.service;

import com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.lambdasys.insurance.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}

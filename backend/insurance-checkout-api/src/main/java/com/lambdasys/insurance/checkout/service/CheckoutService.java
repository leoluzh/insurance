package com.lambdasys.insurance.checkout.service;

import com.lambdasys.insurance.checkout.entity.CheckoutEntity;
import com.lambdasys.insurance.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}

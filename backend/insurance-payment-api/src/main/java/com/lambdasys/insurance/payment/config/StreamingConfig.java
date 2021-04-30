package com.lambdasys.insurance.payment.config;

import com.hatanaka.ecommerce.payment.streaming.CheckoutProcessor;
import com.lambdasys.insurance.payment.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(CheckoutProcessor.class)
public class StreamingConfig {
}

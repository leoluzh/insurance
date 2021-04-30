package com.lambdasys.insurance.checkout.config;

import com.lambdasys.insurance.checkout.streaming.CheckoutCreatedSource;
import com.lambdasys.insurance.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}

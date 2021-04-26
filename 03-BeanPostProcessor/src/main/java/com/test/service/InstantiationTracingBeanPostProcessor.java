package com.test.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.lang.Nullable;

import java.lang.annotation.Annotation;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor, Order {
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(("Before Bean '" + beanName + "' created : " + bean.toString()));
        return bean;
    }

    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(("After Bean '" + beanName + "' created : " + bean.toString()));
        return bean;
    }

    public int value() {
        return 0;
    }

    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

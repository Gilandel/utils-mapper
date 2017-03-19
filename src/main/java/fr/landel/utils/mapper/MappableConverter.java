/*
 * #%L
 * utils-mapper
 * %%
 * Copyright (C) 2016 - 2017 Gilandel
 * %%
 * Authors: Gilles Landel
 * URL: https://github.com/Gilandel
 * 
 * This file is under Apache License, version 2.0 (2004).
 * #L%
 */
package fr.landel.utils.mapper;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 
 * (Description)
 *
 * @since Mar 19, 2017
 * @author Gilles
 *
 */
@Documented
@Retention(CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface MappableConverter {

    Class<?> value() default Void.class;

    String key() default "";

    String property() default "";

    String expression() default "";
}

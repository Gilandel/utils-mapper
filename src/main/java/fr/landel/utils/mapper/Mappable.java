/*-
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

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation to map a DTO into an entity (and vis versa).
 *
 * @since Mar 18, 2017
 * @author Gilles
 *
 */
@Documented
@Retention(CLASS)
@Target(TYPE)
public @interface Mappable {

    /**
     * Reverse mapped class
     * 
     * @return The list of mapped remote class
     */
    Class<?>[] value();
}

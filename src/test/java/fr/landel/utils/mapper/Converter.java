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

import java.util.function.Function;

import org.apache.commons.collections4.Transformer;

public class Converter {

    public static final String CONVERT_FUNCTION_NAME = "fr.landel.utils.mapper.Converter.CONVERT_TYPE( ${s} )";
    public static final String CONVERT_METHOD_NAME = "fr.landel.utils.mapper.Converter#convert( ${s} )";

    public static final Function<String, Type> CONVERT_TYPE = s -> Type.valueOf(s);

    public static final Transformer<String, Type> TRANSFORMER = new Transformer<String, Type>() {
        @Override
        public Type transform(final String input) {
            return Type.valueOf(input);
        }
    };

    public static Type convert(final String input) {
        return Type.valueOf(input);
    }
}

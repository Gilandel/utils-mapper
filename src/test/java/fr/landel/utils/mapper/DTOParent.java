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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * (Description)
 *
 * @since Mar 18, 2017
 * @author Gilles
 *
 */
@Mappable(EntityParent.class)
public class DTOParent {

    @MappableProperty("READ")
    private long id;

    @MappableProperty(value = "READ", name = "title")
    private String name;

    @MappableProperty(value = "READ", mode = EnumMode.PRELOAD, deep = 3)
    private DTOChild child;

    @MappableProperty(value = {"READ", "WRITE"}, source = @MappableConverter(property = "s", expression = Converter.CONVERT_FUNCTION_NAME))
    private Type type;

    @MappableProperty(value = {"FULL"}, name = "type",
            source = @MappableConverter(property = "s", expression = Converter.CONVERT_METHOD_NAME))
    private Type type2;

    @MappableProperty(mode = EnumMode.LOAD, source = @MappableConverter(ArrayList.class), target = @MappableConverter(TreeSet.class))
    private Set<DTOChild> children;

    @MappableProperty(name = "type", mode = EnumMode.PRELOAD, source = @MappableConverter(HashMap.class),
            target = @MappableConverter(HashMap.class))
    private Map<Long, DTOChild> childrenMap;
}

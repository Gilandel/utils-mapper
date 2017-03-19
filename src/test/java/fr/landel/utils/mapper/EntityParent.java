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

import java.util.List;
import java.util.Map;

/**
 * (Description)
 *
 * @since Mar 18, 2017
 * @author Gilles
 *
 */
public class EntityParent {

    private long id;

    private String title;

    private EntityChild child;

    private String type;

    private List<EntityChild> children;

    private Map<Long, EntityChild> childrenMap;
}

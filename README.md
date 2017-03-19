utils-mapper


@MappableProperty
- map field to field

@MappableProperty(name="other_name")
- map field to field with other name

@MappableProperty(source = @MappableConverter(property = "s", expression = "fr.landel.utils.Converter.TO_TARGET.apply(${s}})"),
	target = @MappableConverter(property = "t", expression = "fr.landel.utils.Converter.TO_SOURCE.apply(${t}})"))
@MappableProperty(source = @MappableExpression(property = "s", expression = "fr.landel.utils.Transform.transform(${s})"))
@MappableProperty(source = @MappableExpression(property = "s", expression = "new fr.landel.utils.mapper.Type(${s})"))
- map field to field with other type (expression)

@MappableProperty(deep=DEEPEST) // DEEPEST=-1
@MappableProperty(deep=3)
- manage the deep of loading /saving

@MappableProperty(value="READ")
@MappableProperty(value={"READ", "WRITE"})
- key to define limit which property is loaded/saved

@MappableProperty(value="FULL") // include FULL=READ+WRITE
- manage key and sub key t avoid very long list

@MappableProperty(source = @MappableConverter(TreeSet.class), target = @MappableConverter(ArrayList.class))
- in case of interface, define constructor for source and target
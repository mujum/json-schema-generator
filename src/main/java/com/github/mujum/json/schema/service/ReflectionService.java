package com.github.mujum.json.schema.service;

import io.swagger.annotations.Api;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReflectionService {

    private static final String SWAGGER_ANNOTATION_PACKAGE_NAME = Api.class.getPackage().toString();

    public List<Annotation> getSwaggerAnnotations(Class clazz) {
        return Stream.of(clazz.getAnnotations())
            .filter(annotation ->
                annotation.getClass().getPackage().toString().startsWith(SWAGGER_ANNOTATION_PACKAGE_NAME))
            .collect(Collectors.toList());
    }
}
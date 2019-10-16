package com.github.mujum.json.schema.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.github.mujum.json.schema.service.ReflectionService;
import java.lang.annotation.Annotation;
import java.util.List;

public final class SwaggerUtils {

    private static ReflectionService reflectionService = new ReflectionService();

    private SwaggerUtils() {
    }

    public static JsonNode createJsonSchema(Class clazz) {
        JsonNode schema = JsonNodeFactory.instance.objectNode();

        final List<Annotation> swaggerAnnotations = reflectionService.getSwaggerAnnotations(clazz);


        return schema;
    }
}
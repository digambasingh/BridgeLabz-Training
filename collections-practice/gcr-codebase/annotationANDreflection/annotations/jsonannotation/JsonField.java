package com.bridgelabz.annotations.jsonannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {
    String name();
}


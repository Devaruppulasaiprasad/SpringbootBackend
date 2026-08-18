package com.accenture.ltt.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = SecretKeyValidator.class)
@Target( { ElementType.TYPE}) // tells the annotation can come at class level
@Retention(RetentionPolicy.RUNTIME)
public @interface SecretKeyValidatorVal {
	String message() default "{SecretKeyValidatorVal}"; // key to give the message
	// default methods need to keep as it is
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

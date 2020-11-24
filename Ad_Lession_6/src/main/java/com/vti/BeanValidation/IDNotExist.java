package com.vti.BeanValidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.vti.BeanValidation.IDNotExist.List;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR , ElementType.ANNOTATION_TYPE, ElementType.PARAMETER, ElementType.TYPE_USE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(List.class)
@Constraint(validatedBy = IDNotExistValidator.class)

public @interface IDNotExist {
	String message() default "{accountDto.id.IDNotExist}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR , ElementType.ANNOTATION_TYPE, ElementType.PARAMETER, ElementType.TYPE_USE })
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	@interface List {
		IDNotExist[] value();
	}
}

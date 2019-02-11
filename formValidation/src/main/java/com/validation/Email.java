/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author ntsep
 */
@Constraint(validatedBy = EmailConstrainValidator.class)
//where ca we use the validation
@Target({ElementType.METHOD, ElementType.FIELD})
//how long
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    
    //define default email code ,YOU CAN USE ALSO A SINGE STRING TO VALID
    //EX. public String value() default "@gmail"; **BUT YOU NEED TO CHANGE THE STRING ARRAY ON THE EMAILCONSTRAINTVALIDATOR ALSO
    public String[] value() default {"@gmail","@hotmail","@yahoo"};
    
    //define default error message
    public String message() default "give a valid email";
    
    //define default groups
    public Class<?>[] groups() default{};
    
    //define default payloads//additional info about the error that occur
    public Class<? extends Payload>[] payload() default{};
    
}

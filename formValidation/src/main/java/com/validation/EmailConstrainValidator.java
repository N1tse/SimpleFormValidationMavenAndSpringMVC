/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author ntsep
 */
public class EmailConstrainValidator implements ConstraintValidator<Email, String> {
    
    private String[] emailPrefixes;
    
    @Override
    public void initialize(Email email) {
        emailPrefixes = email.value();
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext ConstraintValidatorContext) {
        boolean result = false;
        
        //check if input is null,IF INPUT IS NULL RETURN TRUE AND CATCH THE NULLPOINTEREXCEPTION
        if(email != null){
            
            for(String temp:emailPrefixes){
                //check if the input contain the value of the emailPrefixes
                result = email.contains(temp);
                if(result){
                    break;
                }
            }
        }else{
              result = true;
        }
        return result;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.validation.Email;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author ntsep
 */
public class User {
    @NotNull(message="is required")
    @Size(min=1,message="is required!!!")
    private String username;
    @NotNull
    @Size(min=1,message="is required!!!")
    private String password;
    @NotNull(message="is required")
    @Size(min=1,message="is required!!!")
    private String fname;
    @NotNull
    @Size(min=1,message="is required!!!")
    private String lname;
    
    @NotBlank(message = "Please enter a number from 0 to 10")
    @Min(value=0, message="must be greater than 0")
    @Max(value=10, message="must be equal or less than 10")
    private Integer freePasses;
    
    @NotNull(message="is required")
    @Pattern(regexp="^[a-zA-Z0-9]{5}",message="5 characters only")
    private String postalCode;
    
    //YOU CAN OVERRIDE THE VALUE AND THE MESSAGE OF YOU CUSTOM VALIDATION
    //@Email(value="LIDA", message="must contain the word LIDA")
    //FOR OVERRIDE ARRAY OF STRINGS @Email(value={"LIDA","NITSE","LOKI"}, message="must contain the word LIDA")
    @NotNull(message="is required")
    @Email
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    
    
}

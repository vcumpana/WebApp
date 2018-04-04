package com.springapp.mvc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.springapp.mvc.model.Gender.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String password;
    private Gender gender;

    public boolean isMale(){
        return gender == MALE;
    }

}

package com.keydan.chamberoftrivia.Model;

import com.keydan.chamberoftrivia.Model.Enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class UserModel {
    @Id
    private Long id;
    private String username;
    private String password;
    private UserRole userRole;
    private Integer maxScore;
}

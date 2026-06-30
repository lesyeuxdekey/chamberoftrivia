package com.keydan.chamberoftrivia.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class GameModel {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
    private Long score;
    private Boolean won;


}

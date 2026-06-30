package com.keydan.chamberoftrivia.Repository;

import com.keydan.chamberoftrivia.Model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Long, GameModel> {
}

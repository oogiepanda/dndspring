package com.oogie.dndspring;

import com.oogie.dndspring.model.CharactersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactersRepository extends JpaRepository<CharactersEntity, Integer> {
}

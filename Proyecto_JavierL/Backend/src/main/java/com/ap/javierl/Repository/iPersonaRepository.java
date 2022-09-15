package com.ap.javierl.Repository;

import com.ap.javierl.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersonaRepository extends JpaRepository<Persona, Long>{
    
}


package com.ap.javierl.Service;

import com.ap.javierl.Entity.Persona;
import com.ap.javierl.Interface.iPersonaService;
import com.ap.javierl.Repository.iPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements iPersonaService{
    @Autowired iPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
      List<Persona> persona = ipersonaRepository.findAll();
      return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);  
        return persona;
    }
    
}

package com.ap.javierl.Interface;

import com.ap.javierl.Entity.Persona;
import java.util.List;

public interface iPersonaService {
    //treer lista de personas
    public List<Persona> getPersona();
    
    //Guardar  un objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}

package com.portfolio.ap.interfacee;

import com.portfolio.ap.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer una lista de Persona
    public List<Persona> getPersona();  
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminamos un objeto, lo buscamos por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);
    
}

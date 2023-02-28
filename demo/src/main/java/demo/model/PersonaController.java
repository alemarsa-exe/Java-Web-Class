package demo.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("personas")
public class PersonaController {
    @GetMapping("/getPerson")
    public ResponseEntity<Persona> getPersona(){
        Persona p = new Persona();
        p.setNombre("Alex");
        p.setEdad(20);
        Persona response = p;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Persona> savePersona(@RequestBody Persona p2){
        p2.getNombre();
        p2.getEdad();
        //Llamada al metodo de nuestro servicio que va a guardar a una persona
        return new ResponseEntity<>(p2,HttpStatus.OK);
    }
}

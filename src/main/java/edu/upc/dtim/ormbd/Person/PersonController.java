package edu.upc.dtim.ormbd.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private PersonService personService;
    PersonController(@Autowired PersonService personService){
        this.personService = personService;
    }

    @PostMapping("/person")
    public Person savePerson(@RequestParam String id)
    {
        Person person = new Person();
        person.setName(id);
        return personService.savePerson(person);
    }

}

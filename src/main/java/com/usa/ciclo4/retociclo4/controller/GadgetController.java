package com.usa.ciclo4.retociclo4.controller;

import com.usa.ciclo4.retociclo4.model.Gadget;
import com.usa.ciclo4.retociclo4.service.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gadget")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class GadgetController {
    @Autowired
    private GadgetService gadgetService;

    @GetMapping("/all")
    public List<Gadget> getAll(){
        return gadgetService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Gadget gadget){
        gadgetService.save(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget){
        return gadgetService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") String id){
        return  gadgetService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<Gadget> getProduct(@PathVariable("id") String id){
        return gadgetService.getGadget(id);
    }
}

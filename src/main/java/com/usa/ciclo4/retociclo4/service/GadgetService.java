package com.usa.ciclo4.retociclo4.service;

import com.usa.ciclo4.retociclo4.model.Gadget;
import com.usa.ciclo4.retociclo4.repository.GadgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GadgetService {
    @Autowired
    private GadgetRepository gadgetRepository;

    public List<Gadget> getAll(){
        return gadgetRepository.getAll();
    }

    public Optional<Gadget> getGadget(String id){
        return gadgetRepository.getGadget(id);
    }

    public Gadget save(Gadget gadget){
        if(gadget.getId() == null) {
            return gadget;
        }else{
            return gadgetRepository.save(gadget);
        }
    }

    public Gadget update(Gadget gadget) {

        if (gadget.getId() != null) {
            Optional<Gadget> dbGadget = gadgetRepository.getGadget(gadget.getId());
            if (!dbGadget.isEmpty()) {
                if (gadget.getBrand() != null) {
                    dbGadget.get().setBrand(gadget.getBrand());
                }
                if (gadget.getCategory() != null) {
                    dbGadget.get().setCategory(gadget.getCategory());
                }
                if (gadget.getPresentation() != null) {
                    dbGadget.get().setPresentation(gadget.getPresentation());
                }
                if (gadget.getDescription() != null) {
                    dbGadget.get().setDescription(gadget.getDescription());
                }
                if (gadget.getPrice() != 0.0) {
                    dbGadget.get().setPrice(gadget.getPrice());
                }
                if (gadget.getQuantity() != 0) {
                    dbGadget.get().setQuantity(gadget.getQuantity());
                }
                if (gadget.getPhotography() != null) {
                    dbGadget.get().setPhotography(gadget.getPhotography());
                }
                dbGadget.get().setAvailability(gadget.isAvailability());
                gadgetRepository.update(dbGadget.get());
                return dbGadget.get();
            } else {
                return gadget;
            }
        } else {
            return gadget;
        }
    }

    public boolean delete(String Id){
        return getGadget(Id).map(gadget -> {
            gadgetRepository.delete(gadget);
            return true;
        }).orElse(false);
    }
}

package com.usa.ciclo4.retociclo4.repository.crudrepository;

import com.usa.ciclo4.retociclo4.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GadgetCrudRepository extends MongoRepository<Gadget, String> {

}

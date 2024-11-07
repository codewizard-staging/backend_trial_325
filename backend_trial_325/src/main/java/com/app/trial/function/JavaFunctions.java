package com.app.trial.function;

import com.app.trial.model.Manager;
import com.app.trial.model.Pet;
import com.app.trial.model.PetCareCenter;
import com.app.trial.model.PetOwner;
import com.app.trial.model.Document;
import com.app.trial.model.PetService;
import com.app.trial.enums.PetServiceType;
import com.app.trial.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.trial.repository.PetServiceRepository;
import com.app.trial.repository.PetOwnerRepository;
import com.app.trial.repository.PetCareCenterRepository;
import com.app.trial.repository.ManagerRepository;
import com.app.trial.repository.DocumentRepository;
import com.app.trial.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   

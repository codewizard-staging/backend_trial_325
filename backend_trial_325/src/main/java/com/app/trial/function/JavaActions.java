package com.app.trial.function;

import com.app.trial.model.Manager;
import com.app.trial.model.Pet;
import com.app.trial.model.PetCareCenter;
import com.app.trial.model.PetOwner;
import com.app.trial.model.Document;
import com.app.trial.model.PetService;




import com.app.trial.enums.PetServiceType;
import com.app.trial.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  
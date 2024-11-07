package com.app.trial.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.trial.model.Manager;
import com.app.trial.model.Pet;
import com.app.trial.model.PetCareCenter;
import com.app.trial.model.PetOwner;
import com.app.trial.model.Document;
import com.app.trial.model.PetService;
import com.app.trial.enums.PetServiceType;
import com.app.trial.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterPets")
@Table(schema = "\"trial_294\"", name = "\"PetCareCenterPets\"")
@Data
public class PetCareCenterPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}
package de.fzi.cep.sepa.model.client.input;

import javax.persistence.Entity;

@Entity
public enum ElementType {
CHECKBOX, TEXT_INPUT, RADIO_INPUT, SELECT_INPUT, RADIO_GROUP_INPUT, SLIDER, DOMAIN_CONCEPT, MULTIPLE_VALUE, REPLACE;
}

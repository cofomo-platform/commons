package org.cofomo.commons.domain.exploration;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobilityProviderEntity extends MobilityProviderSuper {
	
	public MobilityProviderEntity(String name, String url, List<Integer> areas, List<String> offers) {
		super(name, url, areas, offers);
	}

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	String id;
	
	
}

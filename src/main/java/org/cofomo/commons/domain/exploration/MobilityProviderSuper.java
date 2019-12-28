package org.cofomo.commons.domain.exploration;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class MobilityProviderSuper {
	
	@NotBlank
	String name;
	
	@NotBlank
	String url;
	
	@NotNull
	@ElementCollection
	List<Integer> operationAreas;
	
	@NotNull
	@ElementCollection
	List<String> serviceOffers;
	
	@NotNull
	boolean alive;
	
	@NotNull
	LocalDateTime lastHeartBeat;
	
	public MobilityProviderSuper(String name, String url, List<Integer> areas, List<String> offers) {
		this.name = name;
		this.url = url;
		this.operationAreas = areas;
		this.serviceOffers = offers;
		this.lastHeartBeat = LocalDateTime.now();
		this.alive = true;
	}
}

package org.cofomo.commons.domain.exploration;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
	
	@NotNull
	public double latitude;
	
	@NotNull
	public double longitude;
}

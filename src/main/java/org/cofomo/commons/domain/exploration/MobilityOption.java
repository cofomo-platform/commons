package org.cofomo.commons.domain.exploration;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobilityOption {
	
	@NotNull
	MobilityProviderEmbedded provider;

	@NotNull
	Location pickupLocation;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	Date pickupTime;
}

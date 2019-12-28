package org.cofomo.commons.domain.identity;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class VerifiableClaim {
	
	// later
	String context;
	
	@NotBlank
	String type;
	
	@NotBlank
	String owner;
	
	@NotBlank
	String issuer;
	
	@URL
	@NotBlank
	String validation;
	
	@NotBlank
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	Date issuanceDate;
	
}

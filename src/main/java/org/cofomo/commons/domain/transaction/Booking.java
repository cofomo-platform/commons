package org.cofomo.commons.domain.transaction;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.cofomo.commons.domain.exploration.MobilityOption;
import org.cofomo.commons.domain.identity.VerifiableClaim;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	String id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	@NotBlank
	Date startTime;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	@NotBlank
	Date endTime;
	
	@NotBlank
	MobilityOption option;
	
	@NotBlank
	@ElementCollection
	List<VerifiableClaim> claims;
	
	@NotBlank
	String status;
	
	@NotBlank
	@ElementCollection
	List<String> communicationOptions;
	
	public Booking(MobilityOption option, List<VerifiableClaim> claims, String status, List<String> communicationOptions) {
		this.option = option;
		this.claims = claims;
		this.status = status;
		this.communicationOptions = communicationOptions;
	}
}

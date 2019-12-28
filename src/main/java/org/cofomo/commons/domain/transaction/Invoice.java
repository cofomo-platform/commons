package org.cofomo.commons.domain.transaction;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	String id;
	
	@NotBlank
	String paymentProviderId;
	
	@NotBlank
	String clientId;
	
	@NotBlank
	String status;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	@NotBlank
	Date lastUpdate;
	
	@NotBlank
	double value;
	
	@NotBlank
	String currency;
	
	public Invoice(String status, double value, String currency) {
		this.status = status;
		this.value = value;
		this.currency = currency;
	}
}

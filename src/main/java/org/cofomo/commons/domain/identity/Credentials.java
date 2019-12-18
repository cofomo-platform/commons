package org.cofomo.commons.domain.identity;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credentials {
	
	@NotBlank
	String username;
	
	@NotBlank
	String password;
}

package org.cofomo.commons.domain.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @NotBlank
    private String username;
    
    @NotBlank
    private String password;
}

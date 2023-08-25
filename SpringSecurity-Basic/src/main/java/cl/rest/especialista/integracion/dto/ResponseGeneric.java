package cl.rest.especialista.integracion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author avenegas
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseGeneric {
	
	private String message;

}

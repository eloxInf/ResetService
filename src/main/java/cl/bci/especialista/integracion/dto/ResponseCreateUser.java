package cl.bci.especialista.integracion.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author avenegas
 *
 */
@Data
public class ResponseCreateUser {
	private String idUser;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "UTC")
	private Date created;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "UTC")
	private Date modified;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "UTC")
	private Date lastLogin;
	private String token;
	private Boolean isActive;

}

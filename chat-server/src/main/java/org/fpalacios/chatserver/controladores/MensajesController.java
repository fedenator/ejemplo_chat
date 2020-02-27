package org.fpalacios.chatserver.controladores;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import org.fpalacios.chatserver.modelos.*;

@RestController
public class MensajesController
{

	@GetMapping("/api/mensajes")
	public List<MensajeDTO> mensajes()
	{
		return Arrays.asList(
			new MensajeDTO("Facu", "Hola"    ),
			new MensajeDTO("Fede", "Alo"     ),
			new MensajeDTO("Facu", "Tu vieja")
		);
	}
}

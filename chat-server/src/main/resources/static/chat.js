let mensajes = [
];

function descargar_mensajes() {
	fetch('/api/mensajes')
		.then(function(response) {
			return response.json();
		})
		.then(function(json) {
			mensajes = json;
		});

	mostrar_mensajes();

	setTimeout( () => {
		descargar_mensajes();
	}, 1000);
}
document.addEventListener('DOMContentLoaded', descargar_mensajes, false);

function mostrar_mensajes() {
	let caja_de_mensajes = document.querySelector(".chat-caja_de_mensajes");

	let html_mensajes = "";

	for (let mensaje of mensajes)
	{
		html_mensajes += `
			<div class="chat-mensaje">
				<span class="chat-mensaje-nombre">${mensaje.nombre}:</span>
				<span class="chat-mensaje-contenido">${mensaje.contenido}</span>
			</div>
		`;
	}

	caja_de_mensajes.innerHTML = html_mensajes;
}

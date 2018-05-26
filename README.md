# springmicroservicesnetflix
Ejemplos de microservicios con springboot utilizando API de Netflix y Docker

<h3>Se compone de tres proyectos:</h3>

serviceregistry: utiliza Netflix - Eureka
servicezuul: utiliza Netflix - Zuul
servicesaludar: es un microservicio que imprime la ip de la máquina donde está atendiendo la solicitud.

<h3>Para subir los componentes:</h3>

Primero debe subirse el serviceregistry y luego el servicezuul.
Finalmente se sube el servicesaludar.

<h3>Para probar el servicio:</h3>

Ejecuta la siguiente url: <h3>http://{nombre del host o IP}:{puerto}/saludar/{mensaje}</h3>

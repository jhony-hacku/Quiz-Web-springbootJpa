# El Quiz fue resuelto y probado con Postman
---
## Prueba 1:
Post http://localhost:8080/productos
body:
{
  "nombre": "Laptop Gaming",
  "categoria": "Tecnologia",
  "precio": 2500000.00,
  "activo": true
}

## Prueba 2:

GET http://localhost:8080/productos/buscar/Tecnologia

---
## Verificación en H2:

Igual para entrar a la consola de h2 usamos:
url= jdbc:h2:mem:quizdb
user= sa
passw= 

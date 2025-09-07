# Gestion-de-Pedidos---Microservicios-Product Service

Proyecto: Desarrollo en arquitectura Microservicios implementando Spring Security para Register y Login de usuarios, protocolos de generacion de Token y Autenticacion (Micro Auth Service)
-Cada microservicio con base de datos MySQL y tablas generadas automaticamente a partir de cada entidad. 

**Productservice – gestión de productos**

**Función principal: CRUD de productos.**

- Entradas: peticiones HTTP para crear, actualizar, eliminar o consultar productos.

GET /api/products → lista todos los productos (público).

GET /api/products/{id} → obtener un producto por ID (público).

POST /api/products → crear producto (requiere JWT).

PUT /api/products/{id} → actualizar producto (requiere JWT).

DELETE /api/products/{id} → eliminar producto (requiere JWT).

- Salidas: JSON con información del producto o estado de la operación.

Cómo usa authservice:

Protege endpoints con JWT emitido por authservice.

No interactúa directamente con la BD de usuarios.

**Patrones de diseño aplicados en microservicios con Spring Boot**

Este enfoque permitió construir microservicios seguros, modulares y fáciles de mantener, aplicando prácticas recomendadas de arquitectura de software y patrones de diseño en Java.


- Singleton
Los beans de Spring (@Service, @Repository, @Controller) se crean como instancias únicas, garantizando eficiencia en la gestión de recursos.

- Repository Pattern
Implementado con Spring Data JPA (OrderRepository, ProductRepository). Aísla la lógica de persistencia de la lógica de negocio, facilitando pruebas unitarias y cambios de base de datos sin afectar otras capas.

- DTO (Data Transfer Object)
Uso de clases DTO (OrderRequestDTO, OrderResponseDTO, etc.) para transportar datos entre capas sin exponer directamente las entidades. Esto asegura encapsulamiento y una API clara y estable.

- Facade
Los controladores (OrderController, ProductController) funcionan como fachada entre el cliente (frontend/Postman) y la lógica interna, exponiendo una interfaz simple y desacoplada.

- Proxy
Con Feign Clients (AuthServiceClient, ProductClient), cada microservicio se comunica con otros de forma transparente, como si fueran servicios locales, aplicando el patrón Proxy.

- Strategy
En el módulo de seguridad (JwtUtil, JwtFilter), la validación de tokens JWT se implementa como estrategia, lo que permite cambiar algoritmos o reglas de autenticación sin impactar el resto del sistema.

 

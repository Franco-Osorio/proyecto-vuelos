# Flight Management System ✈️

Aplicación web desarrollada con Spring Boot bajo el patrón MVC para la gestión de vuelos.  
Incluye backend estructurado, conexión a base de datos MySQL y vistas HTML simples para interacción del usuario.

---

## 🚀 Tecnologías utilizadas

- Java
- Spring Boot
- Spring MVC
- MySQL
- JPA / Hibernate
- Maven
- Postman (para pruebas de endpoints)

---

## 🏗 Arquitectura

El proyecto sigue el patrón **MVC (Model-View-Controller)**:

- **Model**: Entidades JPA y repositorios.
- **Controller**: Manejo de requests HTTP.
- **View**: Vistas HTML renderizadas desde el backend.
- **Service Layer**: Lógica de negocio desacoplada.

---

## 📌 Funcionalidades

- CRUD de vuelos
- Persistencia en base de datos MySQL
- Validaciones básicas
- Manejo de rutas y formularios web

---

## 🔧 Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Configurar credenciales de MySQL en `application.properties`
3. Ejecutar:

```bash
mvn spring-boot:run
```

## 📚 Objetivo del proyecto

Proyecto académico orientado a consolidar conocimientos en:
- Arquitectura MVC
- Desarrollo backend con Spring Boot
- Persistencia con JPA
- Integración con base de datos relacional

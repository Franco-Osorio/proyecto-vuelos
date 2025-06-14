package com.example.ProyectoVuelosOsorio.repositories;

import com.example.ProyectoVuelosOsorio.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {

    Usuario findByCorreoUsuario(String correo);

    @Query(value = "SELECT u FROM Usuario u WHERE u.correoUsuario LIKE %:filtro%")
    List<Usuario> search(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM usuario WHERE usuario.correo_usuario LIKE %:filtro%",
            nativeQuery = true
    )
    List<Usuario> searchNativo(@Param("filtro") String filtro);
}

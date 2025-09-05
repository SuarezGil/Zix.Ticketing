package org.zix.GestionEventosTicketing.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zix.GestionEventosTicketing.persistence.entity.Usuario;

public interface UsuarioCrud extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
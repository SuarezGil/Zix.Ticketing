package org.zix.GestionEventosTicketing.dominio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zix.GestionEventosTicketing.persistence.crud.UsuarioCrud;
import org.zix.GestionEventosTicketing.persistence.entity.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioCrud usuarioCrud;

    public boolean validarCredenciales(String email, String password) {

        Usuario usuario = usuarioCrud.findByEmail(email);


        return usuario != null && usuario.getPassword().equals(password);
    }
}

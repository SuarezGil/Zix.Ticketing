package org.zix.GestionEventosTicketing.web.controller;


import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.zix.GestionEventosTicketing.dominio.service.UsuarioService;
import org.zix.GestionEventosTicketing.entity.Usuario;

@Controller
public class IndexController {

    private Usuario usuario = new Usuario();

    @Autowired
    private UsuarioService usuarioService; // Inyectamos el servicio de usuario

    // Getters y setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método para manejar el login
    public String login() {
        if (usuarioService.validarCredenciales(usuario.getEmail(), usuario.getPassword())) {
            // Si las credenciales son correctas, redirigimos a la página de inicio
            return "inicio"; // Este es el nombre de la página a la que se redirige
        } else {
            // Si las credenciales son incorrectas, mostramos un mensaje de error
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Credenciales incorrectas"));
            return null; // No redirige, solo muestra el mensaje de error
        }
    }

    // Método para inicializar la vista principal si lo necesitas
    public String mostrarDescripcion() {
        return "Bienvenido al Sistema de Gestión de Eventos y Ticketing";
    }
}

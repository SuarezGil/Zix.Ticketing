package org.zix.GestionEventosTicketing.dominio.service;

import org.aspectj.weaver.ast.Or;
import org.zix.GestionEventosTicketing.persistence.entity.Evento;
import org.zix.GestionEventosTicketing.persistence.entity.Organizador;

import java.util.List;

public class IOrganizadorService {

    public List<Organizador> listarOrganizadores();
    public Organizador buscarOrganizadorPorId(Integer codigo);
    public void guardarOrganizador(Organizador organizador);
    public void eliminarOrganizador(Organizador organizador);
}

package org.zix.GestionEventosTicketing.dominio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.zix.GestionEventosTicketing.persistence.entity.Organizador;
import org.zix.GestionEventosTicketing.persistence.crud.OrganizadorCrud;

import java.util.List;

public class OrganizadorService {
    @Autowired
    private OrganizadorCrud crud;

    @Override
    public List<Organizador> listarOrganizadores() {
        List<Organizador> Organizadores = crud.findAll();
        return Organizadores;
    }

    @Override
    public Organizador buscarOrganizadorPorId(Integer codigo) {
        Organizador organizador = crud.findById(codigo).orElse(null);
        return organizador;
    }

    @Override
    public void guardarOrganizador(Organizador organizador) {
        crud.save(organizador);

    }

    @Override
    public void eliminarOrganizador(Organizador organizador) {
        crud.delete(organizador);
    }
}

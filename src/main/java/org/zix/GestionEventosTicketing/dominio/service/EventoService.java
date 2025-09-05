package org.zix.GestionEventosTicketing.dominio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.zix.GestionEventosTicketing.persistence.crud.EventoCrud;
import org.zix.GestionEventosTicketing.persistence.entity.Evento;

import java.util.List;

    @Autowired
    private EventoCrud crud;

    @Override
    public List<Evento> listarEventos() {
        List<Evento> Eventos = crud.findAll();
        return Eventos;
    }

    @Override
    public Evento buscarEventoPorId(Integer codigo) {
        Evento evento = crud.findById(codigo).orElse(null);
        return evento;
    }

    @Override
    public void guardarEvento(Evento evento) {
        crud.save(evento);

    }

    @Override
    public void eliminarEvento(Evento evento) {
        crud.delete(evento);
    }
}

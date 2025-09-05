package org.zix.GestionEventosTicketing.dominio.service;

import org.zix.GestionEventosTicketing.persistence.entity.Evento;

import java.util.List;

public class IEventoService {

    public List<Evento> listarEventos();
    public Evento buscarEventoPorId(Integer codigo);
    public void guardarEvento(Evento evento);
    public void eliminarEvento(Evento evento);
}

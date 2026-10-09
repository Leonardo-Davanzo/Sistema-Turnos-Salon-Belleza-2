package ar.edu.unahur.obj2.peluqueria.turnos;

import ar.edu.unahur.obj2.peluqueria.clientes.Cliente;
import ar.edu.unahur.obj2.peluqueria.servicios.Servicio;

public class Turno {
    private Cliente cliente;
    private Servicio servicio;
    private Integer cantSesiones;
    private Double importeTotal;

    
    public Servicio getServicio() {
        return servicio;
    }
    
    public Double getImporteTotal() {
        return importeTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Integer getCantSesiones() {
        return cantSesiones;
    }
    
    public void setCantSesiones(Integer cantSesiones) {
        this.cantSesiones = cantSesiones;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void calcularImporteTotal() {
        this.importeTotal = servicio.getCosteBase() * cantSesiones * cliente.getCategoria().descuento();
    }
}

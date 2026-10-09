package ar.edu.unahur.obj2.peluqueria.clientes;

import java.util.List;

import ar.edu.unahur.obj2.peluqueria.categorias.Categoria;
import ar.edu.unahur.obj2.peluqueria.categorias.Vip;
import ar.edu.unahur.obj2.peluqueria.exceptions.CategoriaNoAutorizadaException;
import ar.edu.unahur.obj2.peluqueria.exceptions.ClienteSinTurnosException;
import ar.edu.unahur.obj2.peluqueria.turnos.Turno;

public class Cliente {
    private String nombre;
    private Categoria categoria;
    private List<Turno> historialDeTurnos;

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nNombre){
        this.nombre = nNombre;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria nCategoria){
        if (nCategoria instanceof Vip && historialDeTurnos.isEmpty()){
            throw new CategoriaNoAutorizadaException("el cliente debe haber ido al salon al menos una vez antes de tener este descuento");
        }
        else{
            this.categoria = nCategoria;
        }
    }

    public List<Turno> getHistorialDeTurnos(){
        if (historialDeTurnos.isEmpty()) {
            throw new ClienteSinTurnosException("el cliente tiene el historial de turnos vacio");
        }else{
            return historialDeTurnos;
        }
    }

    public void agregarTurno(Turno turno){
        historialDeTurnos.add(turno);
    }

    public Double costoTotalTurnos(){ 
        return historialDeTurnos.stream().mapToDouble(t -> t.getServicio().getCosteBase()).sum();
    }
}

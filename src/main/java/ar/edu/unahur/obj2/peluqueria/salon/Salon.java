package ar.edu.unahur.obj2.peluqueria.salon;

import java.util.List;

import ar.edu.unahur.obj2.peluqueria.turnos.Turno;

public class Salon {
    private List<Turno> turnos;
    private Double recargoUsoInsumos;
    public Double getRecargoUsoInsumos() {
        return recargoUsoInsumos;
    }

    public void setRecargoUsoInsumos(Double recargoUsoInsumos) {
        this.recargoUsoInsumos = recargoUsoInsumos;
    }
    
    public List<Turno> getTurnos() {
        return turnos;
    }

    public void añadirTurno(Turno nTurno){
        turnos.add(nTurno);
    }
    
}

package ar.edu.unahur.obj2.peluqueria.servicios;

import ar.edu.unahur.obj2.peluqueria.exceptions.CantidadInvalidaException;
import ar.edu.unahur.obj2.peluqueria.exceptions.PrecioBaseNegativoException;

public abstract class Servicio {
    protected  Double costeBase;
    protected Integer cantCuposDisponibles;
    
    public Integer getCantCuposDisponibles(){
        return cantCuposDisponibles;
    }

    public void setCantCuposDisponibles(Integer cantCuposDisponibles) {
        this.cantCuposDisponibles = cantCuposDisponibles;
    }

    public Double getCosteBase(){
        return costeBase;
    }

    public void setCosteBase(Double costeBase) {
        
        if(costeBase <= 0){
            throw new PrecioBaseNegativoException("el precio base debe ser un numero positivo");
        }
        else{
            this.costeBase = costeBase;
        }
        
    }

    protected void confirmarTurno(){
        cantCuposDisponibles = -1;
        if(cantCuposDisponibles <= 0){
            throw new CantidadInvalidaException("no hay mas cupos disponibles");
        }else{
            comprobante();
        }
    }

    protected abstract String comprobante();
}

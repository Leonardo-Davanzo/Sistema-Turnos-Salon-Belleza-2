package ar.edu.unahur.obj2.peluqueria.servicios;

import ar.edu.unahur.obj2.peluqueria.exceptions.CantidadInvalidaException;

public class TratamientoCapilar extends Servicio{
    private Integer cantidadSesiones;
    
    @Override
    public String comprobante(){
        return "TRN-TRA-" + costeBase;
    }
    
    public Integer getcantidadSesiones(Integer num){
        return cantidadSesiones;
    }
    
    public void setcantidadSesiones(Integer num){
        cantidadSesiones = num;
    }
    @Override
    public void confirmarTurno(){
        cantCuposDisponibles =-cantidadSesiones;
        if(cantCuposDisponibles <= 0){
            throw new CantidadInvalidaException("no alcanzan los cupos para este tipo de servicio");
        }
        comprobante();
    }
}

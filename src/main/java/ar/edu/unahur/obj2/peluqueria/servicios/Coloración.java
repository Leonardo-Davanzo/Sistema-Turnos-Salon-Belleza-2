package ar.edu.unahur.obj2.peluqueria.servicios;

public class Coloración extends Servicio{
    @Override
    public String comprobante(){
        return "TRN-COL-" + costeBase;
    }
}

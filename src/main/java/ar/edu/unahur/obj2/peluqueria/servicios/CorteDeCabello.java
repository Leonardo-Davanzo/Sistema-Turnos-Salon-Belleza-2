package ar.edu.unahur.obj2.peluqueria.servicios;

public class CorteDeCabello extends Servicio{
    @Override
    public String comprobante(){
        return "TRN-COR-" + costeBase;
    }
}

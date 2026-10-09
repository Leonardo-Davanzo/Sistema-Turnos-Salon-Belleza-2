package ar.edu.unahur.obj2.peluqueria.exceptions;

public class ClienteSinTurnosException extends RuntimeException{

    public ClienteSinTurnosException(String mensaje){
        super(mensaje);
    }
}

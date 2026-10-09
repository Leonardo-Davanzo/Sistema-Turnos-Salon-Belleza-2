package ar.edu.unahur.obj2.peluqueria.exceptions;

public class CategoriaNoAutorizadaException extends RuntimeException{
    public CategoriaNoAutorizadaException(String mensaje){
        super(mensaje);
    }
}

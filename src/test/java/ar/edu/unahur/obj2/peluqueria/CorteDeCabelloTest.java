package ar.edu.unahur.obj2.peluqueria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.categorias.Categoria;
import ar.edu.unahur.obj2.peluqueria.categorias.Frecuente;
import ar.edu.unahur.obj2.peluqueria.categorias.Ocasional;
import ar.edu.unahur.obj2.peluqueria.categorias.Vip;
import ar.edu.unahur.obj2.peluqueria.servicios.CorteDeCabello;
import ar.edu.unahur.obj2.peluqueria.servicios.Servicio;

public class CorteDeCabelloTest {

    @Test 
    @DisplayName("dado Precio Base Y Cupos Validos al Crear El Servicio quedan Registrados")
    public void dadoPrecioBaseYCuposValidos_alCrearElServicio_quedanRegistrados() {
        Servicio s = new CorteDeCabello();
        s.setCantCuposDisponibles(3);
        s.setCosteBase(10.0);
        
        assertEquals(3, s.getCantCuposDisponibles());
        assertEquals(10.0, s.getCosteBase());
    }
    @Test 
    @DisplayName ("cada categoria descuenta lo que debería")
    public void categoriaHaceDescuento() {
        Categoria c1 = new Ocasional();

        Double valorObtenido1 = c1.descuento() * 10.0;

        assertEquals(10.0, valorObtenido1);
        
        Categoria c2 = new Frecuente();

        Double valorObtenido2 = c2.descuento() * 10.0;

        assertEquals(9, valorObtenido2);

        Categoria c3 = new Vip();

        Double valorObtenido3 = c3.descuento() * 10.0;

        assertEquals(8, valorObtenido3);
    }
}


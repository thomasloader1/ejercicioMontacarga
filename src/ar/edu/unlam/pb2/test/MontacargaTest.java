package ar.edu.unlam.pb2.test;

import ar.edu.unlam.pb2.ejercicioParcial.Carga;
import ar.edu.unlam.pb2.ejercicioParcial.Montacarga;
import ar.edu.unlam.pb2.ejercicioParcial.PesoMaximoException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MontacargaTest {

    @Test(expected = PesoMaximoException.class)
    public void testQueVerifiqueElPesoMaximo() throws Exception {
        Montacarga miMontacarga = new Montacarga(10000);
        Carga miCarga = new Carga(10001);

        miMontacarga.cargar(miCarga);

        }

     @Test
    public void testQueVerificaUnaDescargaExitosa(){
        Montacarga miMontacarga = new Montacarga(1000);
        Carga miCarga = new Carga(800);

         try {
             miMontacarga.cargar(miCarga);
         } catch (Exception e) {
             e.printStackTrace();
         }

         miMontacarga.descargar();

         Integer expect = 0;
         Integer actual = miMontacarga.obtenerCarga();

         assertEquals(expect,actual);
     }

    }


package ar.edu.unlam.pb2.ejercicioParcial;

import java.util.ArrayList;

public class Montacarga {

    public Integer pesoMaximoKg;
    public ArrayList<Carga> cargas;
    public Carga cargaActual;

    public Montacarga(Integer pesoMaximoKg){
        this.pesoMaximoKg = pesoMaximoKg;

        this.cargas = new ArrayList<Carga>();
    }

    public Integer obtenerCarga(){

        return this.cargaActual.peso;
    }

    public void cargar(Carga carga) throws Exception {
        cargaActual = new Carga(carga.peso);
        if(carga.peso >= this.pesoMaximoKg){
            throw new PesoMaximoException();
        }else{
            this.cargaActual = carga;
            this.cargas.add(carga);
        }
    }

    public void descargar(){
        this.cargaActual.peso = 0;
    }

    public Integer obtenerCargaPromedio(){
        Integer cantidad= this.cargas.size();
        Integer total = 0;

        for(int i=0; i < this.cargas.size(); i++){
            total += this.cargas.get(i).peso;
        }
       Integer promedio = total / cantidad;
        return promedio;
    }
}

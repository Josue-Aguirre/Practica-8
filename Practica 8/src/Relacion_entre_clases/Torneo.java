package Relacion_entre_clases;

import java.util.HashMap;
import java.util.Map;

public class Torneo {
	private String nombre, region;
    private int pj, pp, nep;
    private Map<Integer, Equipo> equipos;

    public Torneo(String nombre, String region, int pj, int pp, int nep){
        this.equipos = new HashMap<>();

        this.setNombre(nombre);
        this.setRegion(region);
        this.setNEP(nep);
        this.setPJ(pj);   
        this.setPP(pp);
       
        this.agregarEquipos();
        }

    private void agregarEquipos(){
        for(int i=0; i<this.getNEP(); i++){
            Equipo equipo = new Equipo(
            Registro.capturarString("Nombre de equipo"),
            Registro.capturarString("Division"),
            Registro.capturarString("Nombre del entrenador"),
            Registro.capturarEntero("Torneos con participacion"),
            Registro.capturarEntero("Torneos ganados"),
            Registro.capturarEntero("Torneos perdidos"),
            Registro.capturarEntero("Cantidad de jugadores en el equipo"),
            i);

            this.equipos.put(i, equipo);
        }
    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }
    private void setRegion(String region) {
        this.region = region;
    }

    public int getPJ() {
        return pj;
    }
    private void setPJ(int pj) {
        this.pj = pj;
    }

    public int getPP() {
        return pp;
    }
    private void setPP(int pp) {
        this.pp = pp;
    }

    public int getNEP() {
        return nep;
    }
    private void setNEP(int nep) {
        this.nep = nep;
    }

    public int getJR(int equipo){
        return this.equipos.get(equipo).getJR();
    }

    public String getnj(int equipo, int jugador){
        return this.equipos.get(equipo).getNombreJugador(jugador);
    }

    public int getNU(int equipo, int jugador){
        return this.equipos.get(equipo).getNumeroUniforme(jugador);
    }
   
    public String getE(int equipo){
        return this.equipos.get(equipo).getNombre();
    }
    
    public String getDiv(int equipo){
        return this.equipos.get(equipo).getDiv();
    }
    
    public int getPE(int equipo){
        return this.equipos.get(equipo).PA();
    }
    
    public int getPuntosAnotados(int equipo){
        return this.equipos.get(equipo).PA();
    }
}

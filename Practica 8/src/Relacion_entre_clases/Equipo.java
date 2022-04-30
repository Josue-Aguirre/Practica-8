package Relacion_entre_clases;

import java.util.HashMap;
import java.util.Map;

public class Equipo {
	private String nom_eq, div, ent;
    private int tor_par, tor_gan, tor_perd, can_jug, num_eq;
    public Map<Integer, Jugador> jugadores;
    
    public Equipo(String nom_eq, String div, String ent, int tor_par, int tor_gan, int tor_perd, int can_jug, int num_eq){
        this.jugadores = new HashMap<>();
        this.setNombre(nom_eq);
        this.setDiv(div);
        this.setEnt(ent);
        this.setTor_Par(tor_par);
        this.setTor_Gan(tor_gan);
        this.setTor_Perd(tor_perd);
        this.setCantidadDeJugadores(can_jug);
        this.setNum_Eq(num_eq);

        this.agregarJugador();
    }

    private void agregarJugador(){
        for(int i=0; i<this.getNumeroJugadores(); i++){
            System.out.printf("\nJugador %d", i+1);
            Jugador jugador = new Jugador(this.validarNumeroUniforme(i, 
            Registro.capturarEntero("Numero de uniforme")), 
            Registro.capturarString("Nombre"), 
            Registro.capturarEntero("Puntos anotados"), 
            Registro.capturarString("Posicion"),
            Registro.capturarFloat("Estatura"));
            this.jugadores.put(i, jugador);
        }
    }

    public int validarNumeroUniforme(int jugador, int numeroDeUniforme){
        if(this.jugadores.isEmpty()){
            return numeroDeUniforme;
        }
        else{
            for(int i=0; i<this.getJR();i++){
                if(numeroDeUniforme==this.jugadores.get(i).getNum_Uni()){
                    numeroDeUniforme=Registro.capturarEntero("Invalido. Ingresar otro numero disponible");
                }
            }
        }
        return numeroDeUniforme;
    }

    public int PA(){
        int puntosTotales=0, jugReg;
        jugReg = this.getJR();
        
        for (int i=0; i<jugReg; i++){
            puntosTotales += this.jugadores.get(i).getPA();
        }
        return puntosTotales;
    }

    public String getNombre(){
        return nom_eq;
    }
    private void setNombre(String nom_eq){
        this.nom_eq = nom_eq;
    }

    public String getDiv(){
        return div;
    }
    private void setDiv(String div){
        this.div = div;
    }

    public String getEnt(){
        return ent;
    }
    private void setEnt(String ent){
        this.ent = ent;
    }

    public int getTor_Par(){
        return tor_par;
    }
    private void setTor_Par(int tor_par){
        this.tor_par = tor_par;
    }

    public int getTor_Gan(){
        return tor_gan;
    }
    private void setTor_Gan(int tor_gan){
        this.tor_gan = tor_gan;
    }

    public int getTor_Perd(){
        return tor_perd;
    }
    private void setTor_Perd(int tor_perd){
        this.tor_perd = tor_perd;
    }

    public int getNumeroJugadores(){
        return can_jug;
    }
    private void setCantidadDeJugadores(int can_jug){
        this.can_jug = can_jug;
    }

    public int getNum_Eq(){
        return num_eq;
    }
    private void setNum_Eq(int num_eq){
        this.num_eq = num_eq;
    }

    public int getJR(){
        return jugadores.size();
    }

    public String getNombreJugador(int jugador){
        return jugadores.get(jugador).getNombre();
    }
    public int getNumeroUniforme(int jugador){
        return jugadores.get(jugador).getNum_Uni();
    }
}

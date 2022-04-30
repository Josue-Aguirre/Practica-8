package Relacion_entre_clases;

public class Jugador {
	private int num_uni, pa;
    private String nombre, pos;
    private float est;

    public Jugador(int num_uni, String nombre, int pa, String pos, float est){
        this.setNum_Uni(num_uni);
        this.setNombre(nombre);
        this.setPA(pa);
        this.setPos(pos);
        this.setEst(est);
    }

    private void setNum_Uni(int num_uni) {
        this.num_uni = num_uni;
    }
    public int getNum_Uni() {
        return num_uni;
    }

    private void setPA(int pa) {
        this.pa = pa;
    }
    public int getPA() {
        return pa;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    private void setPos(String pos) {
        this.pos = pos;
    }
    public String getPos() {
        return pos;
    }

    private void setEst(float est) {
        this.est = est;
    }
    public float getEst() {
        return est;
    }
}

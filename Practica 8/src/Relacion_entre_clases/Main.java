package Relacion_entre_clases;

public class Main{

	public static void main(String[] args) {
		Torneo t = new Torneo(
            
			Registro.capturarString("Nombre del torneo"),
			Registro.capturarString("Region"),
			Registro.capturarEntero("Numero de equipos participantes"),
			Registro.capturarEntero("Partidos jugados"),
			Registro.capturarEntero("Partidos pendientes"));
	        System.out.println("Torneo\n");
	        System.out.println("Nombre del torneo: " + t.getNombre());
	        System.out.println("Region: " + t.getRegion());
	        System.out.println("Numero de equipos participantes: " + t.getNEP());
	        System.out.println("Partidos jugados: " + t.getPJ());
	        System.out.println("Partidos pendientes: " + t.getPP());
	        
	        for(int i=0; i<t.getNEP(); i++){
	            System.out.println("Equipo: " + t.getE(i));
	            System.out.println("Division: " + t.getDiv(i));
	            System.out.println("Puntos anotados: " + t.getPE(i));
	            System.out.println("Cantidad de jugadores: " + t.getJR(i));
	            System.out.println("Jugadores:");

	            for(int j=0; j<t.getNEP(); j++){
	                System.out.println("Nombre: " + t.getnj(i, j));
	                System.out.println("Numero de uniforme: "+ t.getNU(i, j));
	            }
	            System.out.println("\n");
	        }
		
	}

}

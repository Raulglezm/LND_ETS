package es.iespuertodelacruz.rgm.crearpdf;

public class Estructura {

    int heightActual;

    public Estructura(int heightActual) {
        this.heightActual = heightActual;
    }

    public void avanzarEnHeight(int resta){

            heightActual -= 14 + resta;

    }

    public int getHeightActual() {
        return heightActual;
    }
    
}

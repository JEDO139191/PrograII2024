package gt.edu.miumg.tarea1;

public class Duende extends Personaje implements Villano {
    public Duende(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
    }

    @Override
    public void destruir() {
    }

    @Override
    void desplazarse() {
    }

    @Override
    void mostrarPoder() {
    }
}

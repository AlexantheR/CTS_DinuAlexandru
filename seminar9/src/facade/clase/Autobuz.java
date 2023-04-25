package facade.clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void deschideUsaFata() {
        System.out.println("Usa fata deschisa pentru autobuzul cu nr " + nrInmatriculare);
    }

    public void deschideUsaMijloc() {
        System.out.println("Usa mijloc deschisa pentru autobuzul cu nr " + nrInmatriculare);
    }

    public void deschideUsaSpate() {
        System.out.println("Usa spate deschisa pentru autobuzul cu nr " + nrInmatriculare);
    }

    public void ramaneLiberUsaFata() {
        System.out.println("Usa fata poate fi deschisa de calatori pentru autobuzul cu nr " + nrInmatriculare);
    }

    public void ramaneLiberUsaMijloc() {
        System.out.println("Usa mijloc poate fi deschisa de calatori pentru autobuzul cu nr " + nrInmatriculare);
    }

    public void ramaneLiberUsaSpate() {
        System.out.println("Usa spate poate fi deschisa de calatori pentru autobuzul cu nr " + nrInmatriculare);
    }
}

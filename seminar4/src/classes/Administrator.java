package classes;

public class Administrator {
    private String name;
    private int varsta;

    //eager initialization
    private static Administrator instanta = new Administrator("Marcel", 30);

    private Administrator(String name, int varsta) {
        this.name = name;
        this.varsta = varsta;
    }

    public static Administrator getInstance(){
        return instanta;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "name='" + name + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

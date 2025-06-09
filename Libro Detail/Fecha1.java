package my_project.detail;

public class Fecha1 {
    private int dia;
    private int mes;
    private int anio;

    // Constructor con tres enteros
    public Fecha1(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // Constructor con String y dos enteros
    public Fecha1(String nombreMes, int dia, int anio) {
        this.mes = convertirMes(nombreMes);
        this.dia = dia;
        this.anio = anio;
    }

    // Constructor con un String tipo "MM/DD/AAAA"
    public Fecha1(String fecha) {
        String[] partes = fecha.split("/");
        this.mes = Integer.parseInt(partes[0]);
        this.dia = Integer.parseInt(partes[1]);
        this.anio = Integer.parseInt(partes[2]);
    }

    private int convertirMes(String mesNombre) {
        String[] nombres = { "enero", "febrero", "marzo", "abril", "mayo", "junio",
                             "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(mesNombre)) {
                return i + 1;
            }
        }
        return 1; 
    }

    public void imprimirFormato1() {
        System.out.printf("%02d/%02d/%04d%n", mes, dia, anio);
    }

    public void imprimirFormato2() {
        String[] nombres = { "enero", "febrero", "marzo", "abril", "mayo", "junio",
                             "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };
        System.out.printf("%s %d, %d%n", nombres[mes - 1], dia, anio);
    }

    public void imprimirFormato3() {
        System.out.printf("%02d %04d%n", dia, anio);
    }
}


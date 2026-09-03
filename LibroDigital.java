public class LibroDigital {

    private String isbn;
    private String titulo;
    private double tamanioMB;
    private int descargasTotales;

    public LibroDigital(String isbn, String titulo, double tamanioMB, int descargasTotales) {

        if (tamanioMB < 0) {
            throw new IllegalArgumentException(
                    "El tamaño no puede ser negativo"
            );
        }

        if (descargasTotales < 0) {
            throw new IllegalArgumentException(
                    "Las descargas no pueden ser negativas"
            );
        }

        this.isbn = isbn;
        this.titulo = titulo;
        this.tamanioMB = tamanioMB;
        this.descargasTotales = descargasTotales;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    public void setTamanioMB(double tamanioMB) {
        if (tamanioMB < 0) {
            throw new IllegalArgumentException(
                    "El tamaño no puede ser negativo"
            );
        }

        this.tamanioMB = tamanioMB;
    }

    public int getDescargasTotales() {
        return descargasTotales;
    }

    public void setDescargasTotales(int descargasTotales) {
        if (descargasTotales < 0) {
            throw new IllegalArgumentException(
                    "Las descargas no pueden ser negativas"
            );
        }

        this.descargasTotales = descargasTotales;
    }

    public void registrarDescarga() {
        descargasTotales++;
    }

    public double calcularEspacioConsumido() {
        return tamanioMB * descargasTotales;
    }

    public void mostrarDatos() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Tamaño: " + tamanioMB + " MB");
        System.out.println("Descargas totales: " + descargasTotales);
        System.out.println(
                "Espacio consumido: " + calcularEspacioConsumido() + " MB"
        );
    }

    public static void main(String[] args) {

        LibroDigital libro = new LibroDigital(
                "978-950-123456-7",
                "El Principito",
                5.5,
                0
        );

        libro.registrarDescarga();
        libro.registrarDescarga();
        libro.registrarDescarga();
        libro.registrarDescarga();

        libro.mostrarDatos();
    }
}
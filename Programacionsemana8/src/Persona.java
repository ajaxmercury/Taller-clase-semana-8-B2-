import java.util.Date;

class Persona {

    private Date fechaNacimiento;

    public Persona( Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int[] calcularEdad() {
        Date hoy = new Date();
        long diferenciaTiempo = hoy.getTime() - this.fechaNacimiento.getTime();
        long segundos = diferenciaTiempo / 1000;
        int dias = (int) (segundos / (60 * 60 * 24));
        int años = dias / 365;
        dias %= 365;
        int meses = dias / 30;
        dias %= 30;
        int[] edad = {años, meses, dias};
        return edad;
    }

   
}

// Esta pensado para la parte de sign up y luego se conecta con los asientos del cine
public class compra1 {
    String firstName;
    String lastName;
    String correo;
    String contrasenia;


    // Constructor
    public void set(String firstName, String lastName, String correo, String contrasenia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.correo = correo;
        this.contrasenia = contrasenia;

    }

    public compra1(String f, String l, String cor, String con) {
        this.set(f,l,cor,con);


    }
}

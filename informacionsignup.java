package sample;

public class informacionsignup {
        String nombre;
        String apellido;
        String email;
        String contraseña;
        String confirmar;


              public informacion(String nombre, String apellido, String email,
                       String contraseña, String confirmar) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.contraseña = contraseña;
            this.confirmar = confirmar;
        }

        public String getEmail() {
            return email;
        }

        public String getApellido() {
            return apellido;
        }

        public String getName() {
            return nombre;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEmail(int email) {
            this.email = email;
        }

        public void setConfirmar(int confirmar) {
        this.confirmar= confirmar;
        }

    }
}


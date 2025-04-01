package PersoaDeportista;

public class Persoa {
    private String nome;
    private String direccion;
    private String dni;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }
    private char calcularLetra(String dni) {
        dni = dni.substring(0,dni.length()-1);
        char letra = 0;
        if (dni.length()==8) {
            try {
                char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
                letra =  letrasDNI[Integer.parseInt(dni) % 23];
            } catch (NumberFormatException e) {
                e.getMessage();
                System.out.println("Lo siento la conversion a numero no ha sido valida");
            }
        }
        else {
            throw new DNIinvalido("Los numeros del DNI no cumplen con el criterio de longitud");
        }
        return letra;
    }
    public void setDni(String dni) {
        dni = dni.toUpperCase();
        if (dni.length()==9 && dni.charAt(dni.length()-1)==calcularLetra(dni)) {
            this.dni = dni;
        }
        else {
            throw new DNIinvalido("El dni introducido no tiene la longitud adecuada o letra apropiada");
        }
    }
}

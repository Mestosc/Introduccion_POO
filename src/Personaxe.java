import java.util.Arrays;

public class Personaxe {
    private String nome;
    private int vida;
    private int forza;
    private int velocidade;
    private int experiencia;
    String[] equipamientos;

    public Personaxe(String nome, int velocidade, int experiencia, int forza, int vida, String[] equipamientos) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.experiencia = experiencia;
        setForza(forza);
        setVida(vida);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String[] getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(String[] equipamientos) {
        this.equipamientos = new String[5];
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida>=0 && vida<=5) this.vida = vida;
        else this.vida = 1;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        if (forza>=0 && forza<5) this.forza = forza;
        else this.forza = 1;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
	@Override
	public String toString() {
		return "Personaxe [nome=" + nome + ", vida=" + vida + ", forza=" + forza + ", velocidade=" + velocidade
				+ ", experiencia=" + experiencia + ", equipamientos=" + Arrays.toString(equipamientos) + "]";
	}
}

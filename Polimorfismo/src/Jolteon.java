public class Jolteon extends Eevee {

    public Jolteon (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
    }

@Override //serve para sobrepor os métodos que estavam presentes no Eevee

public String ataque() {
        return "Trovoada - Thunder-Shock";
    }
@Override
    public String defesa(){
        return "Carda - Wild Charge";
    }
@Override
    public String especial(){
        return "Raio - Thunder";
}

}
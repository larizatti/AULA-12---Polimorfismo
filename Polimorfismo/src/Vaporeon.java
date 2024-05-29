public class Vaporeon extends Eevee {

    public Vaporeon (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
    }

@Override //serve para sobrepor os métodos que estavam presentes no Eevee

public String ataque() {
        return "Water Attack";
    }
@Override
    public String defesa(){
        return "Water Defense";
    }
@Override
    public String especial(){
        return "Special Water";
}

}
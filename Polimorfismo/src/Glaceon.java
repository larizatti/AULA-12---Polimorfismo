public class Glaceon extends Eevee {

    public Glaceon (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
}
    

@Override //serve para sobrepor os métodos que estavam presentes no Eevee

public String ataque() {
        return "Ice Attack";
    }
@Override
    public String defesa(){
        return "Ice Defense";
    }
@Override
    public String especial(){
        return "Special Dark";
}

}
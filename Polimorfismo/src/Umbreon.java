public class Umbreon extends Eevee {

    public Umbreon (String nome, String tipo, double altura, int hP, double peso) {
        super (nome, tipo, altura, hP, peso);
    }
    
@Override //serve para sobrepor os métodos que estavam presentes no Eevee

public String ataque() {
        return "Dark Attack";
    }
@Override
    public String defesa(){
        return "Dark Defense";
    }
@Override
    public String especial(){
        return "Special Dark";
}

}
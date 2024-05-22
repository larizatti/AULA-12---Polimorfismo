public class Jolteon extends Eevee {

@Override //serve para sobrepor os métodos que estavam presentes no Eevee, essa é a vantagem

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
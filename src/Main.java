public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Automata automata = new Automata();
        String line = ui.read("Ingrese la linea");
        String LineFinal = line + "c";
        if(automata.verificar(LineFinal)){
            ui.print("Se cumple el patron necesario");
        }else{
            ui.print("No se cumple el patron necesario");
        }

    }
}
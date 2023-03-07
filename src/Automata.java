import java.util.Stack;

public class Automata {
    public boolean verificar(String line){

        Stack<Character> pila = new Stack<>();
        pila.push('$');
        char medidior = '0';
        for (int i = 0; i < line.length(); i++) {
            char caracter = line.charAt(i);
            switch (medidior) {
                case '0':
                    if (caracter == 'a') {
                        pila.push('a');
                    } else {
                        medidior = '1';
                    }
                    break;
                case '1':
                    if (caracter == 'b') {;
                        pila.pop();
                    } else if (caracter == 'c') {
                        medidior = '2';
                        pila.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }

        }
        try {
            return medidior == '2' && pila.peek() == '$';
        }catch (Exception e){
            return false;
        }
    }
}

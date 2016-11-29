
public class Teste {

	public static void main(String[] args) {
        String a = "Alura";
        
        System.out.println("Saída");
        for(int i = 0; i < a.length(); i++) {
        	System.out.println(a.charAt(i));
        }
        
        String b = "Socorram-me, subi no ônibus em Marrocos";
        
        System.out.println("Saída");
        
        String invertida = "";
        for(int i = b.length() - 1; i >= 0; i--) {
        	invertida += b.charAt(i);
        }
        System.out.println(invertida);
        
        
        String[] c = "Socorram-me, subi no ônibus em Marrocos".split(" ");
        
        System.out.println("Saída");
        
        
        for(int i = c.length - 1; i >= 0; i--) {
        	System.out.print(c[i] + " ");
        }
        
        StringBuilder d = new StringBuilder("Socorram-me, subi no ônibus em Marrocos");
        
        System.out.println("Saída");
        System.out.println(d.reverse());
        
        String valor = "762";
        
        for(int i = 0; i < valor.length(); i++) {
        	int resultado =  valor.charAt(i) - '0';
        	System.out.print(resultado);
        }
        System.out.println();
        char m = '3';
        int i = m - '0'; // i vale 3!
        System.out.print(i);
        
	
     }
	
}

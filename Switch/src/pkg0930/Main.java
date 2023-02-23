package pkg0930;

/**
 *
 * @author user3
 */
public class Main {
    public static void main(String[] args) {
        int randomhet = (int) (Math.random()* 7) +1;
        switch (randomhet) {
            case 1: System.out.println("Hétfő"); break;
            case 2: System.out.println("Kedd"); break;
            case 3: System.out.println("Szerda"); break;
            case 4: System.out.println("Csütörtök"); break;
            case 5: System.out.println("Péntek"); break;
            case 6: System.out.println("Szombat"); break;
            case 7: System.out.println("Vasárnap"); break;
            
            default: System.out.println("Nem meghatározható");
        }
    }
    
}


package latihanpercabangan;
public class VokalKonsonan {
    public static void main(String[] args) {
        String huruf = "A";
        switch (huruf) {
            case "A" :
            case "a" :
            case "I" :
            case "i" :
            case "U" :
            case "u" :
            case "E" :
            case "e" :
            case "O" :
            case "o" :
                System.out.println("Huruf Vokal");
                break;
            default:
                System.out.println("Huruf Konsonan");
                break;
        }
    }
    
}

package polymorphism;


public class tampilMinuman {
    public static void main(String[] args) {
        LycheeTea lt = new LycheeTea();
        lt.tampilJenis("tea");
        System.out.println("Harga: "+lt.jenisMinuman());
    }
}

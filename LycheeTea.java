package polymorphism;

public class LycheeTea extends minuman{
    
    @Override
    public void tampilJenis (String jenis){
        System.out.println("Jenis minuman: "+jenis);
    }
    @Override
    public int jenisMinuman(){
        return super.jenisMinuman();
    }
}

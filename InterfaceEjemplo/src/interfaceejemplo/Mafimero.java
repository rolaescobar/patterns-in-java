
package interfaceejemplo;


public class Mafimero implements Animal  {

    @Override
    public void nombreEspecie(String nombre) {
        
        System.out.println(nombre);
    }

    @Override
    public void continente() {
        System.out.println("ASIATICO");
    }

    @Override
    public void carateristica() {
        System.out.println("CAMINA");
    }

    
    
}

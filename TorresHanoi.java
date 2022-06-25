package estructurasdatos;

public class TorresHanoi {
    public void TorresHanoi(int discos, int torreA, int torreB, int torreC){
        if(discos == 1){
            //Caso base
            System.out.println("Mover Disco de Torre A a Torre C");
        }else{
            TorresHanoi(discos-1, torreA, torreB, torreC);
            System.out.println("Mover Disco");
        }
    }
}

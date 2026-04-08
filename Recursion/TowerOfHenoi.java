public class TowerOfHenoi {

    public static void towerOfhenoi(int n, String s, String h, String d){
        if(n == 1){
            
        }

        towerOfhenoi(n-1, s, d, h);
        System.out.println("Transfering disk " + n +"from"+ s +"to"+ d);
        towerOfhenoi(n, s, h, d);



    }
    public static void main(String[] args) {
        
    }
}

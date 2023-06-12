
package pooaula13;

public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom(){
        System.out.println("Au... Au... Au...");
    }
    public void reagir(String ans){
        if(ans.equals("Olá")|| ans.equals("a")){
            System.out.println("Abanar e latir");
        } else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hours, int min){
        if(hours<12){
            System.out.println("Abanar");
        } else{
            System.out.println("Ignorar");
        }
    }
    public void reagir(boolean owner){
        if(owner){
            System.out.println("Abanar");
        } else{
            System.out.println("Rosnar e latir");
        }
    } 
    public void reagir(int years, float weight){
        if(years<5){
            if(weight<10){
                System.out.println("Abanar");
            } else{
                System.out.println("Latir");
            }
        } else if (peso<10){
            System.out.println("Rosnar");
        } else{
            System.out.println("Ignorar");
        }
    }
}

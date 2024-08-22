
package parcial1g1;

public class App {

    public static void main(String[] args) {
    
        try {
        
        Scanner sc = new Scanner(System.in);

            int cantidadVehiculos = 0;
            int distanciaMetros = 0;
            float kmRecorrido = 0f;
            double consumoCombustible = 0;
            double consumoTotalGasolina = 0;

        System.out.println("Cuantos vehiculos partiparon:  ");
        cantidadVehiculos = sc.nextInt();
        sc.nextLine();

        if (cantidadVehiculos > 0) {
            
            for(int i = 0; i < cantidadVehiculos; i++) {

                System.out.println("ingrese la distancia recorrida por el vehiculo " + (i + 1) + " en metros ");
                distanciaMetros = sc.nextInt();
                sc.nextLine();
                
                kmRecorrido = (float)(distanciaMetros / 1000);
                consumoCombustible = calcularConsumoGasolina(kmRecorrido);

                System.out.println("El vehiculo " + (i + 1) + " recorrio " + kmRecorrido + " km | consumio " + consumoCombustible + " Litros de gasolina ");

                consumoTotalGasolina += consumoCombustible;
        
            }

        System.out.println("El consumo total de combustible de todos los vehículos es de " + consumoTotalGasolina + " litros.");

        }
        
        else {

            System.out.println("la cantidad de vehiculos debe ser mayor a 0");

        }
       
        } 
        
        catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }

        
    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){
       
        try {

        float consumoGasolina = 0f;

        if (kmRecorrido > 0) {
            
            consumoGasolina = ((kmRecorrido * 55) / 750);

        }
        else{

            System.out.println("no hay kilometraje");

        }
        
        return consumoGasolina;

       } catch (Exception e) {
        
        return -1;
       } 
    }
    //------------------------------------------------------------------
}

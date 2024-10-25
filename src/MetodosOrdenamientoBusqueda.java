import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    //GRUPO B:
    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] personas) {
        int tamanio = personas.length;
 
        for(int i = 1; i < tamanio; i++){
            Person personaAux = personas[i];
            int  j = i - 1;
            while(j >=0 && personas[j].getAge() > personaAux.getAge() ){
                personas[j+1] = personas[j]; 
                j--; 
            }
            personas[j+1] = personaAux;
        }
    }
    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        int inicio = 0;
        int menor = people.length - 1;
            //Izquierda
            while (inicio <= menor) {
                int mitad = inicio + (menor-inicio)/2;
                if(people[mitad].getAge() == age){
                    return mitad;
                }
                
                if(people[mitad].getAge() < age) {
                    inicio = mitad + 1;
                } else {
                    menor = mitad -1;
                }
            }
            return -1; 
    }
    //Selection sort by age
    public void sortByAgeSelection(Person[] personas){
        int n = personas.length;
        for(int i = 0; i < n; i ++){
            int indice = i;
            for(int j = i+1; j< n; j++){
                if(personas[j].getAge() < personas[indice].getAge()){
                    indice = j;       
                } 
            }
            Person temp = personas [indice];
            personas[indice] = personas[i];
            personas[i] = temp;
        } 
    }  

    //Insertion sort by height
    public void sortByHeightWithInsertion(Person[] personas) {
        int tamanio = personas.length;
 
        for(int i = 1; i < tamanio; i++){
            Person personaAux = personas[i];
            int  j = i - 1;
            while(j >=0 && personas[j].getHeight() > personaAux.getHeight() ){
                personas[j+1] = personas[j]; 
                j--; 
            }
            personas[j+1] = personaAux;
        }
    }

    //Selection sort by height
    public void sortByHeightSelection(Person[] personas){
        int n = personas.length;
        for(int i = 0; i < n; i ++){
            int indice = i;
            for(int j = i+1; j< n; j++){
                if(personas[j].getHeight() < personas[indice].getHeight()){
                    indice = j;       
                } 
            }
            Person temp = personas [indice];
            personas[indice] = personas[i];
            personas[i] = temp;
        }  
    }  
    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        int inicio = 0;
        int menor = people.length - 1;
            //Izquierda
            while (inicio <= menor) {
                int mitad = inicio + (menor-inicio)/2;
                if(people[mitad].getHeight() == height){
                    return mitad;
                }
                
                if(people[mitad].getHeight() < height) {
                    inicio = mitad + 1;
                } else {
                    menor = mitad -1;
                }
            }
            return -1; 
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] personas) {
        for(Person person : personas){
            System.out.println(person);
        }
    }
}
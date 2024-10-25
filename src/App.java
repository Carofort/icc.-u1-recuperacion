
import models.Person;
import models.PersonasGenerator;
import models.Carro;
import models.CarrosGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        PersonasGenerator personaGenerator = new PersonasGenerator();
        CarrosGenerator carroGenerator = new CarrosGenerator();

        // Lista de 50 personas
        Person[] personas = personaGenerator.generarPersonas();

        //Lista de 50  Carros
         Carro[] carros =  carroGenerator.generarCarros();

        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        System.out.println("Listado de carros generadas:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        MetodosOrdenamientoBusqueda metodos = new MetodosOrdenamientoBusqueda();
        metodos.sortByAgeSelection(personas);
        metodos.showPeople(personas);
        int result = metodos.searchBinaryByAge(personas, 49);
        if(result == -1){
            System.out.println("No encotró esa edad");

        }  else {
            System.out.println("Se encontró la edad en la posicion: " + result + "=" + personas);
        }    

        metodos.sortByHeightWithInsertion(personas);
        int resultado = metodos.searchBinaryByHeight(personas, 176);
        if(resultado == -1){
            System.out.println("No encotró esa altura");

        }  else {
            System.out.println("Se encontró la altura en la posicion: " + resultado + "=" + personas);
        }    

        
        System.out.println("**LISTADO DE CARROS**");
        MetodosOrdenamientoBusquedaCarros mobc = new MetodosOrdenamientoBusquedaCarros();
        mobc.sortBYearWithBubbleAvnAsendente(carros);
        mobc.showCars(carros);
        int resultadoc = mobc.searchBinaryByYear(carros, 2020);
        if(resultadoc == -1){
            System.out.println("No encotró ese año de carro");

        }  else {
            System.out.println("Se encontró el carro en la posicion: " + resultadoc + "=" + carros);
        }    

    }  
}


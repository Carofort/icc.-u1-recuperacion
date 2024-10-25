import models.Carro;

public class MetodosOrdenamientoBusquedaCarros {
    public void sortBYearWithBubbleAvnAsendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() > cars[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort by year Descendentemente

    public void sortBYearWithBubbleAvnDesendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() < cars[j + 1].getYear()) {
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] cars, int year) {
        int inicio = 0;
        int menor = cars.length - 1;
        while (inicio <= menor) {
            int mid = inicio + (menor - inicio) / 2;
            if (cars[mid].getYear() == year) {
                return mid;
            }
            if (cars[mid].getYear() < year) {
                inicio = mid + 1;
            } else {
                menor = mid - 1;
            }
        }
        return -1;
    }

    public void showCars(Carro[] cars) {
        for (Carro car : cars) {
            System.out.println(car);
        }
    }
}
   
}

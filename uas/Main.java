//Child class 

class Car extends transportasi {
    private String model;

    public Car(String name, int capacity, String model) {
        super(name, capacity);
        this.model = model; 
        /*menggunakan this karena pemanggilan model masih dalam 1 class yang sama */
    }

    public String getModel() {
        return model;
    }

    @Override
    /*menggantikan metode dari kelas induk (parent class) */
    public void travel() {
        System.out.println("Driving a " + getModel() + " car");
    }
}

// Child class 
class Plane extends transportasi {
    private String airline;

    public Plane(String name, int capacity, String airline) {
        super(name, capacity);
        this.airline = airline;
    }

    public String getAirline() {
        return airline; //mengembalikan nilai
    }

    @Override
    public void travel() {
        System.out.println("Flying with " + getAirline() + " airline");
    }
}

public class Main {
    public static void main(String[] args) {
        /*polumorphysm: penggunaan objek dengan tipe data parent class untuk 
        mengakses metod overrid pada child */
        transportasi transport1 = new Car("Car", 4, "Sedan");
        transportasi transport2 = new Plane("Plane", 150, "Airline A");

        /*exception handling digunakan untuk menangkap dan menampilkan pesan kesalahan 
        jika ada exception yang terjadi saat menjalankan metode travel()*/
        try {
            transport1.travel();
            transport2.travel();
        } catch (Exception e) {
            System.out.println("An error occurred during travel: " + e.getMessage());
        }

        //Getter untuk mengakses/mendapatkan nilai variabel private 
        System.out.println("Transport 1: " + transport1.getName() + ", Capacity: " + transport1.getCapacity());
        System.out.println("Transport 2: " + transport2.getName() + ", Capacity: " + transport2.getCapacity());
    }
} 

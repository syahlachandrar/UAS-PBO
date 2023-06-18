// Parent class 
class transportasi {
    private String name;
    private int capacity;

    public transportasi(String name, int capacity) {
        /*constructor yang menerima argumen name dan capacity untuk menginisialisasi nilai variabel. */
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { 
        //meetod untuk mengembalikan nilai name
        return name;
    }

    public int getCapacity() {
        //method untuk mengembalikan nilai capacity
        return capacity;
    }

    public void travel() {
        System.out.println("Travelling by " + name);
    }
}
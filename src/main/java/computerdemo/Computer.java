package computerdemo;

public class Computer {

    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    // Default constructor
    public Computer() {
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }
    // Constructor with parameters (excluding isNotebook and operationSystem)
    public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    // Constructor with all parameters
    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    // Method to change the operating system
    public void changeOperationSystem(String newOperationSystem) {
        this.operationSystem = newOperationSystem;
    }

    // Method to use memory
    public void useMemory(double memory) {
        if (memory < 0) {
            System.out.println("Memory to use cannot be negative!");
        } else if (memory > this.freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            this.freeMemory -= memory;
        }
    }



}

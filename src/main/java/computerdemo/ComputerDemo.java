package computerdemo;

public class ComputerDemo {
        public static void main(String[] args) {
            // Creating two Computer objects
            Computer computer1 = new Computer(2022, 1200.0, true, 1000.0, 80.0, "Windows 11");
            Computer computer2 = new Computer(2020, 800.0, false,500.0, 250, "iOS");

            // Using memory on computer1 (attempting to use more memory than available)
            computer2.useMemory(300.0);

            // Changing operating system on computer2
            computer1.changeOperationSystem("Ubuntu");

            // Displaying computer1 details
            System.out.println("Computer 1:");
            System.out.println("Year: " + computer1.year);
            System.out.println("Price: $" + computer1.price);
            System.out.println("Is Notebook: " + computer1.isNotebook);
            System.out.println("Hard Disk Memory: " + computer1.hardDiskMemory + " GB");
            System.out.println("Free Memory: " + computer1.freeMemory + " GB");
            System.out.println("Operating System: " + computer1.operationSystem);
            System.out.println();

            // Displaying computer2 details
            System.out.println("Computer 2:");
            System.out.println("Year: " + computer2.year);
            System.out.println("Price: $" + computer2.price);
            System.out.println("Is Notebook: " + computer2.isNotebook);
            System.out.println("Hard Disk Memory: " + computer2.hardDiskMemory + " GB");
            System.out.println("Free Memory: " + computer2.freeMemory + " GB");
            System.out.println("Operating System: " + computer2.operationSystem);
            System.out.println();
        }
    }



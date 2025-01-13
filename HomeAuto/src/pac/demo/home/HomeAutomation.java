package pac.demo.home;

import java.util.*;

public class HomeAutomation {
    private static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Home Automation Menu ---");
            System.out.println("1. Add Room");
            System.out.println("2. Add Device to Room");
            System.out.println("3. Display Devices in a Room");
            System.out.println("4. Control a Device");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addRoom(scanner);
                    break;
                case 2:
                    addDeviceToRoom(scanner);
                    break;
                case 3:
                    displayDevicesInRoom(scanner);
                    break;
                case 4:
                    controlDevice(scanner);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void addRoom(Scanner scanner) {
        System.out.print("Enter room name: ");
        String roomName = scanner.nextLine();
        rooms.add(new Room(roomName));
        System.out.println("Room added successfully.");
    }

    private static void addDeviceToRoom(Scanner scanner) {
        System.out.print("Enter room name: ");
        String roomName = scanner.nextLine();
        Room room = findRoom(roomName);

        if (room != null) {
            System.out.println("Select device type: \n1. Fan\n2. AC\n3. Light\n4. Shower");
            int deviceChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter device name: ");
            String deviceName = scanner.nextLine();

            switch (deviceChoice) {
                case 1:
                    room.addDevice(new Fan(deviceName));
                    break;
                case 2:
                    room.addDevice(new AC(deviceName));
                    break;
                case 3:
                    room.addDevice(new Light(deviceName));
                    break;
                case 4:
                    room.addDevice(new Shower(deviceName));
                    break;
                default:
                    System.out.println("Invalid device type.");
                    return;
            }

            System.out.println("Device added successfully.");
        } else {
            System.out.println("Room not found.");
        }
    }

    private static void displayDevicesInRoom(Scanner scanner) {
        System.out.print("Enter room name: ");
        String roomName = scanner.nextLine();
        Room room = findRoom(roomName);

        if (room != null) {
            System.out.println("Devices in " + roomName + ":");
            room.displayDevices();
        } else {
            System.out.println("Room not found.");
        }
    }

    private static void controlDevice(Scanner scanner) {
        System.out.print("Enter room name: ");
        String roomName = scanner.nextLine();
        Room room = findRoom(roomName);

        if (room != null) {
            System.out.print("Enter device name: ");
            String deviceName = scanner.nextLine();
            Device device = room.findDevice(deviceName);

            if (device != null) {
                device.control();
            } else {
                System.out.println("Device not found.");
            }
        } else {
            System.out.println("Room not found.");
        }
    }

    private static Room findRoom(String roomName) {
        for (Room room : rooms) {
            if (room.getName().equalsIgnoreCase(roomName)) {
                return room;
            }
        }
        return null;
    }
}
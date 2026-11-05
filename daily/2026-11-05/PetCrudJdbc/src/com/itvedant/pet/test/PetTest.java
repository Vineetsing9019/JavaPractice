// Learning CRUD with JDBC (test) - practice file from PetCrudJdbc, pushed 2026-11-05
package com.itvedant.pet.test;

import java.util.List;
import java.util.Scanner;

import com.itvedant.pet.models.Pet;
import com.itvedant.pet.repository.PetDao;
import com.itvedant.pet.repository.PetDaoImpl;

public class PetTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PetDao petDao = new PetDaoImpl();

        int choice;

        do {

            System.out.println("----- PET CRUD APPLICATION -----");
            System.out.println("1. Add Pet");
            System.out.println("2. View Pet");
            System.out.println("3. View All Pets");
            System.out.println("4. Update Pet");
            System.out.println("5. Delete Pet");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Pet ID: ");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter Pet Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Pet Type: ");
                String type = scanner.nextLine();

                System.out.print("Enter Pet Age: ");
                int age = scanner.nextInt();

                Pet pet = new Pet(id, name, type, age);

                int result = petDao.addPet(pet);

                if (result > 0) {
                    System.out.println("Pet added successfully");
                } else {
                    System.out.println("Pet not added");
                }

                break;

            case 2:

                System.out.print("Enter Pet ID: ");
                int searchId = scanner.nextInt();

                Pet searchPet = petDao.getPetById(searchId);

                if (searchPet != null) {
                    System.out.println(searchPet);
                } else {
                    System.out.println("Pet not found");
                }

                break;

            case 3:

                List<Pet> petList = petDao.getAllPets();

                for (Pet p : petList) {
                    System.out.println(p);
                }

                break;

            case 4:

                System.out.print("Enter Pet ID: ");
                int updateId = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter New Pet Name: ");
                String updateName = scanner.nextLine();

                System.out.print("Enter New Pet Type: ");
                String updateType = scanner.nextLine();

                System.out.print("Enter New Pet Age: ");
                int updateAge = scanner.nextInt();

                Pet updatePet = new Pet(updateId, updateName, updateType, updateAge);

                int updateResult = petDao.updatePet(updatePet);

                if (updateResult > 0) {
                    System.out.println("Pet updated successfully");
                } else {
                    System.out.println("Pet not updated");
                }

                break;

            case 5:

                System.out.print("Enter Pet ID: ");
                int deleteId = scanner.nextInt();

                int deleteResult = petDao.deletePet(deleteId);

                if (deleteResult > 0) {
                    System.out.println("Pet deleted successfully");
                } else {
                    System.out.println("Pet not deleted");
                }

                break;

            case 6:

                System.out.println("Thank you!");

                break;

            default:

                System.out.println("Invalid choice");

            }

        } while (choice != 6);

        scanner.close();
    }
}


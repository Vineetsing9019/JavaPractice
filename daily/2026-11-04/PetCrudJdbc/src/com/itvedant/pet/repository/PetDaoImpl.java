// Learning repositories in CRUD with JDBC - practice file from PetCrudJdbc, pushed 2026-11-04
package com.itvedant.pet.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itvedant.pet.models.Pet;

public class PetDaoImpl implements PetDao {

    Connection connection;
    PreparedStatement preparedStatement;
    int rowCount;

    String query;

    @Override
    public int addPet(Pet pet) {

        query = "insert into pet values (?, ?, ?, ?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/petdb",
                    "root",
                    "<password>");

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, pet.getId());
            preparedStatement.setString(2, pet.getName());
            preparedStatement.setString(3, pet.getType());
            preparedStatement.setInt(4, pet.getAge());

            rowCount = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return rowCount;
    }
    @Override
    public int updatePet(Pet pet) {

        query = "update pet set name=?, type=?, age=? where id=?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/petdb",
                    "root",
                    "<password>");

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, pet.getName());
            preparedStatement.setString(2, pet.getType());
            preparedStatement.setInt(3, pet.getAge());
            preparedStatement.setInt(4, pet.getId());

            rowCount = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return rowCount;
    }

    @Override
    public int deletePet(int id) {

        query = "delete from pet where id=?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/petdb",
                    "root",
                    "<password>");

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            rowCount = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return rowCount;
    }

    @Override
    public Pet getPetById(int id) {

        query = "select * from pet where id=?";

        Pet pet = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/petdb",
                    "root",
                    "<password>");

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                pet = new Pet();

                pet.setId(resultSet.getInt("id"));
                pet.setName(resultSet.getString("name"));
                pet.setType(resultSet.getString("type"));
                pet.setAge(resultSet.getInt("age"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return pet;
    }

    @Override
    public List<Pet> getAllPets() {

        query = "select * from pet";

        List<Pet> petList = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/petdb",
                    "root",
                    "<password>");

            preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Pet pet = new Pet();

                pet.setId(resultSet.getInt("id"));
                pet.setName(resultSet.getString("name"));
                pet.setType(resultSet.getString("type"));
                pet.setAge(resultSet.getInt("age"));

                petList.add(pet);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return petList;
    }
}

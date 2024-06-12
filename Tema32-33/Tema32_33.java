import java.util.ArrayList;
import java.util.List;

public class Tema32_33 {
    public static void main(String[] args) {
        /**-Given a list of Person objects with age and city attributes,
         *  filter out people younger than 18 or those who live in the city "Metropolis",
         *  then return a list of names of the remaining people, sorted in reverse order.*/
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 17, "Gotham"));
        people.add(new Person("Bob", 20, "Metropolis"));
        people.add(new Person("Charlie", 22, "Star City"));
        people.add(new Person("Dave", 25, "Gotham"));
        people.add(new Person("Eve", 19, "Metropolis"));
        people.add(new Person("Frank", 30, "Star City"));

        List<String> result = Main.filterAndSortPeople(people);
        System.out.println(result);  // Output: [Frank, Dave, Charlie]
    }
    /**-Using https://www.w3schools.com/sql/sql_insert.asp, write sql scripts to insert/select/update/delete
     *  elements from a table with name Product and fields: name, price, tva. (1 script for every command:
     *  insert/select/update/delete)*/

    /**1.insert a new product into the Product table*/

//    INSERT INTO Product (name, price, tva)
//    VALUES ('ExampleProduct', 100, 20);        /**Adds a new row with specified values into the Product table.*/

    /**2.select all products from the Product table*/

//    SELECT * FROM Product;                     /**Retrieves data from the Product table. The * symbol selects all columns,
//                                                    while specifying column names selects only those columns.*/

    /**2.1 select specific columns (e.g., name and price) from the Product table*/

//    SELECT name, price FROM Product;

    /**3.update the price and tva of a product with a specific name*/

//    UPDATE Product                             /**Modifies existing data in the Product table.
//    SET price = 120, tva = 25                   The WHERE clause ensures only the specified rows are updated.*/
//    WHERE name = 'ExampleProduct';

    /**4.delete a product with a specific name from the Product table*/
//    DELETE FROM Product
//    WHERE name = 'ExampleProduct';             /**Removes data from the Product table. The WHERE clause ensures only the specified rows are deleted.*/

}

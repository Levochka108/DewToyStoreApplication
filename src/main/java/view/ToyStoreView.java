/**
 * @author Dmitrii Klochkov
 * Date:02.07.2023
 * Time:21:12
 */
package view;

import model.Toy;

import java.util.List;

public class ToyStoreView {
    public void displayToys(List<Toy> toys){
        System.out.println("Toy Store Inventory: ");
        if(toys.isEmpty()){
            System.out.println("No toys available.");

        }else{
            for(Toy toy : toys){
                System.out.println(toy);
            }
        }
    }
    public void displayMessage(String message){
        System.out.println(message);
    }
}

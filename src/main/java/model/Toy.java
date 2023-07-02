/**
 * @author Dmitrii Klochkov
 * Date:02.07.2023
 * Time:20:33
 */
package model;

public class Toy {
    private final Integer id;
    private String nameToy;
    private Integer quantity;

    private final Integer toyDropRate;


    public Toy(Integer id, String nameToy, Integer quantity,Integer toyDropRate) {
        this.id = id;
        this.nameToy = nameToy;
        this.quantity = quantity;
        this.toyDropRate = toyDropRate;
    }

    public Integer getId() {
        return id;
    }

    public String getNameToy() {
        return nameToy;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getToyDropRate() {
        return toyDropRate;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", nameToy='" + nameToy + '\'' +
                ", quantity=" + quantity +
                ", Toy drop rate=" + toyDropRate+"%"+
                '}';
    }
}

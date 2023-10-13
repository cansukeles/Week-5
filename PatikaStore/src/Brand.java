import java.util.TreeSet;

public class Brand {
    private int id;
    private String name;

    Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static TreeSet<Brand> brands = new TreeSet<>(new OrderBrandName());

    static {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

    }

    //Check if brand name exist when adding a new product
    public static boolean containsBrand(String x) {

        for (Brand br : brands) {
            if (br.getName().equals(x)) {
                return true;
            }
        }
        return false;
    }


    public static void listBrands() {
        for (Brand br : brands) {
            System.out.println(br.getName());
        }
    }

    public String getName() {
        return name;
    }

}

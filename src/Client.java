import Vendors.DellManufacturer;
import Vendors.HPManufacturer;
import Vendors.Manufacturer;
import Vendors.models.ModelPavilionFactory;
import Vendors.models.ModelInspironFactory;

// Client code to test the implementation
public class Client {
    public static void main(String[] args) {
        Manufacturer hpManufacturer = new HPManufacturer();
        hpManufacturer.assemble(new ModelInspironFactory()); // Trying to build a Dell PC at HP

        Manufacturer dellManufacturer = new DellManufacturer();
        dellManufacturer.assemble(new ModelPavilionFactory());  // Trying to build a HP PC at Dell

        System.out.println("~~~ Clearly our verifications work as we got no output! ~~~");
        System.out.println("Now the proper way around!");

        hpManufacturer.assemble(new ModelPavilionFactory()); // Trying to build a Dell PC at HP
        dellManufacturer.assemble(new ModelInspironFactory());  // Trying to build a HP PC at Dell
    }
}

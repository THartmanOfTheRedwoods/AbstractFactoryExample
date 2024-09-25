package Vendors;

import Platforms.Computer;
import Platforms.PC;
import Platforms.PlatformTypes;
import Platforms.Server;
import Vendors.models.ComputerModelAbstractFactory;
import Vendors.models.Model;

// Concrete Vendor.Manufacturer implementations
public class HPManufacturer extends Manufacturer {
    @Override
    protected Computer createModel(ComputerModelAbstractFactory factory) {
        // This is a factory method for creating Platform.Computer types
        Model model = factory.getModel();
        return switch (model.getType()) {
            case PlatformTypes.PC -> new PC(factory);
            case PlatformTypes.Server -> new Server(factory);
            default -> null;
        };
    }

    @Override
    protected Vendor getVendor() {
        return Vendor.HP;
    }
}


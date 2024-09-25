package Vendors;

import Platforms.Computer;
import Platforms.Server;
import Vendors.models.ComputerModelAbstractFactory;

public class DellManufacturer extends Manufacturer {
    @Override
    protected Computer createModel(ComputerModelAbstractFactory factory) {
        return new Server(factory);
    }

    @Override
    protected Vendor getVendor() {
        return Vendor.Dell;
    }
}

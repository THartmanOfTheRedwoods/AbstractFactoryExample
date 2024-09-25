package Vendors;

import Platforms.Computer;
import Vendors.models.ComputerModelAbstractFactory;

// Vendor.Manufacturer abstract class
public abstract class Manufacturer {
    public final void assemble(ComputerModelAbstractFactory factory) {
        // Let's make sure this concrete manufacturer object is not making a competitor model
        if(checkVendorModel(factory)) {
            Computer computer = createModel(factory);
            computer.assembleComputer();
        }
    }

    public final boolean checkVendorModel(ComputerModelAbstractFactory factory) {
        // System.out.printf("Model Vendor: %s, Manufacturer Vendor: %s\n", factory.getModel().getVendor(), this.getVendor());
        return factory.getModel().getVendor() == this.getVendor();
    }

    protected abstract Computer createModel(ComputerModelAbstractFactory factory);
    protected abstract Vendor getVendor();
}

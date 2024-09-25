package Vendors.models;

import Platforms.PlatformTypes;
import Vendors.Vendor;

public enum HPModels implements Model {
    PAVILION(PlatformTypes.PC),
    ENVY(PlatformTypes.PC),
    SPECTRE(PlatformTypes.PC),
    ELITEBOOK(PlatformTypes.PC),
    PRODESK(PlatformTypes.PC),
    ZBOOK(PlatformTypes.PC),
    PROLIANT(PlatformTypes.Server),
    SYNERGY(PlatformTypes.Server),
    APOLLO(PlatformTypes.Server);

    private final PlatformTypes type;

    HPModels(PlatformTypes type) {
        this.type = type;
    }

    public PlatformTypes getType() {
        return type;
    }

    @Override
    public Vendor getVendor() {
        return Vendor.HP;
    }
}

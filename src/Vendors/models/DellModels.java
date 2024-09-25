package Vendors.models;

import Platforms.PlatformTypes;
import Vendors.Vendor;

public enum DellModels implements Model {
    INSPIRON(PlatformTypes.PC),
    XPS(PlatformTypes.PC),
    LATITUDE(PlatformTypes.PC),
    OPTIPLEX(PlatformTypes.PC),
    PRECISION(PlatformTypes.PC),
    POWEREDGE(PlatformTypes.Server),
    POWERMAX(PlatformTypes.Server),
    EMC_VMAX(PlatformTypes.Server),
    EMC_VPLEX(PlatformTypes.Server);

    private final PlatformTypes type;

    DellModels(PlatformTypes type) {
        this.type = type;
    }

    public PlatformTypes getType() {
        return type;
    }

    @Override
    public Vendor getVendor() {
        return Vendor.Dell;
    }
}
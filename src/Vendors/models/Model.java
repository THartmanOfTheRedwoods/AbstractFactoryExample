package Vendors.models;

import Platforms.PlatformTypes;
import Vendors.Vendor;

public interface Model {
    PlatformTypes getType();
    Vendor getVendor();
}

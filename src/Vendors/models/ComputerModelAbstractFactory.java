package Vendors.models;

import Parts.HardDrive.HardDrive;
import Parts.Memory.Memory;
import Parts.Processor.Processor;

// Abstract factory for computer models
public abstract class ComputerModelAbstractFactory {
    public abstract HardDrive getHardDrive();
    public abstract Memory getMemory();
    public abstract Processor getProcessor();
    public abstract Model getModel();
}

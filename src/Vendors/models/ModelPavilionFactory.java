package Vendors.models;

import Parts.HardDrive.HardDrive;
import Parts.HardDrive.SATAHardDrive;
import Parts.Memory.DDR3Memory;
import Parts.Memory.Memory;
import Parts.Processor.AMDProcessor;
import Parts.Processor.Processor;

public class ModelPavilionFactory extends ComputerModelAbstractFactory {
    @Override
    public HardDrive getHardDrive() {
        return new SATAHardDrive();
    }

    @Override
    public Memory getMemory() {
        return new DDR3Memory();
    }

    @Override
    public Processor getProcessor() {
        return new AMDProcessor();
    }

    @Override
    public Model getModel() {
        return HPModels.PAVILION;
    }
}

package Vendors.models;

import Parts.HardDrive.HardDrive;
import Parts.HardDrive.SSDHardDrive;
import Parts.Memory.DDR4Memory;
import Parts.Memory.Memory;
import Parts.Processor.IntelProcessor;
import Parts.Processor.Processor;

// Concrete Model Factories
public class ModelInspironFactory extends ComputerModelAbstractFactory {
    @Override
    public HardDrive getHardDrive() {
        return new SSDHardDrive();
    }

    @Override
    public Memory getMemory() {
        return new DDR4Memory();
    }

    @Override
    public Processor getProcessor() {
        return new IntelProcessor();
    }

    @Override
    public Model getModel() {
        return DellModels.INSPIRON;
    }
}

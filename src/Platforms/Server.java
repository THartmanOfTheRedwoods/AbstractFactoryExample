package Platforms;

import Parts.HardDrive.HardDrive;
import Parts.Memory.Memory;
import Parts.Processor.Processor;
import Vendors.models.ComputerModelAbstractFactory;

// Concrete Platforms.Server implementation
public class Server implements Computer {
    private HardDrive hardDrive;
    private Memory memory;
    private Processor processor;

    public Server(ComputerModelAbstractFactory factory) {
        this.hardDrive = factory.getHardDrive();
        this.memory = factory.getMemory();
        this.processor = factory.getProcessor();
    }

    @Override
    public void assembleComputer() {
        System.out.println("Assembling " + this.getPlatformType() + " with: " +
                hardDrive.getHardDriveDetails() + ", " +
                memory.getMemoryDetails() + ", " +
                processor.getProcessorDetails());
    }

    @Override
    public PlatformTypes getPlatformType() {
        return PlatformTypes.Server;
    }
}

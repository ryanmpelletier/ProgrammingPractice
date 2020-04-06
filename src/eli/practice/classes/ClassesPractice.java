package eli.practice.classes;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import eli.practice.classes.model.*;

public class ClassesPractice {

    public static void main(String[] args){

        CPU ryansCPU = new CPU();
        ryansCPU.setBrand("AMD");
        ryansCPU.setClockSpeed(3.4);
        ryansCPU.setNumberOfCores(8);

        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setModel("GTX 1080");
        graphicsCard.setMemory(8);

        Ram ramStick1 = new Ram();
        ramStick1.setBrand("GSkill");
        ramStick1.setSize(16);
        ramStick1.setSpeed(3200);

        Ram ramStick2 = new Ram();
        ramStick2.setBrand("GSkill");
        ramStick2.setSize(16);
        ramStick2.setSpeed(3200);

        Ram ramStick3 = new Ram();
        ramStick3.setBrand("GSkill");
        ramStick3.setSize(16);
        ramStick3.setSpeed(3200);

        Ram[] ramSticks = new Ram[3];
        ramSticks[0] = ramStick1;
        ramSticks[1] = ramStick2;
        ramSticks[2] = ramStick3;

        Motherboard ryansMotherboard = new Motherboard();
        ryansMotherboard.setBrand("ASRock");
        ryansMotherboard.setChipset("x370");

        ryansMotherboard.setProcessor(ryansCPU);
        ryansMotherboard.setGraphicsCard(graphicsCard);
        ryansMotherboard.setRamSticks(ramSticks);

        PC ryansComputer = new PC();
        ryansComputer.setName("Ryan's Computer");
        ryansComputer.setMotherboard(ryansMotherboard);

        printEverythingAboutAPCObject(ryansComputer);
    }



    //print out everything about the computer
    public static void printEverythingAboutAPCObject(PC computer){
        System.out.println(computer.getName());
        Motherboard computerMotherboard = computer.getMotherboard();
        System.out.println("MOTHERBOARD: ");
        System.out.print("       Name: ");
        System.out.println(computerMotherboard.getBrand());
        System.out.print("    Chipset: ");
        System.out.println(computerMotherboard.getChipset());

        Ram[] motherboardRam = computerMotherboard.getRamSticks();
        System.out.println("RAM: ");
        for(int i = 0; i < motherboardRam.length; i++) {
            System.out.println("  Stick " + (i+1) + ":");
            System.out.print("          Brand: ");
            System.out.println(motherboardRam[i].getBrand());
            System.out.print("          Size: ");
            System.out.println(motherboardRam[i].getSize());
            System.out.print("          Speed: ");
            System.out.println(motherboardRam[i].getSpeed());
        }
        System.out.print("The total memory of ram is: ");
        System.out.println(computerMotherboard.getTotalRamMemory());
        CPU motherboardCPU = computerMotherboard.getProcessor();
        System.out.println("PROCESSOR: ");
        System.out.print("    Brand: ");
        System.out.println(motherboardCPU.getBrand());
        System.out.print("Number Of Cores: ");
        System.out.println(motherboardCPU.getNumberOfCores());
        System.out.print("  Clockspeed: ");
        System.out.println(motherboardCPU.getClockSpeed());

        GraphicsCard motherboardGraphicsCard = computerMotherboard.getGraphicsCard();
        System.out.println("GRAPHICS CARD:");
        System.out.print("       Memory: ");
        System.out.println(motherboardGraphicsCard.getMemory());
        System.out.print("        Model: ");
        System.out.println(motherboardGraphicsCard.getModel());
    }
}

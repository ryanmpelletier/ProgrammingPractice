package eli.practice.classes;

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

        Ram[] ramSticks = new Ram[2];
        ramSticks[0] = ramStick1;
        ramSticks[1] = ramStick2;

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

    }
}

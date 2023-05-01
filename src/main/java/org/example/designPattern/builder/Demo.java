package org.example.designPattern.builder;

public class Demo {
    public static void main(String[] args) {
        Computer computer =  new Computer.ComputerBuilder(256,1).setIsBluetoothAvailable(true)
                .setIsVgaAvailable(true).build();

        System.out.println(computer);
    }
}

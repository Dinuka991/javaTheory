package org.example.designPattern.builder;

public class Computer {
    private final Integer ram;
    private final Integer hdd;
    private final boolean isVgaAvailable;
    private final boolean isBluetoothAvailable;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hdd = computerBuilder.hdd;
        this.isVgaAvailable = computerBuilder.isVgaAvailable;
        this.isBluetoothAvailable = computerBuilder.isBluetoothAvailable;
    }

    public Integer getRam() {
        return this.ram;
    }

    public Integer getHdd() {
        return this.hdd;
    }

    public boolean isVgaAvailable() {
        return isVgaAvailable;
    }

    public boolean isBluetoothAvailable() {
        return isBluetoothAvailable;
    }

    public String toString() {//overriding the toString() method
        return "ram" + this.getRam() + "\n" + "hdd" + this.getHdd() + "\n"
                + "vga" + this.isVgaAvailable() + "\n"
                + "bluetooth" + this.isBluetoothAvailable();
    }

    public static class ComputerBuilder {

        private final Integer ram;
        private final Integer hdd;
        private boolean isVgaAvailable;
        private boolean isBluetoothAvailable;

        public ComputerBuilder(Integer ram, Integer hdd) {
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setIsVgaAvailable(boolean isVgaAvailable) {
            this.isVgaAvailable = isVgaAvailable;
            return this;
        }

        public ComputerBuilder setIsBluetoothAvailable(boolean isBluetoothAvailable) {
            this.isBluetoothAvailable = isBluetoothAvailable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}

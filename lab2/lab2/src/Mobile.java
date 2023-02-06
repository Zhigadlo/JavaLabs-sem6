public class Mobile {

    private int serialNumber;
    private String name;
    public class Model{
        private int ram;
        private int memoryGb;
        private int batteryVolume;
        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getMemoryGb() {
            return memoryGb;
        }

        public void setMemoryGb(int memoryGb) {
            this.memoryGb = memoryGb;
        }

        public int getBatteryVolume() {
            return batteryVolume;
        }

        public void setBatteryVolume(int batteryVolume) {
            this.batteryVolume = batteryVolume;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

}

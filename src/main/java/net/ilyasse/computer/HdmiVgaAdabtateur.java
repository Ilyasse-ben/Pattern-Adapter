package net.ilyasse.computer;

public class HdmiVgaAdabtateur implements Vga{
    private Hdmi hdmi;
    @Override
    public void print(String message) {

        byte [] data=message.getBytes();
        System.out.println(";;;;;;;;;;;;;;;; Adabtateur ;;;;;;;;;;;;;;;;;;;;;");
        hdmi.view(data);
        System.out.println(";;;;;;;;;;;;;;;; Adabtateur ;;;;;;;;;;;;;;;;;;;;;");
    }
    public void setHdmi(Hdmi hdmi){
        this.hdmi=hdmi;
    }
}

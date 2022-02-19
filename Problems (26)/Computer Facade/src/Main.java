class ComputerFacadeTestDrive {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();

        ComputerFacade computerFacade = new ComputerFacade(processor, monitor, keyboard);

        computerFacade.turnOnComputer();
        computerFacade.turnOffComputer();
    }
}

class ComputerFacade {
    private final Processor processor;
    private final Monitor monitor;
    private final Keyboard keyboard;

    ComputerFacade(Processor processor, Monitor monitor, Keyboard keyboard) {
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public void turnOnComputer() {
        processor.on();
        monitor.on();
        keyboard.on();
    }

    public void turnOffComputer() {
        keyboard.off();
        monitor.off();
        processor.off();
    }
}

class Processor {
    public void on() {
        System.out.println("Processor on");
    }

    public void off() {
        System.out.println("Processor off");
    }
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
        this.processor = proc
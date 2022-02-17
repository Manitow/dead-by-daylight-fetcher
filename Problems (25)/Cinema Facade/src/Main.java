class CinemaFacadeTestDrive {
    public static void main(String[] args) throws InterruptedException {
        PopcornPopper popcorn = new PopcornPopper();
        Lights lights = new Lights();
        Projector projector = new Projector();

        CinemaFacade cinemaFacade = new CinemaFacade(popcorn, lights, projector);
        System.out.println("Get ready to watch a movie...");
        cinemaFacade.watchMovie();
        System.out.println("We are watching a movie");
        Thread.sleep(5000);
        System.out.println("The End");
        cinemaFacade.endMovie();
    }
}

class CinemaFacade {
    private PopcornPopper popcorn;
    private Lights lights;
    private Projector projector;

    public CinemaFacade(PopcornPopper popcorn, Lights lights, Projector projector) {
        this.popcorn = popcorn;
      
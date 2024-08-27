public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv ligada ? " + smartTv.ligada);
        System.out.println("Qual o canal : " + smartTv.canal);
        System.out.println("Qual o Volume : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Qual o canal : " + smartTv.canal);

        smartTv.ligada();
        System.out.println("Novo status -> A Tv ligada ? " + smartTv.ligada);
        smartTv.desligada();
        System.out.println("Novo status -> A Tv ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status -> Qual o Volume : " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo status -> Qual o Volume : " + smartTv.volume);
    }
}

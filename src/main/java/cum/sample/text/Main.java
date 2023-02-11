package cum.sample.text;

public class Main {
    public static void main(String[] args) {
        System.out.println("HARO DZA WARUDO!");

        int a = 10;
        int b = 13;

        MadMaxService zereCanBOnly1 = new MadMaxService();

        int dzaMakkushi = zereCanBOnly1.max(a, b);
        System.out.println("У кого пипирка " + dzaMakkushi + " см, тот и прав (фаф)!");
    }
}
public class Main {
    public static void main(String[] args) {
      BonusMilesService servise = new BonusMilesService();
      int result = servise.calculate(10000);

        System.out.println("Мили с покупки: " + result);

    }
}

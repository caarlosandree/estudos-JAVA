public class ex001 {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = Double.parseDouble(System.console().readLine());
        double fahrenheit = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura em Fahrenheit é: %.2f", fahrenheit);
        System.out.println(mensagem);
        int temperaturaFarenheitInt = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFarenheitInt);
    }
}
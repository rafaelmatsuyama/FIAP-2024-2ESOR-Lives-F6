import java.time.LocalDate;


public class TesteVerificacaoData {

	public static void main(String[] args) {
		
		ContaPoupanca conta1 = new ContaPoupanca("Jos� da Silva", "Rua A, 123", "1234567",
				LocalDate.of(1981,4,25),LocalDate.of(2021,9,6));
		conta1.deposita(100);
		
		try {
			conta1.saque(30);
			System.out.println(conta1.getSaldo());
		} catch (SaldoInsuficiente e) {
			System.out.println(e.getMessage());
		}

	}

}

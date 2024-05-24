package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Veículo;

public class TesteSistema {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Veículo veiculo = new Veículo();

        cliente.setNome("Lucas");
        cliente.setSobrenome("Silva");
        cliente.setIdade(25);

        // Corrigindo o formato do endereço de email
        String email = "lucas.Silva@example.com";
        if (isValidEmail(email)) {
            cliente.setEmail(email);
        } else {
            System.out.println("Email inválido");
            return;
        }

        veiculo.setMarca("Toyota Corolla");
        veiculo.setAno(2022);
        veiculo.setCor("Prata");

        // Exibindo informações
        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + cliente.getNome() + " " + cliente.getSobrenome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Email: " + cliente.getEmail());

        System.out.println("\nInformações do Veículo:");
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Cor: " + veiculo.getCor());
    }

    // Método para validar o formato do email
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}

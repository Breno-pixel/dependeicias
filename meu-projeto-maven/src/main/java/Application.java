import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(ProdutoRepository repository) {
        return args -> {
            Produto produto = new Produto();
            produto.setNome("Notebook");
            produto.setPreco(2500.00);
            produto.setDescricao("Um notebook de alta performance");

            repository.save(produto);

            System.out.println("Produto salvo com sucesso!");
        };
    }
}

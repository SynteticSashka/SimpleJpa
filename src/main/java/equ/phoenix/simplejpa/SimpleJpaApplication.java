package equ.phoenix.simplejpa;

import equ.phoenix.simplejpa.model.Client;
import equ.phoenix.simplejpa.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleJpaApplication {
  public static void main(String[] args) {
    SpringApplication.run(SimpleJpaApplication.class, args);

  }
}

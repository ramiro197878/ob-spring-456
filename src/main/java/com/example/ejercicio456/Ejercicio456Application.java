package com.example.ejercicio456;

import com.example.ejercicio456.entities.Laptop;
import com.example.ejercicio456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);


		Laptop laptop1 = new Laptop(null, "HP", "intel core i5", "8GB RAM",
				"256GB SSD", "15.6 Inch Full HD Screen", "Windows");

		Laptop laptop2 = new Laptop(null, "ASUS", "Intel Celeron N3350", "4GB RAM",
				"32GB SSD", "11.6 Inch 1366 x 768 Screen", "Windows");

		Laptop laptop3 = new Laptop(null, "Lenovo", "intel Core i5 10210U ", "8GB RAM",
				"2GB SSD", "15.6 Inch Full HD Screen", "Linux");


		Laptop laptop4 = new Laptop(null, "Sanmsung", "Intel Core i5 1135G7", "8GB RAM",
				"256GB SSD", "15.6 Inch Full HD Screen", "Windows");

		Laptop laptop5 = new Laptop(null, "Apple", "M1 Processor", "8GB RAM",
				"256GB SSD", "13.3 Inch 2560 x 1600 Screen", "MacOS");


		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
		repository.save(laptop4);
		repository.save(laptop5);
	}

}

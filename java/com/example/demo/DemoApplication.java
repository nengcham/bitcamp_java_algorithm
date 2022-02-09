package com.example.demo;

import com.example.demo.algorithm.controller.AlgorithmController;
import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.auth.controller.AuthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		AlgorithmController algoController = new AlgorithmController();
		OopController phoneController = new OopController();
		QuizController quizController = new QuizController();
		AuthController studentController = new AuthController();

		while (true){
			System.out.println("[메인 메뉴]\n0.종료 1.Algorithm 2.OOP 3.Quiz 4.Auth");
			switch (scanner.next()){
				case "0":
					System.out.println("EXIT"); return;
				case "1":
					System.out.println("Algorithm");
					algoController.excute(scanner);break;
				case "2":
					System.out.println("OOP");
					phoneController.excute(scanner);break;
				case "3":
					System.out.println("Quiz");
					quizController.excute(scanner);break;
				case "4":
					System.out.println("Auth");
					studentController.excute(scanner);break;
				default:
					System.out.println("WRONG"); break;

			}
		}


	}

}

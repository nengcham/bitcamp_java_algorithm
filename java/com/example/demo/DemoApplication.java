package com.example.demo;

import com.example.demo.algorithm.controller.AlgoController;
import com.example.demo.phone.controller.PhoneController;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.student.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		AlgoController algoController = new AlgoController();
		PhoneController phoneController = new PhoneController();
		QuizController quizController = new QuizController();
		StudentController studentController = new StudentController();

		while (true){
			System.out.println("[MENU]\n0.종료 1.알고리즘 2.폰 3.퀴즈 4.회원");
			switch (scanner.next()){
				case "0":
					System.out.println("EXIT"); return;
				case "1":
					System.out.println("알고리즘");
					algoController.excute(scanner);break;
				case "2":
					System.out.println("폰");
					phoneController.excute(scanner);break;
				case "3":
					System.out.println("퀴즈");
					quizController.excute(scanner);break;
				case "4":
					System.out.println("회원");
					studentController.excute(scanner);break;
				default:
					System.out.println("WRONG"); break;

			}
		}


	}

}

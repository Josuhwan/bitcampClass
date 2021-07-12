package day0705;
//숙제1. 5명의 키와 몸무게를 토대로 해서 bmi결과를 입력한 사람까지만 출력하는 프로그램

import java.util.Scanner;
public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 상수
        // 입력가능한 인원수
        final int SIZE = 5;
        // 키 최대값
        final double H_MAX = 2.72;
        // 몸무게 최대값
        final double W_MAX = 635;
        // 저체중 <->정상체중 BMI값
        final double BMI_STANDARD_I = 18.5;
        // 정상체중<->과체중 BMI값
        final double BMI_STANDARD_II = 23;
        // 과체중<->비만 BMI값
        final double BMI_STANDARD_III = 25;

        // 배열
        int[] idArray = new int[SIZE];
        String[] nameArray = new String[SIZE];
        // 키를 저장할 배열
        double[] hArray = new double[SIZE];
        // 몸무게를 저장할 배열
        double[] wArray = new double[SIZE];
        // 다음 입력할 인덱스(위치번호)를 저장할 int 변수
        int index = 0;

        while (true) {

            System.out.println("1.입력 2.출력 3.종료");
            int userChoice = scanner.nextInt();
            while (!(userChoice >= 1 && userChoice <= 2)) {
                System.out.println("잘못입력하셨습니다.");
                System.out.println("1.입력 2.출력");
                userChoice = scanner.nextInt();
            }

            if (userChoice == 1) {
                // 입력
                if (index < SIZE) {
                    // 배열에 여유공간이 있어서 입력가능
                    // 번호입력
                    for (int i = 0; i < SIZE; i++) {
                        System.out.printf("%d번 학생의 정보를 입력하세요\n", i + 1);
                        System.out.println("번호를 입력하세요");
                        System.out.print(">");
                        idArray[i] = scanner.nextInt();
                        // 이름입력
                        System.out.println("이름을 입력하세요");
                        System.out.print(">");
                        scanner.nextLine();//버퍼메모리 삭제 
                        nameArray[i] = scanner.nextLine();
                        // 사용자가 입력한 실수 값을 임시 보관할 double변수
                        double temp;
                        // 키를 입력받아서 키 배열의 index칸에 저장
                        System.out.println("키를 입력해 주세요");
                        System.out.print(">");
                        temp = scanner.nextDouble();

                        while (!(temp > 0 && temp <= H_MAX)) {
                            System.out.println("잘못 입력하셨습니다.");
                            System.out.println("키를 입력해주세요");
                            System.out.println(">");
                            temp = scanner.nextDouble();
                        }
                        hArray[index] = temp;

                        // 몸무게를 입력받아서 몸부게 배열의 index칸에 저장
                        System.out.println("몸무게를 입력해주세요.");
                        System.out.print(">");
                        temp = scanner.nextDouble();

                        while (!(temp > 0 && temp <= W_MAX)) {
                            System.out.println("잘못 입력하셨습니다.");
                            System.out.println("몸무게를 입력해주세요");
                            System.out.println(">");
                            temp = scanner.nextDouble();
                        }
                        wArray[index] = temp;
                        // index의 값을 1증가
                        index++;
                    }

                } else {
                    // 이미 5명을 다 입력해서 더이상 입력 불가
                    System.out.println("더이상 입력하실 수 없습니다.");
                }

            } else if (userChoice == 2) {
                // 출력
                if (index > 0) {
                    // 1명이상이 입력되었으므로
                    // 배열 전체를 출력한다.
                    for (int i = 0; i < index; i++) {
                        System.out.println("===================");
                        System.out.printf("\t%번째 정보\n", i + 1);
                        System.out.println("===================");
                        System.out.printf("키: [%.2]m 몸무게: [%.2f]kg\n", hArray[i], wArray[i]);
                        double bmi = wArray[i] / hArray[i] / hArray[i];

                        String result;
                        if (bmi < BMI_STANDARD_I) {
                            result = "저체중";
                        } else if (bmi < BMI_STANDARD_II) {
                            result = "정상체중";
                        } else if (bmi < BMI_STANDARD_III) {
                            result = "과체중";
                        } else {
                            result = "비만";
                        }
                        System.out.printf("BMI: [%d.3f] 비만도:", bmi, result);
                    }

                } else {
                    // 아직 1명도 입력이 안되어있으므로
                    // 경고메세지만 출력
                    System.out.println("===================");
                    System.out.println("아직 입력된 정보가 없습니다.");
                    System.out.println("===================");
                }
            } else if (userChoice == 3) {
                // 종료코드구현
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
        scanner.close();

    }
}

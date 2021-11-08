import java.util.Random;

public class Array02 {
    public static void main(String[] args) {

        // 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
        // 예   1) 87, 11, 92, 14, 47

        Random rand = new Random();
        int[] arr = new int[5];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 문제2) 전교생의 총점과 평균 출력
        // 예   2) 총점(251) 평균(50.2)

        int total = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        avg = total / arr.length;
        System.out.printf("총점: %d, 평균: %d\n", total, avg);

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

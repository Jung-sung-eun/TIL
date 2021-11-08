import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        // 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
        // 정답1) 10 20 30 40 50

        // 배열의 크기는 배열 내의 원소의 개수이다
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            // System.out.printf("%d", i);
            // arr[0] = 10;
            // arr[1] = 20;
            // arr[2] = 30;
            // arr[3] = 40;
            // arr[4] = 50;
            arr[i] = 10 * (i+1);
        }
        // 배열을 다시 처음부터 마지막 원소까지 순회하면서 출력
        for (int i = 0; i< arr.length; i++) {
            System.out.printf("%d", arr[i]);
        }
        System.out.println();
        // 배열을 문자열로 만들어서 출력
        System.out.println(Arrays.toString(arr));

        // 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
        // 정답2) 20 40

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0) {
                System.out.println(arr[i]);
            }
        }

        // 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
        // 정답3) 60

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);

        // 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
        // 정답4) 2

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4== 0) {
                cnt++;
            }
        }
        System.out.println(cnt);

        // 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
        // 정답5) 5

        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

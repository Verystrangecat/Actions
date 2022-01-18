import java.util.Scanner;

public class Q1_1_1 {
    public static void main(String[] args) {
        int answer = 0;
        int answ = solution(answer);
        System.out.println(answ);
    }
    public static int solution(int answer) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = input.nextInt();
        int nl = 0, ch = 1;
            while (n > 0) {
                nl = n % 10;
                if (nl == 9)
                    nl = 0;
                else nl = nl + 1;
                n = n / 10;
                answer = answer + nl * ch;
                ch = ch * 10;
            }

            return answer;

        }
    }

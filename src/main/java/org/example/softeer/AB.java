package org.example.softeer;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String k = sc.nextLine();
            String[] array = k.split(" ");
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);
            System.out.println("Case #" + (i + 1) + ":" + " " + (a + b));
        }
    }
}

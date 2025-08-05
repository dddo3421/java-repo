package multiThread.sec02;

import java.awt.Toolkit;

public class BeepPrintEx2 {

    public static void main(String[] args) {
        // 익명 구현 객체를 이용한 스레드 생성
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // 비프음 발생
                    try { Thread.sleep(500); } catch (Exception e) {}
                }
            }
        });

        thread.start(); // 작업 1 스레드 시작

        // 메인 스레드는 동시에 작업 2 수행
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

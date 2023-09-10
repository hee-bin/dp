package BeforeState;

public class SecuritySystem {

    private boolean isDayTime; // 주간 여부를 나타내는 변수

    // 시간 설정 메서드
    public void setClock(int hour) {
        isDayTime = (hour >= 9 && hour <= 17); // 9시부터 17시까지를 주간으로 설정
    }

    // 금고 사용 시 호출되는 메서드
    public void useSafe() {
        if (isDayTime) {
            recordLog("금고 사용 기록");
        } else {
            callSecurityCenter("긴급 상황 발생");
        }
    }

    // 경비 센터에 호출을 보내는 메서드
    private void callSecurityCenter(String message) {
        System.out.println("경비 센터 호출: " + message);
    }

    // 경비 센터에 기록하는 메서드
    private void recordLog(String message) {
        System.out.println("경비 센터 기록: " + message);
    }

    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        int[] hours = {8, 13, 20};
        for (int hour : hours) {
            securitySystem.setClock(hour);
            securitySystem.useSafe();
        }
    }
}

package AfterState;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * SafeFrame 클래스는 경비 시스템을 표현하는 GUI를 제공합니다.
 * @author heebin
 */
public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60); // 현재 시간 표시를 위한 텍스트 필드
    private TextArea textScreen = new TextArea(10, 60); // 경비 센터 출력을 위한 텍스트 에어리어
    private Button buttonUse = new Button("Use the Safe"); // 금고 사용 버튼
    private Button buttonAlarm = new Button("Emergency Alarm"); // 비상벨 버튼
    private Button buttonPhone = new Button("Call"); // 일반 통화 버튼
    private Button buttonExit = new Button("Exit"); // 종료 버튼
    private StateEnum currentState = StateEnum.DAY_STATE; // 현재 상태를 나타내는 열거형 변수

    /**
     * SafeFrame의 생성자입니다.
     *
     * @param title SafeFrame의 타이틀
     */
    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonUse) {
            currentState.getState().doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            currentState.getState().doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            currentState.getState().doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("???");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockString = String.format("Current time is %02d:00", hour);
        System.out.println(clockString);
        textClock.setText(clockString);
        StateTransitionMap transitionMap = new StateTransitionMap();
        StateEnum newState = transitionMap.getStateForHour(hour);
        if (newState != currentState && newState != null) {
            changeState(newState);
            currentState = newState;
        }
    }

    @Override
    public void changeState(StateEnum stateEnum) {
        System.out.println("Change state from " + this.currentState + " to " + stateEnum);
        this.currentState = stateEnum;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}

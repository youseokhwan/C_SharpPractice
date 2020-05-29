# adb_connect.md
MacBook <-> Android Device 무선 연결 및 디버깅을 목표로 adb connect 하는 방법임

### [출처](https://medium.com/@visiodeibc/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%93%A4%EC%9D%84-%EC%9C%84%ED%95%9C-%ED%9C%B4%EB%8C%80%ED%8F%B0-%EB%AC%B4%EC%84%A0-%EC%97%B0%EA%B2%B0-usb%EC%BC%80%EC%9D%B4%EB%B8%94-bye-4bbde9708a51)

### 방법

1. 맥북과 안드로이드 기기를 준비하고 같은 네트워크(Wi-Fi)에 연결

2. 맥북에 ADB(Android Debug Bridge) 설정
    1. Android SDK 설치위치 확인
        - Android Studio 실행
        - Preferences(Cmd+,) > Appearance & Behavior > System Setting > Android SDK > Android SDK Location 항목에서 확인
        - 해당 디렉토리의 platform-tools/에 ADB가 설치되어 있음
        - 작성자 기준 경로: /Users/youseokhwan/Library/Android/sdk/platform-tools/
    2. ~/.zsh_profile 수정
        - nano ~/.zsh_profile
        - PATH에 1번에서 확인한 경로 추가하고 저장
        - source ~/.zsh_profile
        
3. 맥북과 디바이스 USB 케이블 연결

4. Terminal에 "adb tcpip 5555" 입력하여 5555포트 활성화

5. USB 케이블 분리

6. 디바이스의 IP주소 확인
    1. Wi-Fi 메뉴 진입
    2. 현재 연결된 네트워크의 설정창 진입
    3. IP 주소 확인
    
7. Terminal에 "adb connect 192.168.x.x" 입력(확인한 IP주소를 입력)

8. Android Studio에서 무선 디버깅

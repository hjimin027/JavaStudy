# 자바 I/O 스트림
자바에서, File 클래스로 작업하는 것과 I/O 스트림으로 작업하는 것은 큰 차이가 있다.
- File 클래스는 아래 작업들을 거쳐야 한다.
    - 파일이 존재하는가?
    - 해당 파일의 이름이나 사이즈는 얼마인가?
    - 파일과 폴더 생성, 삭제
- 하지만, File 클래스는 파일의 내용을 읽거나 쓰지 않는다.(따로 클래스를 더 사용해야 함)

IO 스트림은 텍스트나 이진 데이터(이미지, 오디오, pdf 등)으로 작업하기 때문에, 더 유연성 있다.

# 스트림 종류 (전송 단위에 따른 분류)
- Byte 스트림
    - raw binary data(미가공 이진 데이터) - 이미지, 오디오, pdf 등
    - 예시: `FileInputStream`, `FileOutputStream`
- Character 스트림(문자 스트림)
    - 텍스트(문자, 문자열), 자동으로 문자 인코딩 처리
    - `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`
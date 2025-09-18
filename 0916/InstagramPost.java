package variable3;

public class InstagramPost {
	
	//변수
String editor; //작성자
String content; //내용


	//생성자
public InstagramPost(String editor, String content) {
	
	this.editor = editor;
	this.content = content;
}
	//작성자와 내용 출력 메서드 : 작성자와 내용 출력해야함
public void insta() {
	System.out.println("작성자:" + editor);
	System.out.println("내용:" + content);
}




}

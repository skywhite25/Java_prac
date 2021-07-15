package ch16JDBC;

public class BoardVO {

	private long no;
	private String title;
	private String content;
	private String writer;
	private String writeDate;
	private long hit;
	
	// 데이터를 가져가는  getter()와 데이터를 넣는 setter()만들기
	public long getNo() {return no;}
	public void setNo(long no) {this.no = no;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title= title;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content= content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	public String getWriteDate() {return writeDate;}
	public void setWriteDate(String writeDate) {this.writeDate= writeDate;}
	public long getHit() {return hit;}
	public void setHit(long hit) {this.hit = hit;}
	
	// 데이터 확인용 메서드
	public String toString() {
		return getClass().getSimpleName() + "[no=" + no +", title=" + title +", content=" + content 
				+ ", writer=" + writer + ", writeDate=" + writeDate + ", hit=" + hit +"]";
	}
	
}

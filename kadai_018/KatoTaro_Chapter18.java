package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	KatoTaro_Chapter18(){
		setGivenName("太郎");
	}
	
	//名を表すフィールドの値をセットする
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
	
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}

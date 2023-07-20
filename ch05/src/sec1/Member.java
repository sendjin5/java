package sec1;

public class Member {

    private String id;
    private String pw;
    private String name;
    private String birth;

    public Member() {this("kyo");}
        public Member(String id) {this(id,"1234");}
            public Member(String id, String pw) {this(id,pw,"jin");}

    public Member(String id, String pw, String name) {this(id,pw,name,"2023-07-14");}

    public Member(String id, String pw, String name, String birth) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.birth = birth;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}

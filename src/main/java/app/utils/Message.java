package app.utils;

public class Message {
	private String status;
    private int code;
    
    public Message() {}
    
    public Message(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
    @Override
    public String toString() {
        return "code: " + getCode() + " status: " + getStatus();
    }
}

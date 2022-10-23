package entities;

public class Educator {
    private int educatorId;
    private String educatorName;
    private String educatorLastName;


    public Educator(int educatorId,String educatorName,String educatorLastName){
        this.setEducatorId(educatorId);
        this.setEducatorName(educatorName);
        this.setEducatorLastName(educatorLastName);
    }

    public int getEducatorId() {
        return educatorId;
    }

    public void setEducatorId(int educatorId) {
        this.educatorId = educatorId;
    }

    public String getEducatorName() {
        return educatorName;
    }

    public void setEducatorName(String educatorName) {
        this.educatorName = educatorName;
    }

    public String getEducatorLastName() {
        return educatorLastName;
    }

    public void setEducatorLastName(String educatorLastName) {
        this.educatorLastName = educatorLastName;
    }
}

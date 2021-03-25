package joseph.basic.day08.hr;

public class Job_History {

    private int employee_id;
    private String start_day;
    private String end_day;
    private String job_id;
    private int department_id;

    public Job_History(int employee_id, String start_day, String end_day, String job_id, int department_id) {
        this.employee_id = employee_id;
        this.start_day = start_day;
        this.end_day = end_day;
        this.job_id = job_id;
        this.department_id = department_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getStart_day() {
        return start_day;
    }

    public void setStart_day(String start_day) {
        this.start_day = start_day;
    }

    public String getEnd_day() {
        return end_day;
    }

    public void setEnd_day(String end_day) {
        this.end_day = end_day;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}

package com.yaswanth.school.student.response;

public class StudentResponse {
    private long id;
    private String name;
    private String standard;
    private String section;

    public StudentResponse(long id, String name, String standard, String section) {
        this.id = id;
        this.name = name;
        this.standard = standard;
        this.section = section;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "StudentResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}

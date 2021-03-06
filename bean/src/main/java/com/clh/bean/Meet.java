package com.clh.bean;

public class Meet {
    private  Integer id;
    private   Integer   code;
    private String name;
    private String start_time;
    private String end_time;
    private String create_time;
    private Integer type;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Meet() {
    }

    public Meet(Integer id, Integer code, String name, String start_time, String end_time, String create_time, Integer type) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.create_time = create_time;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Meet{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", type=" + type +
                '}';
    }
}
